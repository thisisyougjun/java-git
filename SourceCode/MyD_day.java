import java.util.Calendar;
import java.util.Date;

public class MyD_day{
    public static void main(String[] args) {
        
        Date d=new Date(); //오늘 날자 가져오기
        System.out.println(d);
        Date dd=new Date(d.getTime()+24*60*60*1000); //오늘 날짜에서 하루를 더하는 방법
        System.out.println(dd);

        Calendar today=Calendar.getInstance(); //오늘 날짜를 객체로 가져오기
        Calendar myBirth =Calendar.getInstance(); //날짜를 임의로 지정하는 방법
        myBirth.set(2004, 6-1, 25);

        //System.out.println(today);
        long dday_millis=today.getTimeInMillis() - myBirth.getTimeInMillis();
        printCalendar(today);
        System.out.println("부터");
        printCalendar(myBirth);
        System.out.println("까지");
        System.out.println(dday_millis /1000/24/60/60);
        System.out.println("차이가 납니다");
        System.out.println("");
    }

    public void printCalendar(Calendar c){
        System.out.println(c.get(Calendar.YEAR) + "년");
        System.out.println(c.get(Calendar.MONTH)+1 +"월");
        System.out.println(c.get(Calendar.DAY_OF_MONTH)+"일");
        //System.out.println(c.get(Calendar));
    }
}