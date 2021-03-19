package chapter4.dropdown;

import chapter4.base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.*;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOptions() {
        DropdownPage dropdownPage = homePage.clickDropDown();

        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        List<WebElement> selectedOptions = dropdownPage.getSelectedOptions();

        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
    }

}
