package ru.yandex.praktikum.site_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Iterator;
import java.util.Set;

public class MainPageUp {
    // WebDriver
    private WebDriver driver;
    // Web elements
    // Top "Заказать" button
    private By topOrderButton = By.className("Button_Button__ra12g");
    // Lower "Заказать" button
    private By lowerOrderButton = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    // Cookies window's "да все привыкли" button
    private By closeCookiesWindow = By.className("App_CookieButton__3cvqF");
    // "Самокат" logo
    private By scooterLogo = By.className("Header_LogoScooter__3lsAR");
    // "Яндекс" logo
    private By yandexLogo = By.className("Header_LogoYandex__3TSOI");
    // Dropdowns with FAQs
    private By listOfFAQs = By.xpath("//div[@class='Home_FAQ__3uVm4']/div/*");
    // Track order button "Статус заказа"

    // Class constructor
    public MainPageUp(WebDriver driver){
        this.driver = driver;
    }
    // Test methods
    public MainPageUp openMainPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        return this;
    }
    public MainPageUp closeCookieWindow() {
        driver.findElement(closeCookiesWindow).click();
        return this;
    }
    public MainPageUp scrollMainPageToFAQPage() {
        WebElement element = driver.findElement(listOfFAQs);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        return this;
    }
    public MainPageUp isHiddenElementDisplayedAfterClick() {

        return this;
    }
}
