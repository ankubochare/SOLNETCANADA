package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ITCounsultant {
	WebDriver driver;
@BeforeMethod
	
	public void set()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, options);

	 driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	@Test
	public void London() throws InterruptedException {
		
		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in london ontario");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		
		WebElement solnet=driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]"));
		solnet.click();
		
		js.executeScript("window.scrollBy(0,2500)");
		
		
		Thread.sleep(3000);
		
		}
	@Test
	public void bellevilleTest() throws InterruptedException
	{
		
		

		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in belleville ontario");
		a.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();
		
		
		
		//Assert.assertTrue(driver.findElement(By.linkText("IT, Internet, Security, Camera and Cabling in Brantford ...")).click());

		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();
		
		js.executeScript("window.scrollBy(0,2500)");
		
		
		Thread.sleep(3000);
	
	}
	@Test
	public void brandfordtest() throws InterruptedException {

	
		

		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in brantford ontario");
		a.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();
		
		
		js.executeScript("window.scrollBy(0,2500)");
		
		
		Thread.sleep(3000);
	
	}
	@Test
	public void chatham() {

	
		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in chatham ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	

	}
	@Test
	public void Collingwood() {

	
		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in Collingwood ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
	
	

	}
	@Test
	public void cornwall() {

	
		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in cornwall ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	

	}
	@Test
	public void georgetown() {

		
		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in georgetown ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		

	}
	@Test
	public void guelph() {
		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in guelph ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	

	}
	@Test
	public void hamilton() {

		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in hamilton ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	

	}
	@Test
	public void kanata() {


		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in kanata ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	

	}
	@Test
	public void kingston() {

		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in kingston ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		

	}
	@Test
	public void kitchener() {

		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in kitchener ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	

	}
	@Test
	public void leamington() {
		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in leamington ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
	
	

	}
	@Test
	public void london() {

		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in london ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
	
	

	}
	@Test
	public void milton() {

		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in milton ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	

	}
	@Test
	public void niagarafalls() {
		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in niagarafalls ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	

	}
	@Test
	public void northBay() {
		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in northBay ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
	

	}
	@Test
	public void orangeville() {

		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in orangeville ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
	

	}
	@Test
	public void orillia() {

		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in orillia ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	

	}
	@Test
	public void oshawa() {

		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in oshawa ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
	
	

	}
	@Test
	public void peterbotough() {

		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in peterbotough ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	

	}
	@Test
	public void sarnia() {

		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in sarnia ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	

	}
	@Test
	public void SaultsteMarie() {

		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in Sault ste Marie ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
	
	

	}
	@Test
	public void stThomas() {

		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in st Thomas ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
	
	

	}
	@Test
	public void stratford() {
		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in stratford ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	

	}
	@Test
	public void sudbury() {

		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in sudbury ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
	}
	@Test
	public void tunderBay() {


		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in tunderBay ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
	
	}
	@Test
	public void toronto() {

		
		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in toronto ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
	}
	@Test
	public void waterloo() {

		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in waterloo ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
	}
	@Test
	public void welland() {

		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in welland ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	}
	@Test
	public void windsor() {

		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in windsor ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	}
	@Test
	public void woodstock() {

	WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in woodstock ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		
		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	}
	@Test
	public void Ottawatest() {

		WebElement a = driver.findElement(By.xpath("//textarea[@name='q']"));
		a.sendKeys("IT Consultant in ottawa ontario solnetcanada");
		a.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		// driver.findElement(By.xpath("(//input[@value='Google Search' and
		// @type='submit'])[2]")).click();

		//driver.findElement(By.xpath(
		//		"//a[@href='https://solnetcanada.com/service-area/security-camera-structured-cabling-it-wireless-network-security-broadband-internet-voip-in-london-ontario.html']"))
		//		.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Solnet Canada')][1]")).click();

		js.executeScript("window.scrollBy(0,2500)");
		
		
	

	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
