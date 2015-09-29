package test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import net.sf.json.JSONObject;

public class TestUrl {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws ClientProtocolException, IOException{
		JSONObject json= new JSONObject();
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost method = new HttpPost("http://10.103.30.138:8080/emrs/login/getAdmEmployeeList");  
		json.put("userNumber", "11111");
		StringEntity entity =new StringEntity(json.toString(),"utf-8");
		entity.setContentEncoding("UTF-8");    
        entity.setContentType("application/json");  
        method.setEntity(entity);
        HttpResponse result = httpClient.execute(method);  
        String resData = EntityUtils.toString(result.getEntity()); 
        System.out.println(resData);
	}
}
