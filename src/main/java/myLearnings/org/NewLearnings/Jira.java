package myLearnings.org.NewLearnings;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class Jira {
	public static String baseURI="https://api-may2020.atlassian.net";
	
	enum Type
	{
		GET, POST, DELETE, PUT, PATCH
	}
	public static void main(String[] args) {
		addAttachmentToIssueInJira("RA-56", "C:\\Users\\tamil\\Pictures\\pexels-fauxels-3183198.jpg");
		
//		Map<String, String> headers=new HashMap<String, String>();
//		headers.put("X-Atlassian-Token","no-check");
//		headers.put("Authorization","Basic aGFyaS5yYWRoYWtyaXNobmFuQHRlc3RsZWFmLmNvbTpjU1J3aXNQbFQ3c09WTFZqc3RBTTI5MDU=");
//		headers.put("Cookie","atlassian.xsrf.token=975429e8-9be9-4e64-81b7-7a2450b5de63_6bb6920b8663da0d5b4e7cdfcbaa6bd76f743c00_lin");
//		headers.put("Accept", "application/json");
	}
	
	public static String fetch(RequestSpecification requestSpec, Type type, String resources)
	{
		String response = null;
		switch(type)
		{
		case GET:
			response=requestSpec.when().get(resources)
			.then().log().all().extract().response().asString();
			break;
			
		case POST:
			response=requestSpec.when().post(resources)
			.then().log().all().extract().response().asString();
			break;
			
		case DELETE:
			break;
			
		case PUT:
			break;
			
		case PATCH:
			break;
		}
		return response;
		
	}
	
	
	public static void get(String baseURI, String resources, Type type ,Map<String, String> headers, String requestBody)
	{
		RequestSpecification requestSpec=new RequestSpecBuilder().addHeaders(headers).setAuth(null).build();
		requestSpec.given().auth().basic("hari.radhakrishnan@testleaf.com", "cSRwisPlT7sOVLVjstAM2905");
		
		String response = null;
		
		fetch(requestSpec, type, resources);
		
		RestAssured.baseURI = baseURI;
		String response1 = RestAssured.given().log().all().auth()
				.basic("hari.radhakrishnan@testleaf.com", "cSRwisPlT7sOVLVjstAM2905")
								
				.when()
				.get("/rest/api/2/project")
				
				.then().log().all()
				.extract().response().asString();

		//System.out.println("Response:" + response);
		
		JsonPath JSON=new JsonPath(response);
		ArrayList<String> projectNames=JSON.get("name");
		ArrayList<String> projectId=JSON.get("id");
		for(int i=0; i<=projectNames.size()-1;i++)
		{
			System.out.println("Project Name:"+projectNames.get(i));
			System.out.println("Project ID:"+projectId.get(i));
		}
		

	}
	
	public static void addAttachmentToIssueInJira(String issueId, String fileName)
	{
		
		
		String response = 
				
				RestAssured.given().log().all().header("Accept", "application/json").auth()
				.basic("hari.radhakrishnan@testleaf.com", "cSRwisPlT7sOVLVjstAM2905")
				.header("Content-Type", "multipart/form-data")
				.header("X-Atlassian-Token","no-check")
				.header("Authorization","Basic aGFyaS5yYWRoYWtyaXNobmFuQHRlc3RsZWFmLmNvbTpjU1J3aXNQbFQ3c09WTFZqc3RBTTI5MDU=")
				.header("Cookie","atlassian.xsrf.token=975429e8-9be9-4e64-81b7-7a2450b5de63_6bb6920b8663da0d5b4e7cdfcbaa6bd76f743c00_lin")
				.multiPart("file", new File(fileName))
				
				
				.when()
				.post("/rest/api/2/issue/"+issueId+"/attachments")
				
				.then().log().all().extract().response().asString();
		
		System.out.println(response);
	}
	
	public static void getAllIssueInJira()
	{
		RestAssured.baseURI = "https://api-may2020.atlassian.net";
		
		String response = 
				
				RestAssured.given().log().all().header("Accept", "multipart/form-data").auth()
				.basic("hari.radhakrishnan@testleaf.com", "cSRwisPlT7sOVLVjstAM2905")
				.header("Authorization","Basic aGFyaS5yYWRoYWtyaXNobmFuQHRlc3RsZWFmLmNvbTpjU1J3aXNQbFQ3c09WTFZqc3RBTTI5MDU=")
				.header("Cookie","atlassian.xsrf.token=975429e8-9be9-4e64-81b7-7a2450b5de63_6bb6920b8663da0d5b4e7cdfcbaa6bd76f743c00_lin")
				.multiPart("TestResultsAttachment", new File("C:\\Users\\tamil\\Pictures\\pexels-fauxels-3183198.jpg"))
				
				
				.when()
				.post("/rest/api/2/issue/10055")
				
				.then().log().all().extract().response().asString();
	}

}
