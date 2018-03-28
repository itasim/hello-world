package javaday1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args){
		String searchTarget = "123aaaa";

		Pattern pattern = Pattern.compile("\\d+");//이것이 한글이다.
		Matcher matcher = pattern.matcher(searchTarget);
		while(matcher.find()){
			System.out.println(matcher.group(0));
		}
	}
}