package ru.yandex.praktikum;

import org.junit.Test;
import ru.yandex.praktikum.site_model.MainPageUp;

public class CheckTrack extends TestMain{
    String trackNumber;
    @Test
    public void checkCorrectTrack(){
        trackNumber = "307853";
        new MainPageUp(webDriver)
                .openMainPage()
                .clickFindTrack()
                .fillInTrackNumber(trackNumber)
                .clickGoTrack()
                .checkOrderIsActive(true);
    }
    @Test
    public void checkIncorrectTrack(){
        trackNumber = "000000";
        new MainPageUp(webDriver)
                .openMainPage()
                .clickFindTrack()
                .fillInTrackNumber(trackNumber)
                .clickGoTrack()
                .checkOrderIsActive(false);
    }
}
