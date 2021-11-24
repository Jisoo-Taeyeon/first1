public class Trycatch {
    public static void main(String[] args) {


        int[] arr=new int[5];
        System.out.println(arr[5]);
       //String str=NULL;

        try{
            int i=1/0;
        }catch(Exception e)
        {
            //System.out.println("除数");
            e.printStackTrace();
        }
        System.out.println(arr(20,16));
      //   Exception e;

    }
    public static  int arr(int a,int b){
        if(b==0||a==0){
            return  0;
        }
        return a%b==0 ? b:arr(b,a%b);
    }
}
