package com.home.restautomation1;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

import org.junit.Test;


public class TwitterrestAPI 
{

	@Test
    public void test() throws Exception {
		HttpClient httpClient = new DefaultHttpClient();
    	HttpGet req = new HttpGet("http://google.com");
    	req.addHeader("content type","application/json");
    	HttpResponse response = http.execute(req);
    	int statuscode = response.getStatusLine().getStatusCode();
    	System.out.println("statuscode is:"+statuscode);      
    }
}
