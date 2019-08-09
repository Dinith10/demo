package restController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {


    @GetMapping("abc")
    public Object getJson() {




        return Json.createObjectBuilder()
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

    }


}





