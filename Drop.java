package Automation.com;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
	public static void main(String[] args) {
		
		System.setProperty("wedriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement cre = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
		cre.click();
		WebElement mon = driver.findElement(By.xpath("//select[@id ='month']"));
	Select se = new Select(mon);
//		se.selectByIndex(1);
//		WebElement sel = se.getFirstSelectedOption();
//		System.out.println(sel.getText());
//	List<WebElement> op = se.getOptions();
//	for (WebElement webElement : op) {
//		System.out.println(webElement.getText());
//		
//	}
////		
//	}
	boolean mul = se.isMultiple();
	System.out.println(mul);
	}

}
