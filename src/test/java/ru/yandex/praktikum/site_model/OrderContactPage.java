package ru.yandex.praktikum.site_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    // WebDriver
    private WebDriver webDriver;
    // Web elements
    // First order section "Для кого самокат"
    // Header "Для кого самокат"
    //Поле ввода имени
    private By nameInputField = By.xpath("//div[@class='Order_Form__17u6u']/div[1]/input");
    //Поле ввода фамилии
    private By surnameInputField = By.xpath("//div[@class='Order_Form__17u6u']/div[2]/input");
    //Поле ввода адреса
    private By addressInputField = By.xpath("//div[@class='Order_Form__17u6u']/div[3]/input");
    //Поле ввода телефона
    private By phoneNumberInputField = By.xpath("//div[@class='Order_Form__17u6u']/div[5]/input");
    //Поле выбора станции метро
    private By metroStationField = By.className("select-search__input");
    //Выпадающий список станций метро
    private By metroStationSelector = By.className("select-search__select/*");
    //Кнопка "Далее"
    private final By nextButton = By.xpath("//div[@class='Order_NextButton__1_rCA']/button");
    // Second order section "Про аренду"
    // Header "Про аренду"
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
    private By courierComment = By.xpath("//div[@class='Order_Form__17u6u']/div[4]/input");
    //Order button "Заказать"
    private By orderButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[2]");
    // Confirm order button
    private By yesButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[2]");
    // Order success modal window
    private By successfulWindow = By.className("Order_Modal__YZ-d3");
    // Class constructor
    public OrderPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    // Test methods
    //
    public OrderPage enterName(String name){
        webDriver.findElement(nameInputField).sendKeys(name);
        return this;
    }

    public OrderPage enterSurname(String surname){
        webDriver.findElement(surnameInputField).sendKeys(surname);
        return this;
    }

    public OrderPage enterAddress(String address){
        webDriver.findElement(addressInputField).sendKeys(address);
        return this;
    }

    public OrderPage enterMetroStation(String metroStation){
        webDriver.findElement(metroStationField).sendKeys(metroStation);
        webDriver.findElement(metroStationSelector).click();
        return this;
    }

    public OrderPage enterPhoneNumber(String number){
        webDriver.findElement(phoneNumberInputField).sendKeys(number);
        return this;
    }

    public OrderPage clickOnNextButton(){
        webDriver.findElement(nextButton).click();
        return this;
    }
    // Fill first order section with contact info
    public OrderPage fillInOrderContactInfo(String name, String surname,
                                       String address, String metroStation, String number){
        enterName(name);
        enterSurname(surname);
        enterAddress(address);
        enterMetroStation(metroStation);
        enterPhoneNumber(number);
        return this;
    }
    // Fill second order section with rent info
    public OrderPage fillInOrderRentInfo(String name, String surname,
                                     String address, String metroStation, String number){
        enterName(name);
        enterSurname(surname);
        enterAddress(address);
        enterMetroStation(metroStation);
        enterPhoneNumber(number);
        return this;
    }
}
