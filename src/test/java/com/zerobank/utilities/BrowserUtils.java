package com.zerobank.utilities;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static void wait(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Waits for element to be not stale
     *
     * @param element
     */
    public static void waitForStaleElement(WebElement element) {
        int y = 0;
        while (y <= 15) {
            try {
                element.isDisplayed();
                break;
            } catch (StaleElementReferenceException st) {
                y++;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }

    public static List<String> getListOfString(List<WebElement> listOfWebElements) {
        List<String> listOfStrings = new ArrayList<>();
        for (WebElement element : listOfWebElements) {
            listOfStrings.add(element.getText().trim());
        }
        return listOfStrings;
    }


}
