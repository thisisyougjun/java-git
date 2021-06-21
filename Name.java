import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        String Name;
        int ClassNumber;

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하세요 : ");
        Name=sc.nextLine();
        System.out.println(" 학번을 입력하세요 : ");
        ClassNumber=sc.nextInt();

        System.out.println("\n이름 : "+Name+ "\n학번 : "+ClassNumber);
    }
}
