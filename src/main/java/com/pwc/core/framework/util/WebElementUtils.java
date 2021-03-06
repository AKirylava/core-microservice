package com.pwc.core.framework.util;

import org.openqa.selenium.WebElement;

public class WebElementUtils {

    /**
     * Utility method which returns the XPATH for a given WebElement
     *
     * @param webElement WebElement to interrogate it's xPath out of
     * @return webElement xPath of WebElement
     */
    public static String getXPathOfWebElement(final WebElement webElement) {
        StringBuilder xpath = new StringBuilder();
        try {
            xpath.append(org.apache.commons.lang3.StringUtils.substringBetween(webElement.toString(), "xpath:", "]]").trim());
            xpath.append("]");
        } catch (Exception e) {
            xpath.append("");
        }
        return xpath.toString();
    }


}
