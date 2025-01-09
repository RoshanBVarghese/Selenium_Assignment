package assignment_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;
	//int a;
	public void intializebrowser() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize(); //window maxi
		//a = 10;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		base.intializebrowser();
	}

}