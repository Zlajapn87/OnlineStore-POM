package data;

import org.testng.annotations.DataProvider;

public class FaceBookData {
	
	//Args: Urls and titles
	@DataProvider(name = "pages")
	public static Object[][] pages(){
		
		return new Object[][] {
			{"https:/facebook.com", "Facebook - Log In or Sign Up"},
			{"https:/www.google.com", "Google"},
			{"https://www.yahoo.com", "Yahoo" }
		};
	}

}


	
