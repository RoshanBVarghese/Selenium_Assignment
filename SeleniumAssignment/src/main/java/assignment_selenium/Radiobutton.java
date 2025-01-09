package assignment_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Radiobutton extends Base{

	public void radioButton() {
		driver.navigate().to("https://demoqa.com/radio-button");
		WebElement radio = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		radio.click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Radiobutton radiobutton = new Radiobutton();
		radiobutton.intializebrowser();
		radiobutton.radioButton();
	}

}
