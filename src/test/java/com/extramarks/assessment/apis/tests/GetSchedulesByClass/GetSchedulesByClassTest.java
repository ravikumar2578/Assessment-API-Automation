package com.extramarks.assessment.apis.tests.GetSchedulesByClass;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.extramarks.assessment.apis.GetSchedulesByClass.GetSchedulesByClass;

import utils.TestBase;
import static io.qameta.allure.Allure.step;

public class GetSchedulesByClassTest extends TestBase {

	@Test(timeOut = 10000, groups = { "smoke" })
	@Severity(SeverityLevel.CRITICAL)
	@Description("GetSchedulesByClass | Happy Flow")
	public void GetSchedulesByClassTest_TC001() throws Exception {
		step("Creating object of main class");
		GetSchedulesByClass obj = new GetSchedulesByClass();

		step("Url Parameters set up");
		obj.getProperties().setProperty("user_id", "10655762");
		obj.getProperties().setProperty("student_type", "2");
		obj.getProperties().setProperty("board_id", "180");
		obj.getProperties().setProperty("class_id", "36");
		obj.getProperties().setProperty("action", "get_schedules_by_class");
		obj.getProperties().setProperty("school_id", "37137");
		obj.getProperties().setProperty("timezone", "Asia/Kolkata");
		obj.getProperties().setProperty("video_category", "1");
		obj.getProperties().setProperty("schedule_orientation", "1");
		obj.getProperties().setProperty("checksum", "4997918c18b206159949b63ecc8282fb");

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



