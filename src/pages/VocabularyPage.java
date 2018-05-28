package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VocabularyPage {

    public VocabularyPage(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver driver;
    String vocabularyButtonXPath = "//*[@data-a-target='topmenu-dict']";

    String searchWordXPath = "//*[@name='search']";
    String addButtonXPath =  "//*[@class='icon-add-meat-d']";
    String makeChoice = "//*[@data-tran='утверждать, заявлять']"; //"//div[@data-tran-item]";

    //методы по взаимодействию элементов
    public void clickVocabularyButton () {
        driver.findElement(By.xpath(vocabularyButtonXPath)).click();
    }

    public void enterWord (String word) {
        driver.findElement(By.xpath(searchWordXPath)).sendKeys(word);
    }

    public void clickAddButton () {
        driver.findElement(By.xpath(addButtonXPath)).click();
    }

    public void clickChoice () {
        driver.findElement(By.xpath(makeChoice)).click();
    }
}
