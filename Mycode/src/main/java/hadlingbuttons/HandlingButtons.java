package hadlingbuttons;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		//Get the X & Y co-ordinates
		WebElement Ele = driver.findElementById("position");
		Point point = Ele.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("x => " +x +" y =>" +y);
		//Find the color of the button
		WebElement btnColor = driver.findElementById("color");
		String color = btnColor.getCssValue("background-color");
		System.out.println(color);
	
		//Find the height & width of the button
		Rectangle rect = driver.findElementById("property").getRect();
		System.out.println(rect.getWidth());
		System.out.println(rect.getHeight());
		System.out.println(rect.getPoint());
		
		Dimension dime = rect.getDimension();
		System.out.println(dime);
		System.out.println(dime.getWidth());
		System.out.println(dime.getHeight());
		
		//Confirm button is disabled
		
		Boolean isDisabled = driver.findElementById("isDisabled").isEnabled();
		System.out.println(isDisabled);
		
		
		driver.quit();

	}

}
