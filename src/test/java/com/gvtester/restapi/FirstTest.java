package com.gvtester.restapi;

import org.junit.Test;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;



/**
 * Created by giri on 8/20/2015.
 */
public class FirstTest {

    @Test
    public void Sample() {
        expect().body("name", equalTo("Clementina DuBuque")).when().get("http://jsonplaceholder.typicode.com/users/10");
    }
}
