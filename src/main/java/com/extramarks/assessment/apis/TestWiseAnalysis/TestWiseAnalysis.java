package com.extramarks.assessment.apis.TestWiseAnalysis;

import com.extramarks.foundation.core.AbstractApiMethodV2;
import com.extramarks.foundation.core.P;

public class TestWiseAnalysis extends AbstractApiMethodV2 {
    public TestWiseAnalysis() {
        super("apiTestData/TestWiseAnalysis/req.json", "apiTestData/TestWiseAnalysis/res.json", "apiTestData/TestWiseAnalysis/TestWiseAnalysis.properties");
        replaceUrlPlaceholder("base_url", P.API.get("api_base_url"));
    }
}



