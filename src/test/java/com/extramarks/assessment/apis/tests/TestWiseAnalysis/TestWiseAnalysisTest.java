package com.extramarks.assessment.apis.tests.TestWiseAnalysis;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.extramarks.assessment.apis.TestWiseAnalysis.TestWiseAnalysis;
import utils.TestBase;
import static io.qameta.allure.Allure.step;

public class TestWiseAnalysisTest extends TestBase {

	@Test(timeOut = 10000, groups = { "smoke" })
	@Severity(SeverityLevel.CRITICAL)
	@Description("TestWiseAnalysis | Happy Flow")
	public void TestWiseAnalysisTest_TC001() throws Exception {
		step("Creating object of main class");
		TestWiseAnalysis obj = new TestWiseAnalysis();

		step("Url Parameters set up");
		obj.getProperties().setProperty("weeklytest_Id", "129229");
		obj.getProperties().setProperty("user_id", "10655762");
		obj.getProperties().setProperty("student_type", "2");
		obj.getProperties().setProperty("language_code", "01");
		obj.getProperties().setProperty("paper_type", "10");
		obj.getProperties().setProperty("action", "test_wise_analysis");
		obj.getProperties().setProperty("school_id", "37137");
		obj.getProperties().setProperty("timezone", "Asia/Kolkata");
		obj.getProperties().setProperty("checksum", "9251b15654cb71ffc03d4a7a8759c48a");

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




