package chapter4.wait;

import chapter4.base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingExample2Page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden() {
        DynamicLoadingExample1Page dynamicLoadingExample1Page = homePage.clickDynamicLoading().clickExample1();
        dynamicLoadingExample1Page.clickStart();

        assertEquals(dynamicLoadingExample1Page.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }

    @Test
    public void testWaitUntilHidden2() {
        DynamicLoadingExample2Page dynamicLoadingExample2Page = homePage.clickDynamicLoading().clickExample2();
        dynamicLoadingExample2Page.clickStart();

        assertEquals(dynamicLoadingExample2Page.getLoadedText(), "Hello World!", "Loaded text incorrect");

    }
}
