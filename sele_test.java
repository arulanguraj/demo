package edureka_demo.addressbook_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * UI Automation script for testing Addressbook web app
 */

public class App 
{
	public static void main( String[] args )
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new ChromeDriver(chromeOptions);
		String url = "http://192.168.137.128:3001/";

		System.out.println("Hitting the endpoint : " + url);
		driver.get(url);

		String Name = "arula";
		String Passwd = "12345";
		

		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			// driver.findElement(By.className("v-button")).click();

			// Thread.sleep(2000);
		//	driver.findElement(By.id("gwt-uid-5")).sendKeys(firstName);
			driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[1]/div[2]/input")).sendKeys(Name);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[1]/div[4]/input")).sendKeys(Passwd);
			Thread.sleep(2000);
			driver.findElement(By.className("btn btn-primary")).click();
			System.out.println("Automation completed..");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();
	}
}