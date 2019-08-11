package restController;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

@RestController
public class Rest {


    @GetMapping("/abc")
    public Object getJson() throws JSONException {

        System.out.println("AAAAAAAAAAAA");


        boolean y = true;





            JSONArray jObject = new JSONArray( new JSONObject()
                                                 .put("fundid","FMC" )
                                                 .put("category","ABC" ) );




            System.out.println( jObject.get(0));


            JsonObject ja =  Json.createObjectBuilder()
                    .add("fund", Json.createArrayBuilder()
                            .add(Json.createObjectBuilder()
                                    .add("fundid", "FMC")
                                    .add("category", "ABC")
                                    .add("classes", Json.createArrayBuilder()
                                            .add(Json.createObjectBuilder()
                                                    .add("entityid", "ABCD")
                                                    .add("cusip","ABCD")
                                                    .add("ticker","ABCD")
                                                    .add("class","ABCD")
                                                    .add("prices",Json.createArrayBuilder()
                                                            .add(Json.createObjectBuilder()
                                                                    .add("curNav","ABCD")
                                                                    .add("pop","ABCD")
                                                                    .add("changeNav","ABCD")
                                                                    .add("perChangeNav","ABCD")
                                                                    .add("perNavYtd","ABCD")
                                                                    .add("sharePrice","ABCD")
                                                                    .add("changeSharePrice","ABCD")
                                                                    .add("bidOffer","ABCD")
                                                                    .add("premiumDiscount","ABCD")
                                                                    .add("effectiveDate","ABCD")





                                                            )
                                                    )

                                            )






                                    )


                            )).build();


            y =false;







        System.out.println("AAAAAAAAAAAA"+ ja.);


        return ja;

    }





    @GetMapping("/abc")
    public Object getPrices() throws Exception  {



        JSONArray  fundsArray = null ;

        JSONArray  classesArray = new JSONArray();

        JSONArray  pricesArray =   new JSONArray();


        JSONObject  priceselements =   new JSONObject();
        JSONObject  classelements =   new JSONObject();
        JSONObject  funelements =   new JSONObject();




        priceselements
                .put("curNav","ABCD")
                .put("pop","ABCD")
                .put("changeNav","ABCD")
                .put("perChangeNav","ABCD")
                .put("perNavYtd","ABCD")
                .put("sharePrice","ABCD")
                .put("changeSharePrice","ABCD")
                .put("bidOffer","ABCD")
                .put("premiumDiscount","ABCD")
                .put("effectiveDate","ABCD");




        pricesArray.put(priceselements);




        classelements
                .put("entityid", "ABCD")
                .put("cusip","ABCD")
                .put("ticker","ABCD")
                .put("class","ABCD")
                .put("prices",pricesArray);


        classesArray.put(classelements);

/// skip in 1st checkup
        if(funelements.get("fundid").equals(items.get("fundid"))){


            classesArray.put("");

            //	continue;


        }




        funelements
                .put("fundid", "FMC")
                .put("category", "ABC")
                .put("classes", classesArray);

        fundsArray = new JSONArray();



        fundsArray.put(funelements);


//		  priceselements =   new JSONObject();
//		  classelements =   new JSONObject();
//		  funelements =   new JSONObject();




        JSONObject funds = new JSONObject().put("funds",fundsArray);






        System.out.println(""+ funds);

        pricesArray.put( new JSONObject()
                .put("AAAAAAAAAAAAA","AAAAAAAAAAAAA")
                .put("AAAAAAAAAAAAA","AAAAAAAAAAAAA")
                .put("AAAAAAAAAAAAA","AAAAAAAAAAAAA"));



        System.out.println(""+ funds);
        System.out.println("GET "+ funelements.get("fundid"));



        return "Hiiiii";
    }

}





