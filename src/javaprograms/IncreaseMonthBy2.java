package javaprograms;

import java.util.Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class IncreaseMonthBy2 {
	public static void main(String[] args) throws ParseException {
		String dt="2000-07-20";
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd");
		Calendar c=Calendar.getInstance();
        c.setTime(sdf.parse(dt));
        c.add(Calendar.MONTH, 5);
        dt=sdf.format(c.getTime());
        System.out.println(dt);
        
		
				
	}

}
