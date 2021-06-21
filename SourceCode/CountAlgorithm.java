import java.util.Scanner;

public class CountAlgorithm{
    public static void main(String[] args) {
        int n=0;
        int cnt=0;
        int Maxnumber;
        int Drainage;


        Scanner sc =new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        Maxnumber = sc.nextInt();
        System.out.println("구하고 싶은 배수를 입력하세요 : ");
        Drainage =sc.nextInt();

        while(true){
            n++;
            if(n%Drainage==0)
                cnt++;
                if(n==Maxnumber)
                        break;
        }
        System.out.println("1부터"+Maxnumber+"까지"+Drainage+"의 배수의 개수는"+cnt+"개 입니다");
    } 
}

