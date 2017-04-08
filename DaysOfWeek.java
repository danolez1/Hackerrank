package Beginner;

import java.util.Calendar;
/**
 *
 * @author User
 */import java.util.Scanner;
public class DaysOfWeek {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        String mm = in.next();
        String dd = in.next();
        String yy = in.next();
        
        int day = Integer.valueOf(dd);
        int month = Integer.valueOf(mm)-1;
        int year = Integer.valueOf(yy);
        
        Calendar calendar = Calendar.getInstance();
        
        calendar.set(year, month, day);
        
/**  OR PREFERABLY USE THIS
      calendar.set(Calendar.YEAR,year);
      calendar.set(Calendar.MONTH, month); 
      calendar.set(Calendar.DAY_OF_MONTH, day);*/
            Integer result = calendar.get(Calendar.DAY_OF_WEEK);
            switch(result){
                case 1:
                    System.out.println("SUNDAY");
                    break;
                case 2:
                    System.out.println("MONDAY");
                    break;
                case 3:
                    System.out.println("TUESDAY");
                    break;
                case 4:
                    System.out.println("WEDNESDAY");
                    break;
                case 5:
                    System.out.println("THURSDAY");
                    break;
                case 6:
                    System.out.println("FRIDAY");
                    break;
                case 7:
                    System.out.println("SATURDAY");
                    break;
                default:
                    break;    
                                        
            }
    }
}
