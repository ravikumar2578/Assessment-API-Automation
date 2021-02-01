package com.extramarks.assessment.apis.PreviousWeeklyTestList;

import com.extramarks.foundation.core.AbstractApiMethodV2;
import com.extramarks.foundation.core.P;

public class PreviousWeeklyTestList extends AbstractApiMethodV2 {
    public PreviousWeeklyTestList() {
        super("apiTestData/PreviousWeeklyTestList/req.json", "apiTestData/PreviousWeeklyTestList/res.json", "apiTestData/PreviousWeeklyTestList/PreviousWeeklyTestList.properties");
        replaceUrlPlaceholder("base_url", P.API.get("api_base_url"));
    }
}


