package ru.yandex.praktikum.site_model;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Iterator;
import java.util.Set;

public class MainPageUp {
    // WebDriver
    private WebDriver webDriver;
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
    public MainPageUp(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    // Test methods
    // Get main page
    public MainPageUp openMainPage() {
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
        return this;
    }
    // Close popup cookies window
    public MainPageUp closeCookieWindow() {
        webDriver.findElement(closeCookiesWindow).click();
        return this;
    }
    // Scroll to the bottom of the main page
    public MainPageFAQ scrollMainPageToFAQPage() {
        WebElement element = webDriver.findElement(listOfFAQs);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        return new MainPageFAQ(webDriver);
    }
    // Click on Yandex logo and follow to dzen.ru
    public void clickYandexLogo() {
        String correctUrl = "https://dzen.ru/?yredirect=true";
        String mainWindowHandle = webDriver.getWindowHandle();
        Set<String> setOfChildWindow = webDriver.getWindowHandles();
        Iterator<String> itr = setOfChildWindow.iterator();
        while (itr.hasNext()) {
            String ChildWindow = itr.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                webDriver.switchTo().window(ChildWindow);
                String pageUrl = webDriver.getCurrentUrl();
                Assert.assertEquals(correctUrl, pageUrl);
            }
        }
    }
    // Click on Scooter logo to go to main Scooter page
    public void clickScooterLogo() {
        String correctUrl = "https://qa-scooter.praktikum-services.ru/";
        webDriver.findElement(scooterLogo).click();
        String pageUrl =  webDriver.getCurrentUrl();
        Assert.assertEquals(correctUrl, pageUrl);
    }
    // Click top order "Заказать" button
    public OrderContactPage clickTopOrderButton() {
        webDriver.findElement(lowerOrderButton).click();
        return new OrderContactPage(webDriver);
    }
    // Click lower order "Заказать" button
    public OrderContactPage clickLowerOrderButton(){
        webDriver.findElement(lowerOrderButton).click();
        return new OrderContactPage(webDriver);
    }
}
