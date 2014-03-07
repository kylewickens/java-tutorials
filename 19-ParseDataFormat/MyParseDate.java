import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MyParseDate {
public static void main(String args[]){
    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
    String date = args.length == 0 ? "2014-12-10" : args[0];

    try {
        Date t = ft.parse(date);
        System.out.println(date + " parses as " + t);
    }
    catch (ParseException e) {
        System.out.println("Oops " + ft);
    }
}
}
