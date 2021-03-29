package StepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Steps {
	
	WebDriver driver;
	
	@Given("user navigates to login page")
	public void user_navigates_to_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChintalapatiRaasi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    driver.get("http://elearningm1.upskills.in/");
	    Thread.sleep(5000);
	 
	}
	
	@When("user clicks on singup")
	public void user_clicks_on_singup() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		//driver.findElement(By.linkText(" Sign up! ")).click();
		driver.findElement(By.linkText("Sign up!")).click();
		//driver.findElement(By.xpath("//*[@id=\"login-block\"]/div/ul/li[1]/a")).click();
		
		Thread.sleep(3000);
	}
	
	@When("user enter Firstname {string} and Lastname {string}")
	public void user_enter_firstname_and_lastname(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("registration_firstname")).sendKeys(string);
		driver.findElement(By.id("registration_lastname")).sendKeys(string2);
		
	}

	@When("user enter Mail {string} and User {string}")
	public void user_enter_mail_and_user(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   
		driver.findElement(By.id("registration_email")).sendKeys(string);
		driver.findElement(By.id("username")).sendKeys(string2);
		
	}
	
	@When("user enter Password {string} and ConfPasswd {string}")
	public void user_enter_password_and_conf_passwd(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.findElement(By.id("pass1")).sendKeys(string);
		driver.findElement(By.id("pass2")).sendKeys(string2);
		
	}
	

	@When("click on register button")
	public void click_on_register_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		
		// driver.findElement(By.id("registration_submit")).click();
		 Thread.sleep(3000);
		driver.get("http://elearningm1.upskills.in/main/admin/index.php");
		driver.findElement(By.id("formLogin_login")).sendKeys("qwe1");
		driver.findElement(By.id("formLogin_password")).sendKeys("qwe1");
		driver.findElement(By.xpath("//*[@id=\"formLogin_submitAuth\"]")).click(); 
		
		
	}
	
	@Then("user should view confirmation message {string}")
	public void user_should_view_confirmation_message(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
		// String Expected = driver.findElement(By.id("//*[@id=\"cm-content\"]/div/div[2]/div/p[1]")).getText();
		String Expected = "Dear qwe1 asd1, Your personal settings have been registered.";
	    
		System.out.println(string);
		System.out.println(Expected);
		
		Thread.sleep(2000);
	    Assert.assertEquals(string, Expected);
		
	//	driver.get("http://elearningm1.upskills.in/main/admin/index.php");
	//	driver.findElement(By.id("formLogin_submitAuth")).click();  
	    
	}
	
	@Then("click on user dropdown")
	public void click_on_user_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a")).click();
	    
	}
	
	@Then("validate the user {string} and mail {string}")
	public void validate_the_user_and_mail(String string, String string2) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		String Expected = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/div/a/p")).getText();
		Assert.assertEquals(Expected, string);
		String Expected2 = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/div/p")).getText();
		Assert.assertEquals(Expected2, string2);
	
		Thread.sleep(4000);
		
		System.out.println(Expected);
		System.out.println(Expected2);
		
	//	driver.get("http://elearningm1.upskills.in/index.php");
	//	driver.findElement(By.xpath("//*[@id=\"profile_block\"]/div[1]/a")).click();
		
		
	}
	
	@Then("close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	    
	}
	
	
	@Given("user logins and click on compose button")
	public void user_logins_and_click_on_compose_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ChintalapatiRaasi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    
		    driver = new ChromeDriver();
		    driver.get("http://elearningm1.upskills.in/");
		    Thread.sleep(4000);
			System.out.println("Hello");
			
			Thread.sleep(4000);

			driver.findElement(By.id("login")).sendKeys("qwe1");
			driver.findElement(By.id("password")).sendKeys("qwe1");
			driver.findElement(By.id("form-login_submitAuth")).click();
		
			Thread.sleep(4000);
			driver.get("http://elearningm1.upskills.in/index.php");
			Thread.sleep(4000); 
			driver.findElement(By.linkText("Profile")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Compose")).click();
	    
			
	}
	@When("user enter Id {string}")
	public void user_enter_id(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions Profile  
		
		
		driver.findElement(By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys(string);
		//driver.get("https:facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"select2-compose_message_users-results\"]/li[1]")).click();
		Thread.sleep(2000);
	} 
	
	@When("user enter Subject {string} and Desc {string}")
	public void user_enter_subject_and_desc(String string, String string2) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("compose_message_title")).sendKeys(string);
		Thread.sleep(6000);
	   
		driver.findElement(By.xpath("//html/body")).sendKeys("string2");		
		
	}
	@When("click on send")
	public void click_on_send() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("compose_message_compose")).click();
	}
	@Then("validate the acknowledgement {string}")
	public void validate_the_acknowledgement(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		String message = driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div[1]")).getText();
		System.out.println(string);
		System.out.println(message);
		Assert.assertEquals(message, string);
	}
}
