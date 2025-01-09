package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Textbox extends Base{

	public void textBox() {
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement text = driver.findElement(By.xpath("//input[@id='userName']"));
		text.sendKeys("Roshan");
		
		WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
		button.click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Textbox textbox = new Textbox();
		textbox.intializebrowser();
		textbox.textBox();
	}

}
