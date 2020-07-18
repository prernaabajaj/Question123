package getrequest;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;





@Test
public class getdata 
{
	public void testResponsecode()
	{
	
		Response resp=RestAssured.get("https://apiproxy.paytm.com/v2/movies/upcoming");
		
		int code=resp.getStatusCode();
		
		System.out.println("Status code is "+code);
		
		Assert.assertEquals(code, 200);
		
	}
	
	public void testbody()
	{
	
		Response resp=RestAssured.get("https://apiproxy.paytm.com/v2/movies/upcoming");
		
	String data=resp.asString();
		
		System.out.println("Data is "+data);
		
		System.out.println("Response time "+resp.getTime());
		


		



}
