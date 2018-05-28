package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LoginPage;

public class LinguaLeoLoginTest {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        LoginPage loginPage = new LoginPage(driver);

        driver.get("https://lingualeo.com/ru#welcome");
        driver.findElement(By.id("headEnterBtn")).click();

        loginPage.enterEmail("ol4ik.kim17@gmail.com");
        loginPage.enterPassword("automation");
        loginPage.clickSendButton();

        //Wait for 5 Sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
