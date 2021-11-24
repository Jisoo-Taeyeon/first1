import javax.swing.*;
import java.awt.*;

public class example1 extends JFrame {
    public void CreateFJrame(String title){
        JFrame jf= new JFrame(title);
        Container container = jf.getContentPane();
        JLabel jl=new JLabel("这是一个窗口");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        container.setBackground(Color.yellow);
        jf.setVisible(true);
        jf.setSize(200,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new example1().CreateFJrame("创建一个JFrame载体");
    }
}
