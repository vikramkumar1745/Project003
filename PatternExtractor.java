package com.finalbuilt;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExtractor {
	
	public static List<String> extractDomainOfSender(String input) {
        List<String> result = new ArrayList<String>();

        Pattern pattern = Pattern.compile( 
        		"mailto:(.+?)[\"?]");

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            result.add(matcher.group());
        }

        return result;
    }
	
	public static List<String> extractUrls(String input) {
        List<String> result = new ArrayList<String>();

        Pattern pattern = Pattern.compile(
        		"((ht|f)tp(s?):\\/\\/|www\\.)"
                        + "(([\\w\\-]+\\.){1,}?([\\w\\-.~]+\\/?)*"
                        + "[\\p{Alnum}.,%_=?&#\\-+()\\[\\]\\*$~@!:/{};']*)",
                Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            result.add(matcher.group());
        }

        return result;
    }
	
	public static String[] extracDdomainOfUrls(String input[]) {
		
		String partOne = null;
		String partTwo = null;
		String domain[] = new String[input.length];
		for(int i=0; i<input.length; i++) {
			if(input[i].contains("//")) {
			String str[] = input[i].split("//");
			partOne = str[0];
			partTwo = str[1];
			}
			try {
			if(partTwo.contains("/")) {
				String st[] = partTwo.split("/");
				domain[i] = partOne + "//" + st[0];
			}else {
				domain[i] = partOne + "//" + partTwo;
			}}catch(NullPointerException e)
			{
				
			}
		}
		return domain;
	}
	
	public static List<String> extractDate(String input) {
        List<String> result = new ArrayList<String>();

        Pattern pattern = Pattern.compile(
        		"([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))");

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            result.add(matcher.group());
        }

        return result;
    }

}
