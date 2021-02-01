package com.extramarks.assessment.apis.SubjectWiseLiveSessionList;



import com.extramarks.foundation.core.AbstractApiMethodV2;
import com.extramarks.foundation.core.P;

public class SubjectWiseLiveSessionList extends AbstractApiMethodV2 {
    public SubjectWiseLiveSessionList() {
        super("apiTestData/SubjectWiseLiveSessionList/req.json", "apiTestData/SubjectWiseLiveSessionList/res.json", "apiTestData/SubjectWiseLiveSessionList/SubjectWiseLiveSessionList.properties");
        replaceUrlPlaceholder("base_url", P.API.get("api_base_url"));
    }
}




