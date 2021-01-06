package com.extramarks.assessment.apis.GetCityDetails;

import com.extramarks.foundation.core.AbstractApiMethodV2;
import com.extramarks.foundation.core.P;

public class GetCityDetails extends AbstractApiMethodV2 {
    public GetCityDetails() {
        super("apiTestData/GetCityDetails/req.json", "apiTestData/GetCityDetails/res.json", "apiTestData/GetCityDetails/GetCityDetails.properties");
        replaceUrlPlaceholder("base_url", P.API.get("api_base_url"));
    }
}