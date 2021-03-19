package chapter4.alerts;

import chapter4.base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.*;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        AlertsPage alertsPage = homePage.clickJavascriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        alertsPage.getResult();

        assertEquals(alertsPage.getResult(),"You successfully clicked an alert");
    }

    @Test
    public void testGetTExtFromAlert() {
        AlertsPage alertsPage = homePage.clickJavascriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();

        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputAlert() {
        AlertsPage alertsPage = homePage.clickJavascriptAlerts();
        alertsPage.triggerPrompt();

        String text = "test string";

        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();

        assertEquals(alertsPage.getResult(), "You entered: " + text, "incorrect");
    }
}
