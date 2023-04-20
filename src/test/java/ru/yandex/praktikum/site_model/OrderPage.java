package ru.yandex.praktikum.site_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    // WebDriver
    private WebDriver driver;
    // Web elements
    //Header "Про аренду"
    private By headerAboutRent = By.className("Order_Header__BZXOb");
    // Delivery date selector (datepicker)
    private By scooterRentalDate =By.xpath("//div[@class='react-datepicker__input-container']/input");
    // Rent duration field (dropdown)
    private By rentalPeriod = By.xpath("//div[@class='Dropdown-control']/div[1]");
    // Rent duration dropdown selector
    private By rentalPeriodChoice = By.xpath("//div[@class='Dropdown-menu']/*");
    // Scooter color picker boxes
    private By colorChoice = By.xpath("//div[@class='Order_Checkboxes__3lWSI']/label");
    // Comments for courier field
    private By commentForTheCourier = By.xpath("//div[@class='Order_Form__17u6u']/div[4]/input");
    //Order button "Заказать"
    private By orderButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[2]");
    // Confirm order button
    private By yesButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[2]");
    // Order success modal window
    private By successfulWindow = By.className("Order_Modal__YZ-d3");
    // Class constructor
    public OrderPage(WebDriver driver){
        this.driver = driver;
    }
    // Test methods
}
