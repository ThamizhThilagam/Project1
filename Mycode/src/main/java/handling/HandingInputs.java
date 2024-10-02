package handling;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandingInputs {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/edit");
		//Enter name
		driver.findElementById("fullName").sendKeys("Thamizh");
		//append value and press keyboard tab
		driver.findElementById("join").sendKeys(" person", Keys.TAB);
		//What is inside the text box
		String myValue = driver.findElementById("getMe").getAttribute("value");
		System.out.println(myValue);
		//Clear the text
		driver.findElementById("clearMe").clear();
		//Confirm edit field is disabled
		Boolean isEdit = driver.findElementById("noEdit").isEnabled();
		System.out.println(isEdit);
		//Confirm text is read only
		String isReadOnly = driver.findElementById("dontwrite").getAttribute("readonly");
		System.out.println(isReadOnly);
		driver.quit();

	}

}
