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
    // A List of Order information entries
    private List<By> listOfLocator = Arrays.asList(By.xpath(
            "//div[@class = 'Track_OrderInfo__2fpDL']/div[@class = 'Track_Row__1sN1F']/div[2]"));
            // [0] name
            // [1] surname
            // [2] address
            // [3] metro station
            // [4] phone number
            // [5] delivery date
            // [6] delivery duration
            // [7] color
            // [8] comment

    // Test constructor
    public TrackPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    // Test methods
    // Check that Order page has active Order info
    public void checkOrderIsActive(Boolean isFound) {
        // Check whether Not Found message is displayed
        Boolean board = !(webDriver.findElements(notFoundBoard).isEmpty());
        // Check whether Order Info table is displayed
        Boolean table = !(webDriver.findElements(orderInfoList).isEmpty());
        Boolean isNotFoundVisible = board && table;
        Assert.assertEquals(isFound, isNotFoundVisible);
    }
}
