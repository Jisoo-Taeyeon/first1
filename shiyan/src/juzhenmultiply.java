import java.util.Scanner;

public class juzhenmultiply {

    public static void input(int n[][]){
        for(int i=0;i<n.length;i++){
            Scanner in=new Scanner(System.in);
            for (int j = 0; j < n[i].length; j++) {

               n[i][j]= in.nextInt();
            }
        }
    }
    public static void output(int a[][]){
        for(int i=0;i<a.length;i++){
            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j]+" ");
                if(j+1==a[i].length) System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int a[][]=new int[2][3];
        int b[][]=new int[3][2];
        int c[][]=new int[2][2];
        System.out.println("请输入矩阵A的值：");
        input(a);
        System.out.println("请输入矩阵B的值：");
        input(b);
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++) {
                for(int k=0;k<a[0].length;k++) {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        output(c);




    }
}
