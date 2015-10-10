package learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TryRegex {
	
	public static void main(String args[]){
		
		String test = "cat cat cat cattie cat";
		String pattern = "\\bcat\\b";
		int count = 0;
		Pattern r = Pattern.compile(pattern);
		
		Matcher m = r.matcher(test);
		while(m.find()){
			test = m.replaceAll("boy");
		}
		System.out.println("Final output :"+test);
	}

}

