package navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigationCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		//Goto Home and come back here using driver command
		String url = driver.getCurrentUrl();
		System.out.println("Button page URL"+ url);
		driver.findElementById("home").click();
		String homeURL = driver.getCurrentUrl();
		System.out.println("Home page URL"+ homeURL);
		driver.navigate().back();
		System.out.println("Return to button page"+driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.navigate().to("https://letcode.in/signin");
		driver.quit();

	}

}
