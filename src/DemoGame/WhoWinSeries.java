package DemoGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class WhoWinSeries
{

    public WhoWinSeries(String message) 
    {
        JFrame jf = new JFrame();
        jf.setSize(600,100);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\JAVA Netbine\\Second Practice\\08TicTacToeGame\\src\\main\\java\\DemoGame\\v-icon-17.jpg");
        jf.setIconImage(icon);
        
        jf.getContentPane().setBackground(Color.lightGray);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        
        JLabel jl = new JLabel(message);
        jl.setBounds(80,8,500,50);
        jl.setFont(new Font("Arial",1,30));
        jl.setForeground(Color.darkGray);
        jf.add(jl);
        
        jf.setVisible(true);
    }
    public static void main(String[] args)
    {
        new WhoWinSeries("Vishal is my name");
    }
}
