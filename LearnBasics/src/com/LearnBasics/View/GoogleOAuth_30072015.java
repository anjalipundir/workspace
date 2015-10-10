package com.LearnBasics.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeTokenRequest;
import com.google.api.client.googleapis.auth.oauth2.GoogleTokenResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;



public class GoogleOAuth_30072015 {
	
	AuthData auth = new AuthData();
	
	public static void main(String[] args) {
		GoogleOAuth_30072015 googleAuthentication = new GoogleOAuth_30072015();
		String accessToken = googleAuthentication.getAccessToken();	
	}

	public String getAccessToken() {
		String access_token = null;
		HttpTransport netTransport = new NetHttpTransport();
        JsonFactory jsonFactory = new JacksonFactory();
		try {
			/*String requestURL = auth_uri + "/access_token?client_id=" + clientId
					+ "&client_secret=" + clientSecret
					+ "&grant_type=" +client_credentials;
			//String response = receiveResponseFromGoogle(requestURL);*/
			String code = "";
			GoogleTokenResponse response = 
	         new GoogleAuthorizationCodeTokenRequest(netTransport, jsonFactory,
	        		 auth.getClientId(), auth.getClientSecret(), code, auth.getRedirect_uris()) //code <- Find Out what is code
	              .execute();
	      System.out.println("Access token: " + response.getAccessToken());
			
	      access_token = response.getAccessToken();
			/*if (response != null && !response.trim().equals("")) {
				access_token = response.substring(response.indexOf("=") + 1);
			}*/
			System.out.println(access_token);

		} catch (Exception exp) {
			exp.printStackTrace();
		}
		return access_token;
	}

	private static String receiveResponseFromGoogle(String inputURL)
			throws Exception {
		URL url = null;
		BufferedReader reader = null;
		StringBuilder stringBuilder;

		try {
			// create the HttpURLConnection
			url = new URL(inputURL);
			//URLConnection yc = url.openConnection();
			/*HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			// just want to do an HTTP GET here
			connection.setRequestMethod("GET");

			// uncomment this if you want to write output to this url
			 connection.setDoOutput(true);

			// give it 15 seconds to respond
			connection.setReadTimeout(15 * 1000);
			connection.connect();*/

			// read the output from the server
			//InputStream yc = connection.getInputStream();
			
			URLConnection yc = url.openConnection();
			reader = new BufferedReader(new InputStreamReader(yc.getInputStream()));
			stringBuilder = new StringBuilder();

			String line = null;
			while ((line = reader.readLine()) != null) {
				stringBuilder.append(line + "\n");
			}
			return stringBuilder.toString();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			// close the reader; this can throw an exception too, so
			// wrap it in another try/catch block.
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}
	
}
