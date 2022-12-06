
package DemoGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class UserPanel implements ActionListener,MouseListener
{
    JFrame jf;
    JTextField jt1,jt2;
    JButton jb;
    JLabel jl1,jl2,jl3;
    JComboBox jcb;
    public UserPanel() 
    {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ee) {
            System.out.println(ee);
        }
        jf = new JFrame("*Game Developed By Vishal Nimbarte....!");
        jf.setSize(520,480);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\JAVA Netbine\\Second Practice\\08TicTacToeGame\\src\\main\\java\\DemoGame\\v-icon-17.jpg");
        jf.setIconImage(icon);
        
        jf.getContentPane().setBackground(Color.lightGray);
        jf.setLayout(null);
        
        jl1 = new JLabel("Enter Player One(X) : ");
        Font font = new Font("Roman",1, 12);
        jl1.setFont(font);
        jl1.setBounds(50,50,120,30);
        jf.add(jl1);
        
        jt1 = new JTextField();
        jt1.setBounds(200,50,250,40);
        jf.add(jt1);
        
        jl2 = new JLabel("Enter Player Two(0) : ");
        jl2.setFont(font);
        jl2.setBounds(50,150,120,30);
        jf.add(jl2);
        
        jt2 = new JTextField();
        jt2.setBounds(200,150,250,40);
        jf.add(jt2);
        
        jl3 = new JLabel("Select Series");
        jl3.setFont(font);
        jl3.setBounds(50,250,120,30);
        jf.add(jl3);
        
        String[] series_number = new String[]{"3","5","7"};
        jcb = new JComboBox(series_number);
        jcb.setBounds(200, 250,250,40);
        jf.add(jcb);
        
        jb = new JButton("Start Game");
        jb.setFont(font);
        jb.setBounds(200,350,150,40);
        jb.addActionListener(this);
        jb.addMouseListener(this);
        jf.add(jb);
        
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(jt1.getText().trim().equals("") && jt2.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(jt1,"Player's Name Empty..!","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        if(e.getSource()==jb)
        {
            String player1 = jt1.getText();
            String player2 = jt2.getText();
            String series = (String)jcb.getSelectedItem();
            
            GamePanel gp = new GamePanel(player1,player2,Integer.parseInt(series));
            gp.openGamePanel();
            jf.setVisible(false);
        }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
       jb.setBackground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
      jb.setBackground(null);
    }
    
}
