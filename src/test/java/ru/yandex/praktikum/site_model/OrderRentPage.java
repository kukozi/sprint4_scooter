package ru.yandex.praktikum.site_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
public class OrderRentPage {
    // WebDriver init
    private WebDriver webDriver;
    // Web elements
    // Second order section "Про аренду"
    // Header "Про аренду"
    private By headerAboutRent = By.xpath("//div[text() = 'Про аренду']");
    // Delivery date selector (datepicker)
    private By scooterRentalDate =By.xpath("//div[@class='react-datepicker__input-container']/input");
    // Rent duration field (dropdown)
    private By rentalPeriod = By.xpath("//div[@class='Dropdown-control']/div[1]");
    // Rent duration dropdown selector
    private By rentalPeriodChoice = By.xpath("//div[@class='Dropdown-menu']/*");
    // Scooter color picker boxes
    private By colorCheckboxSelector = By.xpath("//div[@class='Order_Checkboxes__3lWSI']/label");
    // Comments for courier field
    private By courierComment = By.xpath("//div[@class='Order_Form__17u6u']/div[4]/input");
    //Order button "Заказать"
    private By orderButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[2]");
    // Confirm order button
    private By yesButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[2]");
    // Order success modal window
    private By successfulWindow = By.className("Order_Modal__YZ-d3");
    // Class constructor
    public OrderRentPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    // Fill second order section with rent info
    public OrderRentPage setDateOfRent(String rentDate){
        webDriver.findElement(scooterRentalDate).sendKeys(rentDate);
        webDriver.findElement(headerAboutRent).click();
        return this;
    }
    // Set rental period
    public OrderRentPage setRentalPeriod(int period){
        webDriver.findElement(rentalPeriod).click();
        List<WebElement> listOfElements = webDriver.findElements(rentalPeriodChoice);
        listOfElements.get(period).click();
        return this;
    }
    // Set scooter color for the order
    public OrderRentPage setScooterColor(int colorNumber){
        List<WebElement> listOfColor = webDriver.findElements(colorCheckboxSelector);
        listOfColor.get(colorNumber).click();
        return this;
    }
    // Add comment to the order info
    public OrderRentPage setCourierComment(String comment){
        webDriver.findElement(courierComment).sendKeys(comment);
        return this;
    }
    // Wait for the Place Order page to be opened
    public OrderRentPage waitForLoadHeader(){
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(headerAboutRent));
        return this;
    }
    // Fill info fields in Rent Info section
    public OrderRentPage fillInOrderRentInfo(String rentDate, int period, int colorNumber, String comment){
        setDateOfRent(rentDate);
        setRentalPeriod(period);
        setScooterColor(colorNumber);
        setCourierComment(comment);
        return this;
    }
    public OrderRentPage clickOrderButton() {
        webDriver.findElement(orderButton).click();
        return this;
    }
    public OrderRentPage clickYesButton() {
        webDriver.findElement(yesButton).click();
        return this;
    }
}
