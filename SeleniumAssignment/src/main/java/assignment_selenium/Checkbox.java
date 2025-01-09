package assignment_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends Base {
	
	public void checkBox() {
		driver.navigate().to("https://demoqa.com/checkbox");
		WebElement check = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
		check.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkbox checkbox = new Checkbox();
		checkbox.intializebrowser();
		checkbox.checkBox();

	}

}
