package ru.yandex.praktikum;

import org.junit.Test;
import ru.yandex.praktikum.site_model.MainPageUp;
import ru.yandex.praktikum.site_model.MainPageFAQ;
import java.util.concurrent.TimeUnit;

public class CheckDropdownsFAQ extends TestMain {
    @Test
    public void checkMainPage(){
        new MainPageUp(webDriver)
                .openMainPage()
                .closeCookieWindow()
                .scrollMainPageToFAQPage();
        new MainPageFAQ(webDriver).isHiddenElementsDisplayedOnClick();
    }
}