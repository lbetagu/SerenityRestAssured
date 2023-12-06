package co.com.auto.runners;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.junit.Test;

public class Jsontest {

    @Test
    public void test(){
        JsonObject search = new JsonObject();
        JsonObject relationId = new JsonObject();
        relationId.addProperty ("customerId", "000000000012345");
        relationId.addProperty("agreementId", "1-1UW9XA9");
        JsonArray relationIds = new JsonArray();
        relationIds.add(relationId);
        search.add("relationIds", relationIds);
        search.addProperty("dateFrom", "2023-01-01");
        search.addProperty("dateTo", "2023-12-30");
        System.out.println(search);


        /*{
            "relationIds": [
                {
                    "customerId": "000000000012345",
                        "agreementId": "1-1UW9XA9"
                }
            ],
            "dateFrom": "2023-01-01",
             "dateTo": "2023-12-30"
        }*/

    }
}
