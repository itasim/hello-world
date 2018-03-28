package javaday2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex{
	public static void main(String[] args){
		String searchTarget = "Luke Skywarker 02-123-4567 luke@daum.net\n darth_vader@gmail.com\nprincess leia 010 2454 3457 leia@gmail.com";

		
		Pattern pattern = Pattern.compile("\\d+");//이것이 한글이다.
		Matcher matcher = pattern.matcher(searchTarget);
		while(matcher.find()){
			System.out.println(matcher.group(0));
		}
	}
}