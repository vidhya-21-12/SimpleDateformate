import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateFormate {
	
	public static void main(String[] args) {  
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	    String strDate = formatter.format(date);  
	    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd MMMM yyyy");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
	  
	    formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);  
		
		
		// ISO tie zone
		String isoDatePattern = "yyyy-MM-dd'T'HH:mm:ss'Z'";

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(isoDatePattern);

		String s = simpleDateFormat.format(new Date());
		 System.out.println(s); 
		 
		//set Time zone 
		 
		 Date now = new Date();

		 SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");

		 simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
		 System.out.println("set Time zone " + simpleDateFormat.format(now));

		 simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		 System.out.println("set Time zone " + simpleDateFormat.format(now));
		 
		 //localdate
		 
		 System.out.println(java.time.LocalDate.now());  
		 
		 //localtime
		 
		 System.out.println(java.time.LocalTime.now());    
		 
		 //localtime & localdate
		 
		 System.out.println(java.time.LocalDateTime.now());   
		 
		 Date d = new java.util.Date();    
		System.out.println(d);   
		
	}  
}
