package com.extramarks.assessment.apis.tests.DemoTestCase;

import com.extramarks.assessment.apis.DemoTestCase.DemoTestCase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;
import static io.qameta.allure.Allure.step;

public class DemoTestCaseTest extends TestBase {

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Demo Test Case | This Is Demo Test Case")
    public void DemoTestCaseTest_TC001() throws Exception {
        step("Creating object of main class");
        DemoTestCase obj = new DemoTestCase();

        step("Url Parameters set up");
        /*
        * Set Parameters required
        */

        step("Url Header set up");
        /*
         * Set headers required
         */

        step("Request Body set up");
        /*
         * Set Parameters required
         */

        step("Hit the API");
        Response res = obj.callAPI();

        step("Assert the API status code");
        int status = res.getStatusCode();
        Assert.assertEquals(status, 200);

        step("Assert the API Response");
        /*
         * Assert API response
         */

        step("schema validation");
        /*
         * Schema validation is must
         */

        step("Assert From DB");
        /*
         * Set Parameters required
         */
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Demo Test Case | This Is Negative Test Case")
    public void DemoTestCaseTest_TC002() throws Exception {
        Assert.assertEquals("This is demo case", "This is demo case");
    }
}