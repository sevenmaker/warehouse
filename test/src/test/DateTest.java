package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String from = "2014-12-102359";
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-ddHHmm");
		Date to = transFormat.parse(from);
		
		System.out.println(to);
		
	}

}
