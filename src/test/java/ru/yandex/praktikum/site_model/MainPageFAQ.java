package ru.yandex.praktikum.site_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

public class MainPageFAQ {
    private final WebDriver webDriver;
    // Dropdowns with FAQ
    By listWithDropDowns = By.xpath("//div[@class='Home_FAQ__3uVm4']/div/*");
    // List of locators of FAQ dropdowns
    List<By> listOfFAQs = Arrays.asList(By.id("accordion__panel-0"),
            By.id("accordion__panel-1"),
            By.id("accordion__panel-2"),
            By.id("accordion__panel-3"),
            By.id("accordion__panel-4"),
            By.id("accordion__panel-5"),
            By.id("accordion__panel-6"),
            By.id("accordion__panel-7"));

    public MainPageFAQ(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    // Cycle through FAQs dropdowns
    public MainPageFAQ isHiddenElementsDisplayedOnClick() {
        List<WebElement> listOfElements = webDriver.findElements(listWithDropDowns);
        for (int i = 0; i < listOfElements.size(); i++) {
            listOfElements.get(i).click();
            boolean isDisplayed = webDriver.findElement(listOfFAQs.get(i)).isDisplayed();
            new WebDriverWait(webDriver, 3)
                    .until(ExpectedConditions.visibilityOf(webDriver.findElement(listOfFAQs.get(i))));
        }
        return this;
    }
}
