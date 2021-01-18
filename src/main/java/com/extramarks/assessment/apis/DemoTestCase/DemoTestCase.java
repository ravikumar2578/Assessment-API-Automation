package com.extramarks.assessment.apis.DemoTestCase;

import com.extramarks.foundation.core.AbstractApiMethodV2;
import com.extramarks.foundation.core.P;

public class DemoTestCase extends AbstractApiMethodV2 {
    public DemoTestCase() {
        super("apiTestData/DemoTestCase/req.json", "apiTestData/DemoTestCase/res.json", "apiTestData/DemoTestCase/DemoTestCase.properties");
        replaceUrlPlaceholder("base_url", P.API.get("api_base_url"));
    }
}