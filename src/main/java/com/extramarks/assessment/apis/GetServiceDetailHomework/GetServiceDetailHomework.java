package com.extramarks.assessment.apis.GetServiceDetailHomework;

import com.extramarks.foundation.core.AbstractApiMethodV2;
import com.extramarks.foundation.core.P;

public class GetServiceDetailHomework extends AbstractApiMethodV2 {
    public GetServiceDetailHomework() {
        super("apiTestData/GetServiceDetailHomework/req.json", "apiTestData/GetServiceDetailHomework/res.json", "apiTestData/GetServiceDetailHomework/GetServiceDetailHomework.properties");
        replaceUrlPlaceholder("base_url", P.API.get("api_base_url"));
    }
}







