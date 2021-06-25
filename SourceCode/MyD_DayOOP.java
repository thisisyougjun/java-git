import java.util.Calendar;
import java.util.Date;

public class MyD_DayOOP {
    public static void main(String[] args) {
        
    DDay[] blackpink =new DDay[4];

    blackpink[0].new DDay("지수",1995,1,3);
    blackpink[1].new DDay("제니",1996,1,16);
    blackpink[2].new DDay("로제",1997,2,11);
    blackpink[3].new DDay("리사",1997,3,27);
    System.out.println(
        blackpink[0].getMyDDay() + "," +
        blackpink[1].getMyDDay() + "," +
        blackpink[2].getMyDDay() + "," +
        blackpink[3].getMyDDay()
        );
    }
}

class DDay{
    String name=null;
    public DDay(String name,int y ,int m ,int d){
        this.setName(name);
        this.setMyBirth(y, m, d);
    }
    Calendar myBirth=Calendar.getInstance();
    public void setName(String name){
        this.name=name;
    }
    
    public void setMyBirth(int y,int m ,int d){
        this.myBirth.set(y, m-1, d);
    }
    
    public void getMyDDay(){
        Calendar today = Calendar.getInstance();
        long dday_millis=today.getTimeInMillis() -myBirth.getTimeInMillis();
        dday_millis=dday_millis /1000/24/60/60;
        return Long.valueOf(dday_millis).intValue();
        
    }
}