package com.extramarks.assessment.apis.tests.PracticeTestSubjectList;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.extramarks.assessment.apis.PracticeTestSubjectList.PracticeTestSubjectList;

import utils.TestBase;
import static io.qameta.allure.Allure.step;

public class PracticeTestSubjectListTest extends TestBase {

	@Test(timeOut = 10000, groups = { "smoke" })
	@Severity(SeverityLevel.CRITICAL)
	@Description("PracticeTestSubjectList | Happy Flow")
	public void PracticeTestSubjectListTest_TC001() throws Exception {
		step("Creating object of main class");
		PracticeTestSubjectList obj = new PracticeTestSubjectList();

		step("Url Parameters set up");
		obj.getProperties().setProperty("user_id", "10655762");
		obj.getProperties().setProperty("student_type", "2");
		obj.getProperties().setProperty("board_id", "180");
		obj.getProperties().setProperty("class_id", "36");
		obj.getProperties().setProperty("action", "school_subject_list");
		obj.getProperties().setProperty("school_id", "37137");
		obj.getProperties().setProperty("section_id", "1");
		obj.getProperties().setProperty("section_name", "A");
		obj.getProperties().setProperty("paper_type", "6");
		obj.getProperties().setProperty("checksum", "c13075fdecee28a5264b0a22563ccf3b");

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





