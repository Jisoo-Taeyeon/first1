package play002;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MygameFrame extends Frame {
    public void paint(){}


  /*  public  void paint(Graphics g){

        Color c =g.getColor();
        g.setColor(new Color(255,0,255));
        //画直线
        g.drawLine(100,100,400,400);
        //画矩形
        g.drawRect(100,100,300,200);
        g.setColor(c);


    }*/
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
