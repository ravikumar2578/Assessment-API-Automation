package com.extramarks.assessment.apis.PracticeTestSubjectList;

import com.extramarks.foundation.core.AbstractApiMethodV2;
import com.extramarks.foundation.core.P;

public class PracticeTestSubjectList extends AbstractApiMethodV2 {
    public PracticeTestSubjectList() {
        super("apiTestData/PracticeTestSubjectList/req.json", "apiTestData/PracticeTestSubjectList/res.json", "apiTestData/PracticeTestSubjectList/PracticeTestSubjectList.properties");
        replaceUrlPlaceholder("base_url", P.API.get("api_base_url"));
    }
}



