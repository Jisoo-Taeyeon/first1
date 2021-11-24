package plan001;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MygameFrame extends Frame {
    public  void lanunchFrame(){
        this.setTitle("飞机大战-lh");
        setVisible(true);
        setSize(500,500);//窗口大小
        setLocation(100,100);//窗口位置
        //增加关闭窗口的动作，匿名类部类

        this.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);//正常退出程序;
            }
        });



    }

    public static void main(String[] args) {
        MygameFrame gameFrame =new MygameFrame();
        gameFrame.lanunchFrame();
    }


}
