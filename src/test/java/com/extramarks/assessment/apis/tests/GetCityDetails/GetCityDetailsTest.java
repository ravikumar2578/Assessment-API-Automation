package com.extramarks.assessment.apis.tests.GetCityDetails;

import com.extramarks.assessment.apis.GetCityDetails.GetCityDetails;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;
import static io.qameta.allure.Allure.step;

public class GetCityDetailsTest extends TestBase {

    @Test(timeOut = 10000, groups = {"smoke"})
    @Severity(SeverityLevel.CRITICAL)
    @Description("Get City Details | Happy Flow")
    public void GetCityDetailsTest_TC001() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertSuccessResponse(res);
    }

    // Negative cases around "apikey" parameter
    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.NORMAL)
    @Description("Get City Details || Negative Flow | Without API Key")
    public void GetCityDetailsTest_TC002() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertFailureError(res, "apikey is missing, please provide api key first.");
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.NORMAL)
    @Description("Get City Details || Negative Flow | With empty API Key")
    public void GetCityDetailsTest_TC003() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("apikey", "");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertFailureError(res, "apikey is missing, please provide api key first.");
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.NORMAL)
    @Description("Get City Details || Negative Flow | With space in API Key")
    public void GetCityDetailsTest_TC004() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("apikey", " ");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertFailureError(res, "Invalid api credentials, please provide a valid api key and checksum");
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.NORMAL)
    @Description("Get City Details || Negative Flow | With invalid values in API Key")
    public void GetCityDetailsTest_TC005() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "");
        obj.addParameter("apikey", "invalidAPiKeys");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertFailureError(res, "Invalid api credentials, please provide a valid api key and checksum");
    }

    // Negative cases around "checksum" parameter
    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.NORMAL)
    @Description("Get City Details || Negative Flow | Without 'checksum' param")
    public void GetCityDetailsTest_TC006() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");

        step("Hit the API");
        Response res = obj.callAPI();

        assertFailureError(res, "Oops!! Checksum or Access Token error!");
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.CRITICAL)
    @Description("Get City Details || Negative Flow | With empty 'checksum' param")
    public void GetCityDetailsTest_TC007() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("checksum", "");

        step("Hit the API");
        Response res = obj.callAPI();

        assertFailureError(res, "Oops!! Checksum or Access Token error!");
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.NORMAL)
    @Description("Get City Details || Negative Flow | With space 'checksum' param")
    public void GetCityDetailsTest_TC008() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("checksum", " ");

        step("Hit the API");
        Response res = obj.callAPI();

        assertParamMissingError(res);
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.CRITICAL)
    @Description("Get City Details || Negative Flow | With invalid value in 'checksum' param")
    public void GetCityDetailsTest_TC009() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("checksum", "invalidChecksum");

        step("Hit the API");
        Response res = obj.callAPI();

        assertParamMissingError(res);
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.CRITICAL)
    @Description("Get City Details || Negative Flow | With invalid combinations of 'apikey' and 'checksum' param")
    public void GetCityDetailsTest_TC010() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "");
        obj.addParameter("apikey", "8FF8508F917BCC12FFDCD");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertFailureError(res,"Invalid api credentials, please provide a valid api key and checksum");
    }

    // Negative Cases around 'action' Parameter
    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.CRITICAL)
    @Description("Get City Details || Negative Flow | Without 'action' param")
    public void GetCityDetailsTest_TC011() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertParamMissingError(res);
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.MINOR)
    @Description("Get City Details || Negative Flow | With space in 'action' param")
    public void GetCityDetailsTest_TC012() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", " ");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertParamMissingError(res);
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.MINOR)
    @Description("Get City Details || Negative Flow | With invalid string in 'action' param")
    public void GetCityDetailsTest_TC013() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "invalidString");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertParamMissingError(res);
    }

    // Cases around "state_id" key
    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.MINOR)
    @Description("Get City Details || Negative Flow | Without 'state_id' param")
    public void GetCityDetailsTest_TC014() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("city_id", "");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertParamMissingError(res);
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.MINOR)
    @Description("Get City Details || Negative Flow | With empty 'state_id' param")
    public void GetCityDetailsTest_TC015() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertSuccessResponse(res);
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.MINOR)
    @Description("Get City Details || Negative Flow | With space in 'state_id' param")
    public void GetCityDetailsTest_TC016() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("state_id", " ");
        obj.addParameter("city_id", "");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertParamMissingError(res);
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.MINOR)
    @Description("Get City Details || Negative Flow | With invalid 'state_id' param")
    public void GetCityDetailsTest_TC017() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("state_id", "invalidStateId");
        obj.addParameter("city_id", "");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertParamMissingError(res);
    }

    // Cases around "city_id"
    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.MINOR)
    @Description("Get City Details || Negative Flow | Without 'city_id' param")
    public void GetCityDetailsTest_TC018() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("state_id", "");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertParamMissingError(res);
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.MINOR)
    @Description("Get City Details || Negative Flow | With empty 'city_id' param")
    public void GetCityDetailsTest_TC019() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertSuccessResponse(res);
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.MINOR)
    @Description("Get City Details || Negative Flow | With space in 'city_id' param")
    public void GetCityDetailsTest_TC020() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", " ");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertParamMissingError(res);
    }

    @Test(timeOut = 10000, groups = {"functional"})
    @Severity(SeverityLevel.MINOR)
    @Description("Get City Details || Negative Flow | With invalid 'city_id' param")
    public void GetCityDetailsTest_TC021() throws Exception {
        step("Creating object of main class");
        GetCityDetails obj = new GetCityDetails();

        step("Url Parameters set up");
        obj.addParameter("action", "city");
        obj.addParameter("state_id", "");
        obj.addParameter("city_id", "invalidCityId");
        obj.addParameter("apikey", "47C7C9F7711308555B400B9D0");
        obj.addParameter("checksum", "2d3e61987ebc10a2b642233f9fdb21d6");

        step("Hit the API");
        Response res = obj.callAPI();

        assertParamMissingError(res);
    }

    // All the methods used
    private void assertSuccessResponse(Response res) {
        step("Assert the API status code");
        int status = res.getStatusCode();
        Assert.assertEquals(status, 200);

        step("Assert the API response");
        Assert.assertEquals(res.jsonPath().getJsonObject("status").toString(), "1");
        Assert.assertEquals(res.jsonPath().getJsonObject("message").toString(), "success");
    }

    private void assertParamMissingError(Response res) {
        step("Assert the API status code");
        int status = res.getStatusCode();
        Assert.assertEquals(status, 200);

        step("Assert the API response");
        Assert.assertEquals(res.jsonPath().getJsonObject("status").toString(), "0");
        Assert.assertEquals(res.jsonPath().getJsonObject("message"), "Oops!! checksum error, please check your parameters.");
    }

    private void assertFailureError(Response res, String message) {
        step("Assert the API status code");
        int status = res.getStatusCode();
        Assert.assertEquals(status, 200);

        step("Assert the API response");
        Assert.assertEquals(res.jsonPath().getJsonObject("status").toString(), "0");
        Assert.assertEquals(res.jsonPath().getJsonObject("message"), message);
    }

}