package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		File firstSrc = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img1.png");
		FileHandler.copy(firstSrc, dest);
		WebElement ele = driver.findElementById("home");
		File eleSrc = ele.getScreenshotAs(OutputType.FILE);
		File eledest = new File("./snaps/img2.png");
		FileHandler.copy(eleSrc, eledest);
		WebElement info = driver.findElementByClassName("card-content");
		eleSrc = info.getScreenshotAs(OutputType.FILE);
		eledest = new File("./snaps/img2.png");
		FileHandler.copy(eleSrc, eledest);
		driver.quit();

	}

}
