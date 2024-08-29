package gettextfechingpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Ahana Azeez\\OneDrive\\Desktop\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testkru.com/Elements/TextFields");
		
		WebElement element= driver.findElement(By.id("firstNamePlaceholder"));
		System.out.println(element.getText());
		WebElement element2=driver.findElement(By.id("lastNamePlaceholder"));
		System.out.println(element2.getText());
		

	}

}
