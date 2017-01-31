package Exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlFromString {

	void check1(String urlToCheck){
		try {
			URL url = new URL(urlToCheck);
		} catch(MalformedURLException e)   {
			e.printStackTrace();
		}
		
	}
	void check2(String urlToCheck) throws MalformedURLException{
		
		URL url = new URL(urlToCheck);
	}
	
	

}
