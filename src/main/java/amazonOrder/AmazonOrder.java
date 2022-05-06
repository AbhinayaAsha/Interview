package amazonOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosie\\Desktop\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Legends Of Zelda Socks");
		//Send Enter button
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'Legend of Zelda Triforce Wings Logo Five Pack Casual Crew Socks')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name = \"submit.add-to-cart\"]")).click();
		driver.findElement(By.xpath("//*[@name=\"proceedToRetailCheckout\"]")).click();
	}
}