import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

public class TestOfDifferenceSearchParameters {
    private MainPage mainPage;
    private Calendar calendar;
    private ResultPage resultPage;

    @Before
    public void onSetup(){
        calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        mainPage = new MainPage();
        mainPage.setOneWayPath();
    }

    @Test
    public void checkChangeOfTimezone()
    {
        mainPage.fillOneWayFields("Minsk", "Tokyo", calendar);
        resultPage = mainPage.toResultPage();
        Assert.assertEquals(resultPage.getResultOfWithChangedTimeZoneOffers(), resultPage.getCountOfAllOffers());
    }

    //@After
    //public void stopBrowser(){
      //  DriverSingelton.closeDriver();
    //}
}
