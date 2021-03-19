package chapter4.alerts;

import chapter4.base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu() {
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickOnHotSpot();
        String text = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickToAccept();
        assertEquals(text, "You selected a context menu", "Alert text incorrect");

    }
}
