package test.automation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class FirstGetRequest {

 
// @Test
// void tc01(){
//	 //import static io.restassured.RestAssured.*; static so no need to write class again and again
//	//Response res= RestAssured.get("https://reqres.in/api/users?page=2");
//	 Response res= get("https://reqres.in/api/users?page=2");
//	System.out.println(res.asString());
//	System.out.println("Status code "+res.getStatusCode());
//	System.out.println("Response body "+res.getBody().asString());
//	System.out.println("Response Time  "+res.getTime());
//	System.out.println("Response header  "+res.getHeader("Date")); 
//	
//	
//	//validate status code 200
//	int exstatuscode=200;
//	int actualstatuscode=res.getStatusCode();
//	Assert.assertEquals(exstatuscode, actualstatuscode);
//	}
// 
// @Test
// public void tc02() {
//	 baseURI=("https://reqres.in/api/users");
//	given()
//	 .queryParam("page", "2")
//	 .when().get()
//	 .then().statusCode(200);
//	 
// }
 @Test
 public void posttc01() {
	 JSONObject jsondata=new JSONObject(); 
	 jsondata.put("name","priya");
	 jsondata.put("job","qa");
	 
	 baseURI=("https://reqres.in/api/users");
	given().header("Content-type","application/json")
	 .contentType(ContentType.JSON)
	 .body(jsondata.toJSONString())
	 .when().post()
	 .then().statusCode(201);
	 
 }
// @Test
// public void validatresp01() {
//	 
//	 
//	 given()
//	 .when()
//	 .get("https://reqres.in/api/users/2")
//	 .then()
//	 .statusCode(200).statusLine("HTTP/1.1 200 OK");
//	 
// }
//
// @Test
// public void validatresp02() {
//	 
//	
//	 given()
//	 .when()
//	 .get("https://reqres.in/api/users/2")
//	 .then()
//	 .statusCode(200).statusLine("HTTP/1.1 200 OK");
//	 
// }
 @Test
 public void BasicAuth(){
//	 ObjectMapper objmap=new ObjectMapper();
	 RequestSpecification reqspe=given();
	 reqspe.baseUri("http://postman-echo.com");
	 reqspe.basePath("/basic-auth");
	 Response re=reqspe.get();
	 
	 //Response res=reqspe.auth().basic("postman","password").get();
	 Response res=reqspe.auth().preemptive().basic("postman","password").get();
	 Response res1=reqspe.auth().digest("postman","password").get();
	 System.out.println("Response status"+res.statusLine());
	 System.out.println("Response status"+res.body().asString());
	 System.out.println("Response status"+res1.body().asString());
	 
 }
}
