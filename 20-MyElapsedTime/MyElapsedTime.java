import java.util.Date;
import java.text.ParseException;

public class MyElapsedTime {
public static void main(String args[]) {
    try {
        long s = System.currentTimeMillis();
        System.out.println(new Date());
        Thread.sleep(4800);
        System.out.println(new Date());
        long e = System.currentTimeMillis();
        System.out.println("Difference is : " + (e - s));
    }
    catch (Exception e) {
       System.out.println("Oops");
    }
}
}
