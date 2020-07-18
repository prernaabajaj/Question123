package restassuredframework;

import io.restassured.RestAssured;

public class Jsonpath {
	
	void test {
		
		RestAssured.baseURL = "https://apiproxy.paytm.com/v2/movies/upcoming";
		
		Response response = given().contenttype(ContentType.JSON).log().all().
	}

}
