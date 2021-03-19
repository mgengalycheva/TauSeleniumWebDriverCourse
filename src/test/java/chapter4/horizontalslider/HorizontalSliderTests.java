package chapter4.horizontalslider;

import chapter4.base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;
import static org.testng.Assert.*;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testHorizontalSlider() {
        String value = "4";
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.moveSlider(value);

        assertEquals(horizontalSliderPage.getResult(),value,"Slider value is incorrect" );

    }
}
