/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tecnoapi.apiintercambiador;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 *
 * @author marcguell
 */
public class Apiintercambiador {
    
    private String token;
    private String source_token;
    private Boolean sandbox;
    private String url;
    private final String app_url_sandbox = "https://sandbox.apiplataforma.online";
    //private final String app_url_sandbox = "http://localhost:3000";
    private final String app_url_pro = "https://apiplataforma.online";
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public Apiintercambiador(String token, String source_token, Boolean sandbox){
        this.token = token;
        this.source_token = source_token;
        if(sandbox){
            this.url = this.app_url_sandbox;
        }else{
            this.url = this.app_url_pro;
        }
    }
    
    public static void main(String[] args)  throws IOException{
	
        //Example
        /*
        Apiintercambiador ai = new Apiintercambiador("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0aW1lIjoiTW9uIE1heSAzMCAyMDIyIDE2OjQxOjA1IEdNVCswMjAwIChob3JhIGRlIHZlcmFubyBkZSBFdXJvcGEgY2VudHJhbCkiLCJ1c2VySWQiOiI2Mjk0YmM3ZGU1ODVlODhiODYxNzYzZDAiLCJpYXQiOjE2NTM5MjE2NjV9.pqFNn58pI4dlRQGkSQzqQD6CukiZWiX17KEcbFJV-Ew", true);
        */
        
        //GET all properties
        /*
        System.out.println(ai.getProperties());
        */
        
        //CREATE - UPDATE (_id)
        /*
        ArrayList<HashMap<String, String>> testList = new ArrayList<HashMap<String, String>>();        
        
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("_id", "6298a66d5500288ed8a81ca1");
        map.put("fuente_origen", "1");
        map.put("agency_id", "123");
        map.put("propietario", "123");
        map.put("status_id", "1");
        map.put("status_property_id", "1");
        map.put("cadastral_reference", "UPDATE OK");        
        testList.add(map);
        
        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("_id", "6298a6845500288ed8a81ca7");
        map2.put("fuente_origen", "1");
        map2.put("agency_id", "1234");
        map2.put("propietario", "1234");
        map2.put("status_id", "1");
        map2.put("status_property_id", "1");
        map2.put("cadastral_reference", "UPDATE OK");
        testList.add(map2);
        
        System.out.println(ai.addProperty(testList));
        System.out.println(ai.updateProperty(testList));
        
        */
        
        //DELETE
        /*
        ArrayList<String> testList = new ArrayList<String>(); 
        testList.add("6298a6a85500288ed8a81cb1");
        System.out.println(ai.deleteProperty(testList));
        */
    }
    
    public static String map_encode(HashMap<String, String> property){
        String propertyString = "{";
        for (Map.Entry<String,String> entry : property.entrySet()){
            if(!propertyString.equals("{")) propertyString += ",";
            propertyString += "\""+entry.getKey()+"\":\""+entry.getValue()+"\"";
        }
        propertyString += "}";
        return propertyString;
    }
    
    public String getProperties() throws IOException{
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        Request request = new Request.Builder()
          .url(this.url+"/api-intercambiador")
          .method("GET", null)
          .addHeader("Content-Type", "application/json")
          .addHeader("x-access-token", this.token)
          .addHeader("source-token", this.source_token)
          .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
    
    public String addProperty(ArrayList<HashMap<String, String>> listProperties) throws IOException{
        
        String resultJson = "[";
        
        for(int i = 0; i < listProperties.size(); i++){
            if(i != 0) resultJson += ",";
            resultJson += map_encode(listProperties.get(i));
        }
        resultJson += "]";
        
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, resultJson);
        Request request = new Request.Builder()
          .url(this.url+"/api-intercambiador")
          .method("POST", body)
          .addHeader("x-access-token", this.token)
          .addHeader("source-token", this.source_token)
          .addHeader("Content-Type", "application/json")
          .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
    
    public String updateProperty(ArrayList<HashMap<String, String>> listProperties) throws IOException{
        
        String resultJson = "[";
        
        for(int i = 0; i < listProperties.size(); i++){
            if(i != 0) resultJson += ",";
            resultJson += map_encode(listProperties.get(i));
        }
        resultJson += "]";
        
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, resultJson);
        Request request = new Request.Builder()
          .url(this.url+"/api-intercambiador")
          .method("PUT", body)
          .addHeader("x-access-token", this.token)
          .addHeader("source-token", this.source_token)
          .addHeader("Content-Type", "application/json")
          .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
    
    public String deleteProperty(ArrayList<String> listProperties) throws IOException{
        String resultJson = "[";
        for(int i = 0; i < listProperties.size(); i++){
            if(i != 0) resultJson += ",";
            resultJson += "\""+listProperties.get(i)+"\"";
        }
        resultJson += "]";
        
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, resultJson);
        Request request = new Request.Builder()
            .url(this.url+"/api-intercambiador")
            .method("DELETE", body)
            .addHeader("x-access-token", this.token)
            .addHeader("source-token", this.source_token)
            .addHeader("Content-Type", "application/json")
            .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
