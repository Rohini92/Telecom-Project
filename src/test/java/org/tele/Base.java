package org.tele;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Base {
		public static WebDriver driver;
	
		public static void Launch(String Url) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Rohini\\TelecomProject\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(Url);
		}
		public static void type(WebElement Ele,String Name) {

		Ele.sendKeys(Name);
		}
		public static void Click(WebElement Ele) {
			
		Ele.click();
		}
		public static void Close()
		{
			driver.close();
		}
		public static void Quit()
		{
			driver.quit();
		
		}

	}
			
