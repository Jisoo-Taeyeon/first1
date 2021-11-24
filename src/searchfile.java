import java.io.File;

public class searchfile {
    public static void main(String[] args) {
        File f =new File ("F:/算法学习");
        printfile(f,0);

    }
    static  void printfile(File file,int level){
        for (int i = 0; i <level ; i++) {
            System.out.print("-");

        }
        if(file.isDirectory()||file.getName().toLowerCase().endsWith(".pdf")){
            System.out.println(file.getName());
        }

        if(file.isDirectory()){
            File[] files=file.listFiles();
            for (File temp:files) {
                printfile(temp,level+1);
            }
        }
    }

}
