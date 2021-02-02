package com.extramarks.assessment.apis.GetServiceDetailsWorksheet;

import com.extramarks.foundation.core.AbstractApiMethodV2;
import com.extramarks.foundation.core.P;

public class GetServiceDetailsWorksheet extends AbstractApiMethodV2 {
    public GetServiceDetailsWorksheet() {
        super("apiTestData/GetServiceDetailsWorksheet/req.json", "apiTestData/GetServiceDetailsWorksheet/res.json", "apiTestData/GetServiceDetailsWorksheet/GetServiceDetailsWorksheet.properties");
        replaceUrlPlaceholder("base_url", P.API.get("api_base_url"));
    }
}









