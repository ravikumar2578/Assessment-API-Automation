package com.extramarks.assessment.apis.tests.GetCityDetails;

import com.extramarks.assessment.apis.GetCityDetails.GetCityDetails;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;

public class GetCityDetailsTest extends TestBase {

    @Test(timeOut = 10000, description = "Get City Details | Happy Flow")
    public void GetCityDetailsTest_TC001() throws Exception {
        GetCityDetails obj = new GetCityDetails();

        obj.addParameter("action", "city");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("47C7C9F7711308555B400B9D0", "2d3e61987ebc10a2b642233f9fdb21d6");

        Response res = obj.callAPI();

        int status = res.getStatusCode();

        Assert.assertEquals(status, 400);
    }

    @Test
    public void example1() {
        Assert.assertEquals(2, 3, "This test should be failed");
    }

    @Test
    public void example2() {
        Assert.assertEquals(2, 2);
    }

    @Test
    public void example3() {
        Assert.assertTrue(true, "This test should be failed");
    }

    @Test
    public void example4() {
        Assert.fail("This test should be failed");
    }

    @Test(dependsOnMethods = "example1")
    public void skippedByDependencyTest() {

    }
}