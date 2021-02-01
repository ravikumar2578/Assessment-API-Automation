package com.extramarks.assessment.apis.GoToSchoolRecordedSession;

import com.extramarks.foundation.core.AbstractApiMethodV2;
import com.extramarks.foundation.core.P;

public class GoToSchoolRecordedSession extends AbstractApiMethodV2 {
    public GoToSchoolRecordedSession() {
        super("apiTestData/GoToSchoolRecordedSession/req.json", "apiTestData/GoToSchoolRecordedSession/res.json", "apiTestData/GoToSchoolRecordedSession/GoToSchoolRecordedSession.properties");
        replaceUrlPlaceholder("base_url", P.API.get("api_base_url"));
    }
}



