import java.util.Scanner;

public class judge {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入年数：");
        int year=in.nextInt();
        if(year%4==0&year%100!=0||year%400==0){
            System.out.println(year+"年是瑞年");
        }
        else System.out.println(year+"不是瑞年");

    }
}
