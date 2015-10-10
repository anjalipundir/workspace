package com.LearnBasics.View;

public class AuthData {
	String clientId;
	String clientSecret;
	String auth_uri;
	String token_uri;
	String client_credentials;
	String redirect_uris;
	String shayadCode;
	
	public AuthData(){
		
		clientId = "699454761877-rmdmociujc88t756mu8qrlc04tat6qqe.apps.googleusercontent.com";
		clientSecret = "XmBID6W3XnNOxqiwh__iXtFj";
		//auth_uri = "https://accounts.google.com/o/oauth2/auth";
		//token_uri = "https://accounts.google.com/o/oauth2/token";
		//client_credentials = "AIzaSyDZQPvMXD1avnTQNjgFu_L92XEbvAkXft4";
		redirect_uris ="http://anjali-test-project.appspot.com/oauth2callback";
		//shayadCode = "AIzaSyDZQPvMXD1avnTQNjgFu_L92XEbvAkXft4";

		
		/*
		 *  Client ID: 699454761877-rmdmociujc88t756mu8qrlc04tat6qqe.apps.googleusercontent.com
			Client secret: XmBID6W3XnNOxqiwh__iXtFj
			Redirect URIs: http://anjali-test-project.appspot.com/oauth2callback
			JavaScript origins: http://anjali-test-project.appspot.com/
		 */
		/*"web":
		{
			"client_id":"1062695275434-tca3mbr74fl2qdb8gpdv66364i4nmle7.apps.googleusercontent.com",
			"auth_uri":"https://accounts.google.com/o/oauth2/auth",
			"token_uri":"https://accounts.google.com/o/oauth2/token",
			"auth_provider_x509_cert_url":"https://www.googleapis.com/oauth2/v1/certs",
			"client_email":"1062695275434-tca3mbr74fl2qdb8gpdv66364i4nmle7@developer.gserviceaccount.com",
			"client_x509_cert_url":"https://www.googleapis.com/robot/v1/metadata/x509/1062695275434-tca3mbr74fl2qdb8gpdv66364i4nmle7%40developer.gserviceaccount.com",
			"client_secret":"WIWX6nEK_GFc1D980AFr2ngr",
			"redirect_uris":["https://www.example.com/oauth2callback"],
			"javascript_origins":["https://www.example.com"]
		}*/
	}

	public String getClientId() {
		return clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public String getAuth_uri() {
		return auth_uri;
	}

	public String getToken_uri() {
		return token_uri;
	}

	public String getClient_credentials() {
		return client_credentials;
	}

	public String getRedirect_uris() {
		return redirect_uris;
	}

	public String getShayadCode() {
		return shayadCode;
	}
}
