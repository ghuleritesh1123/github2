package Webdriver;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Restassured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Response rep=RestAssured.get("http://183.82.103.245/nareshit/login.php");
		int code=rep.statusCode();
		System.out.println(code);
		System.out.println(rep.getTime());
		Response repst=RestAssured.get("http://183.82.103.245/nareshit/login.php");
		String data=repst.asString();
		System.out.println(data);
		
		

	}

}
