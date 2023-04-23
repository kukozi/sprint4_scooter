package ru.yandex.praktikum.site_model;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TrackPage {
    // WebDriver
    private WebDriver webDriver;
    // Web elements
    // Field for track number input
    private By trackInputField = By.className("Track_Input__1g7lq");
    // Order Not Found board
    private By notFoundBoard = By.className("Track_NotFound__6oaoY");
    // List with order details
    private By orderInfoList = By.className("Track_OrderColumns__2r_1F");
    private List<By> listOfLocator = Arrays.asList(By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[1]/div[2]"), // name
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[2]/div[2]"),     // surname
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[3]/div[2]"),     // address
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[4]/div[2]"),     // metro station
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[5]/div[2]"),     // phone number
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[7]/div[2]"),     // delivery date
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[8]/div[2]"),     // delivery duration
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[10]/div[2]"),    // color
            By.xpath("//div[@class = 'Track_OrderInfo__2fpDL']/div[11]/div[2]"));    // comment
    // Test constructor
    public TrackPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    // Test methods
    // Check that Order page has active Order info
    public void checkOrderIsActive(Boolean isFound){
        // Check whether Not Found message is displayed
        Boolean board = !(webDriver.findElements(notFoundBoard).isEmpty());
        // Check whether Order Info table is displayed
        Boolean table =  !(webDriver.findElements(orderInfoList).isEmpty());
        Boolean isNotFoundVisible = board && table;
        Assert.assertEquals(isFound, isNotFoundVisible);
    }
}
