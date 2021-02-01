package com.extramarks.assessment.apis.PracticeTestSubjectPaperList;
import com.extramarks.foundation.core.AbstractApiMethodV2;
import com.extramarks.foundation.core.P;

public class PracticeTestSubjectPaperList extends AbstractApiMethodV2 {
    public PracticeTestSubjectPaperList() {
        super("apiTestData/PracticeTestSubjectPaperList/req.json", "apiTestData/PracticeTestSubjectPaperList/res.json", "apiTestData/PracticeTestSubjectPaperList/PracticeTestSubjectPaperList.properties");
        replaceUrlPlaceholder("base_url", P.API.get("api_base_url"));
    }
}





