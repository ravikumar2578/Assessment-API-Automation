package com.extramarks.assessment.apis.tests.GetServiceDetailsWorksheet;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.extramarks.assessment.apis.GetServiceDetailsWorksheet.GetServiceDetailsWorksheet;
import utils.TestBase;
import static io.qameta.allure.Allure.step;

public class GetServiceDetailsWorksheetTest extends TestBase {

	@Test(timeOut = 10000, groups = { "smoke" })
	@Severity(SeverityLevel.CRITICAL)
	@Description("GetServiceDetailsWorksheet | Happy Flow")
	public void GetServiceDetailsWorksheetTest_TC001() throws Exception {
		step("Creating object of main class");
		GetServiceDetailsWorksheet obj = new GetServiceDetailsWorksheet();

		step("Url Parameters set up");
		obj.getProperties().setProperty("student_id", "10655762");
		obj.getProperties().setProperty("student_type", "2");
		obj.getProperties().setProperty("board_id", "180");
		obj.getProperties().setProperty("class_id", "36");
		obj.getProperties().setProperty("action", "worksheet_homework_details_v2");
		obj.getProperties().setProperty("service_id", "17");
		obj.getProperties().setProperty("rack_id", "177");
		obj.getProperties().setProperty("is_custom_rack", "0");
		obj.getProperties().setProperty("school_id", "37137");
		obj.getProperties().setProperty("section_id", "1");
		obj.getProperties().setProperty("section_name", "A");
		obj.getProperties().setProperty("timezone", "Asia/Kolkata");
		obj.getProperties().setProperty("checksum", "4aed5e745c7423a5c7e43a5824c228f1");

		step("Hit the API");
		Response res = obj.callAPI();

		assertSuccessResponse(res);
	}

	// All the methods used
	private void assertSuccessResponse(Response res) {
		step("Assert the API status code");
		int status = res.getStatusCode();
		Assert.assertEquals(status, 200);

		step("Assert the API response");
		Assert.assertEquals(res.jsonPath().getJsonObject("status").toString(), "1");
    }

}








