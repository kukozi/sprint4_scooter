package ru.yandex.praktikum;

import org.junit.Test;
import ru.yandex.praktikum.site_model.MainPageUp;
public class CheckButtonFollowUrl extends TestMain{
    @Test
    public void checkScooterUrl(){
        new MainPageUp(driver)
                .openMainPage()
                .clickScooterLogo();
    }
    @Test
    public void checkYandexUrl(){
        new MainPageUp(driver)
                .openMainPage()
                .clickYandexLogo();
    }
}
