package blazedemopkg;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class Blazedemo {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Ahana Azeez\\OneDrive\\Desktop\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		WebElement element= driver.findElement(By.xpath("//h2[contains(text(),'Choose your departure city:')]"));
		System.out.println(element.getText());
		Select place= new Select(driver.findElement(By.xpath("//body/div[3]/form[1]/select[1]")));
		place.selectByValue("Paris");
		
		WebElement element2= driver.findElement(By.xpath("//h2[contains(text(),'Choose your destination city:')]"));
		System.out.println(element2.getText());
		Select destination=new Select(driver.findElement(By.xpath("//body/div[3]/form[1]/select[2]")));
		destination.selectByValue("Rome");
		
		driver.findElement(By.xpath("//body/div[3]/form[1]/div[1]/input[1]")).click();
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
		
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("ahana");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("nanethanhouse perumbavoor");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("ernakulam");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("kerala");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("683543");
		
		Select visa=new Select(driver.findElement(By.xpath("//select[@id='cardType']")));
		visa.selectByValue("amex");
		
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2024");
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("afeef");
		
		driver.findElement(By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]")).click();
		

		Screenshot screen=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
		ImageIO.write(screen.getImage(), "png",new File("C:\\Users\\Ahana Azeez\\OneDrive\\Documents\\blazedemoimg.png"));
		System.out.println("blazedemo screen shot captured");
		
		
	
	}

}
