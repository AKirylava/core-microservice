package com.pwc.core.framework.ci.tests;

import com.pwc.core.framework.ci.parent.Data;

import static com.pwc.logging.service.LoggerService.AND;
import static com.pwc.logging.service.LoggerService.BUT;
import static com.pwc.logging.service.LoggerService.FEATURE;
import static com.pwc.logging.service.LoggerService.GIVEN;
import static com.pwc.logging.service.LoggerService.SCENARIO;
import static com.pwc.logging.service.LoggerService.THEN;
import static com.pwc.logging.service.LoggerService.WHEN;

public class HomeTest {

    public void testHome() {

        FEATURE("Home Test");
        SCENARIO("Home Functionality");
        GIVEN("I am logged in page=%s and authenticated user=%s", "home", "anthony lombardo");

        WHEN("I view the Home page without doing a search for env=%s", Data.ENVIRONMENT);

        THEN("Basic components are present");

        AND("I can click the anything");

        BUT("I go back to the Home page");

    }

}
