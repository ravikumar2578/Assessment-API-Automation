package utils;

import com.extramarks.foundation.core.P;
import com.google.common.collect.ImmutableMap;
import org.testng.annotations.BeforeSuite;

import static com.extramarks.foundation.customreporter.AllureEnvironmentVariableSetUp.allureEnvironmentVariableSetUp;

public class TestBase {

    @BeforeSuite (alwaysRun = true)
    public void setAllureEnvironment() {
        allureEnvironmentVariableSetUp(
                ImmutableMap.<String, String>builder()
                        .put("Project", "Extramarks APIs Regression Test")
                        .put("Suite Name", "Extramarks API Suite | Assessment APIs")
                        .put("Environment", "Staging")
                        .put("Environment Endpoints", P.API.get("api_base_url"))
                        .build());
    }
}