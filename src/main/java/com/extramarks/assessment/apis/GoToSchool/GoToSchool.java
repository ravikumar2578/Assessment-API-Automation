package com.extramarks.assessment.apis.GoToSchool;

import com.extramarks.foundation.core.AbstractApiMethodV2;
import com.extramarks.foundation.core.P;

public class GoToSchool extends AbstractApiMethodV2 {
    public GoToSchool() {
        super("apiTestData/GoToSchool/req.json", "apiTestData/GoToSchool/res.json", "apiTestData/GoToSchool/GoToSchool.properties");
        replaceUrlPlaceholder("base_url", P.API.get("api_base_url"));
    }
}

