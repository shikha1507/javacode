package practice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class DayOfBirth {
	

   public static void main(String []args)
     {
        int daysInMon[] = {31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};  //Days in month
        int days, month, year;
        char[] dob = new char[110];
        days=15;
        month=7;
        year=1988;
        System.out.println("Date of Birth: "+days+ "/" +month+ "/" +year);
         Date d = new Date();
        System.out.println("Current Date: " +d.getDate()+ "/" +(d.getMonth()+1)+ "/" +(d.getYear()+1900));
                   
        days = daysInMon[month - 1] - days + 1;
            
        /*Calculating the num of year, month and date*/
        days = days + d.getDate();
        month = (12 - month) + d.getMonth();
        year = (d.getYear() + 1900) - year - 1;
                
        if (month >= 12)
        {
        year = year + 1;
        month = month - 12;
        }
        
        /*Result portion*/
        
        System.out.println("Age:" +year+ "years" +month+ "months" +days+ "days");
     }
}





	

