package chapter4.alerts;

import chapter4.base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("/home/marina/JavaAutoTestsProjects/TauSeleniumWebdriverCourse/webdriver_java/resources/chromedriver");

        assertEquals(fileUploadPage.getUploadedFiles(), "chromedriver", "Uploaded incorrect file");
    }
}
