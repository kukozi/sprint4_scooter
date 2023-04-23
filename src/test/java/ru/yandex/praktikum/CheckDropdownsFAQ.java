package ru.yandex.praktikum;

import org.junit.Test;
import ru.yandex.praktikum.site_model.MainPageFAQ;
import ru.yandex.praktikum.site_model.MainPageUp;

public class CheckDropdownsFAQ extends TestMain {
    @Test
    public void checkMainPage() {
        new MainPageUp(webDriver)
                .openMainPage()
                .closeCookieWindow()
                .scrollMainPageToFAQPage();
        new MainPageFAQ(webDriver).isHiddenElementsDisplayedOnClick();
    }
}