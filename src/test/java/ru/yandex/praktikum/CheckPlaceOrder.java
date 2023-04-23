package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.site_model.MainPageUp;

@RunWith(Parameterized.class)
public class CheckPlaceOrder extends TestMain {
    private final String surnameInput;
    private final String nameInput;
    private final String addressInput;
    private final String metroStation;
    private final String numberInput;
    private final String rentDate;
    private final int rentPeriod;
    private final int colorSelect;
    private final String comment;

    public CheckPlaceOrder(String nameInput,
                            String surnameInput,
                            String addressInput,
                            String metroStation,
                            String numberInput,
                            String rentDate,
                            int rentPeriod,
                            int colorSelect,
                            String comment) {
        this.nameInput = nameInput;
        this.surnameInput = surnameInput;
        this.addressInput = addressInput;
        this.metroStation = metroStation;
        this.numberInput = numberInput;
        this.rentDate = rentDate;
        this.rentPeriod = rentPeriod;
        this.colorSelect = colorSelect;
        this.comment = comment;
    }

    @Parameterized.Parameters (name = "Детали заказа. Тестовые данные: {0} {1} {2}")
    public static Object[][] getUserData() {
        return new Object[][]{
                {"Горячев", "Михаил", "Сущёвский вал, д.13 1", "Савёловская", "+79999999999",
                        "28.04.2023", 1, 0, "Протереть ручки самоката"},
                {"Стэп", "Тренер", "3-я Филёвская, д.10", "Багратионовская", "89995555555",
                        "03.08.2023", 0, 0, "Положить на газон"},
                {"Горшенёв", "Алексей", "Староваганьковский пер., д. 19, стр. 2", "Арбатская", "89990000000",
                        "16.07.2023", 0, 1, "И бутылку рома"},
        };
    }

    @Test
    public void scooterOrderCheckWithTopButton(){
        new MainPageUp(webDriver)
                .openMainPage()
                .clickTopOrderButton()
                .waitForLoadHeader()
                .fillInOrderContactInfo(nameInput, surnameInput, addressInput, metroStation, numberInput)
                .clickOnNextButton()
                .fillInOrderRentInfo(rentDate, rentPeriod, colorSelect, comment)
                .clickOrderButton()
                .clickYesButton();
    }

    @Test
    public void scooterOrderCheckWithLowerButton(){
        new MainPageUp(webDriver)
                .openMainPage()
                .scrollMainPageToFAQPage()
                .clickLowerOrderButton()
                .fillInOrderContactInfo(nameInput, surnameInput, addressInput, metroStation, numberInput)
                .clickOnNextButton()
                .fillInOrderRentInfo(rentDate, rentPeriod, colorSelect, comment)
                .clickOrderButton()
                .clickYesButton();
    }
}