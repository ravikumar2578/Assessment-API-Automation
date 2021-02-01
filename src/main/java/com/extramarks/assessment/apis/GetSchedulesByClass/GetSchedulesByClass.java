package com.extramarks.assessment.apis.GetSchedulesByClass;

import com.extramarks.foundation.core.AbstractApiMethodV2;
import com.extramarks.foundation.core.P;

public class GetSchedulesByClass extends AbstractApiMethodV2 {
    public GetSchedulesByClass() {
        super("apiTestData/GetSchedulesByClass/req.json", "apiTestData/GetSchedulesByClass/res.json", "apiTestData/GetSchedulesByClass/GetSchedulesByClass.properties");
        replaceUrlPlaceholder("base_url", P.API.get("api_base_url"));
    }
}




