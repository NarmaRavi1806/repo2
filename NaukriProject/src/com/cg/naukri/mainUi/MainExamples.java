package com.cg.naukri.mainUi;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MainExamples {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		driver.get("http://www.redbus.in");
        WebElement rFrom= driver.findElement(By.id("src"));
        rFrom.sendKeys("Bangalore");
        rFrom.sendKeys(Keys.TAB);
        WebElement rTo= driver.findElement(By.id("dest"));
        rTo.sendKeys("Chennai");
        rTo.sendKeys(Keys.TAB);
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("25")));
        WebElement fDate= driver.findElement(By.id("onward_cal"));
        List <WebElement> lftDate= fDate.findElements(By.tagName("table"));
        for(WebElement fdTable:lftDate)
        {
        fdTable.findElement(By.linkText("25")).click();
        break;
        }

		/*driver.get("http://www.redbus.in");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("//*[@id=\"src\"]"))
		.sendKeys("Bangalore");
		driver.findElement(
				By.xpath("//html/body/center/div[3]/div[4]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/input"))
		.sendKeys("Chennai");
		driver.findElement(
				By.xpath("//html/body/center/div[3]/div[4]/div[3]/div[1]/div[2]/div[2]/div[1]/img"))
		.click();
		driver.findElement(
				By.xpath("//html/body/center/div[3]/div[4]/div[3]/div[1]/div[2]/div[2]/div[1]/div/div/div[1]/table/tbody/tr[5]/td[6]/a"))
		.click();
		driver.findElement(
				By.xpath("//html/body/center/div[3]/div[4]/div[3]/div[1]/div[2]/div[2]/div[2]/img"))
		.click();
		driver.findElement(
				By.xpath("html/body/center/div[3]/div[4]/div[3]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/table[1]/tbody/tr[5]/td[7]/a"))
		.click();
		driver.findElement(
				By.xpath("//html/body/center/div[3]/div[4]/div[3]/div[1]/div[2]/div[3]/a"))
		.click();
		driver.findElement(
				By.xpath("//html/body/center/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/table/tbody[1]/tr[3]/td[7]/div/div[1]"))
		.click();
		driver.findElement(
				By.xpath("//html/body/center/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/table/tbody[2]/tr/td/div/div[1]/div/div[3]/div[2]/div[2]/div[8]/a"))
		.click();

		Select make = new Select(
				driver.findElement(By
						.xpath("html/body/center/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/table/tbody[2]/tr/td/div/div[1]/div/div[3]/div[4]/select")));
		make.selectByIndex(1);

		driver.findElement(
				By.xpath("html/body/center/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/table/tbody[2]/tr/td/div/div[1]/div/div[3]/div[3]/a"))
		.click();
		driver.findElement(
				By.xpath("html/body/center/div[3]/div[4]/div[1]/div[1]/div[3]/div[3]"))
		.click();
		driver.findElement(
				By.xpath("html/body/center/div[3]/div[4]/form[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div/ul/li[1]/input"))
		.sendKeys("Test user");
		driver.findElement(
				By.xpath("html/body/center/div[3]/div[4]/form[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div/ul/li[2]/input[2]"))
		.click();
		driver.findElement(
				By.xpath("html/body/center/div[3]/div[4]/form[1]/div[3]/div[1]/div[1]/div[1]/div[12]/div[1]/div[1]/input"))
		.click();
		driver.findElement(
				By.xpath("html/body/center/div[3]/div[4]/form[1]/div[3]/div[1]/div[4]/div[2]/div/ul/li[4]/a"))
		.click();*/
	}

}
