package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Andrei.Marincas/Downloads/drawableSelenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        WebElement title=driver.findElement(By.xpath("//h1[contains(@class,'entry-title')]"));
        System.out.println(title.getText());

        WebElement frame=driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);

        WebElement squareFrom=driver.findElement(By.xpath("//div[contains(@id,'draggable')]"));
        WebElement squareDestination=driver.findElement(By.xpath("//div[contains(@id,'droppable')]"));

        //Using Action class for drag and drop.
        Actions act=new Actions(driver);

        //Dragged and dropped.
        act.dragAndDrop(squareFrom, squareDestination).build().perform();




    }
}