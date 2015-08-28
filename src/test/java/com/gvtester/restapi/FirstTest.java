package com.gvtester.restapi;

import org.junit.Test;
import org.junit.Assert;
import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
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
