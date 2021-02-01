package com.extramarks.assessment.apis.tests.GoToSchoolRecordedSession;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.extramarks.assessment.apis.GoToSchoolRecordedSession.GoToSchoolRecordedSession;
import utils.TestBase;
import static io.qameta.allure.Allure.step;

public class GoToSchoolRecordedSessionTest extends TestBase {

	@Test(timeOut = 10000, groups = { "smoke" })
	@Severity(SeverityLevel.CRITICAL)
	@Description("GoToSchoolRecordedSession | Happy Flow")
	public void GoToSchoolRecordedSessionTest_TC001() throws Exception {
		step("Creating object of main class");
		GoToSchoolRecordedSession obj = new GoToSchoolRecordedSession();

		step("Url Parameters set up");
		obj.getProperties().setProperty("user_id", "10655762");
		obj.getProperties().setProperty("student_type", "2");
		obj.getProperties().setProperty("board_id", "180");
		obj.getProperties().setProperty("class_id", "36");
		obj.getProperties().setProperty("subject_id", "176");
		obj.getProperties().setProperty("is_custom_rack", "1");
		obj.getProperties().setProperty("action", "goto_school_recorded_session_list");
		obj.getProperties().setProperty("school_id", "37137");
		obj.getProperties().setProperty("section_id", "1");
		obj.getProperties().setProperty("video_category", "1");
		obj.getProperties().setProperty("timezone", "Asia/Kolkata");
		obj.getProperties().setProperty("checksum", "040a81a58b67f817f6047fa980791902");

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




