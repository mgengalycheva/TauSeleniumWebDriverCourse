package chapter4.frames;

import chapter4.base.BaseTests;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg() {

        WysiwygEditorPage wysiwygEditorPage = homePage.clickWysiwygEditor();
        wysiwygEditorPage.clearTextArea();
        String text = "hello ";
        String text2 = "world!";
        wysiwygEditorPage.setTextArea(text);
        wysiwygEditorPage.clickCenterButton();
        wysiwygEditorPage.setTextArea(text2);

        assertEquals(wysiwygEditorPage.getTextFromEditor(), text+text2, "Text from editor incorrect");
    }
}
