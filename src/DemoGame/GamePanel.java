package DemoGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class GamePanel implements ActionListener {
    //frame instance

    JFrame jf;
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;

    //logic part instance
    int count = 0;
    String X0_value = "", title_str;
    boolean win = false;
    Color color_1;

    String player1, player2;//Vishal Nik
    String player_who_win;

    boolean player1_turn = true;
    int total_series;//3
    int series_count = 1;
    String who_win_series_player_name;

    int player1_win_count = 0, player2_win_count = 0;

    GamePanel(String player1, String player2, int total_series) {
        this.player1 = player1;//Vishal
        this.player2 = player2;//Nik
        this.total_series = total_series;//3
    }

    void openGamePanel() {
        
        //Look and Feel to the frame using the setLookAndFeel

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ee) {
            System.out.println(ee);
        }

        //creating the frame
        jf = new JFrame("Tic Tac Toe Game By Vishal");
        jf.setTitle(player1 + "(X) turns");
        jf.setSize(520,480);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\JAVA Netbine\\Second Practice\\08TicTacToeGame\\src\\main\\java\\DemoGame\\v-icon-17.jpg");
        jf.setIconImage(icon);
        GridLayout gd = new GridLayout(3, 3);
        jf.setLayout(gd);

        //first button
        jb1 = new JButton();
        jb1.addActionListener(this);
        jf.add(jb1);

        //second button
        jb2 = new JButton();
        jb2.addActionListener(this);
        jf.add(jb2);

        //third button
        jb3 = new JButton();
        jb3.addActionListener(this);
        jf.add(jb3);

        //four button
        jb4 = new JButton();
        jb4.addActionListener(this);
        jf.add(jb4);

        //five button
        jb5 = new JButton();
        jb5.addActionListener(this);
        jf.add(jb5);

        //six button
        jb6 = new JButton();
        jb6.addActionListener(this);
        jf.add(jb6);

        //seven button
        jb7 = new JButton();
        jb7.addActionListener(this);
        jf.add(jb7);

        //eight button
        jb8 = new JButton();
        jb8.addActionListener(this);
        jf.add(jb8);

        //nine button
        jb9 = new JButton();
        jb9.addActionListener(this);
        jf.add(jb9);

        jf.setVisible(true);
    }

    //Logic Part in the tictactoe game..!
    @Override
    public void actionPerformed(ActionEvent e) {

        //"X" Or "0" printing logic with the help odd and even number 
        //number is even then print -> X
        //number is odd then print -> 
        count = count + 1;// 1 

        //most imporantce login in tictactow game
        if (player1_turn == true)
        {
            if (count == 1) {
                color_1 = Color.CYAN;
            } else if (count == 2) {
                color_1 = Color.YELLOW;
            } else if (count == 4) {
                color_1 = Color.MAGENTA;
            } else if (count == 6) {
                color_1 = Color.RED;
            } else {
                color_1 = Color.YELLOW;
            }
            X0_value = "X";//X
            title_str = "0";//0
            jf.setTitle(player2 + " (" + title_str + ") " + "turns");
            player1_turn = false;//false
        }
        else
        {
            if (count == 2) {
                color_1 = Color.red;
            } else if (count == 3) {
                color_1 = Color.blue;
            } else if (count == 5) {
                color_1 = Color.black;
            } else {
                color_1 = Color.red;
            }
            X0_value = "0";//0
            title_str = "X";//X
            jf.setTitle(player1 + " (" + title_str + ") " + "turns");
            player1_turn = true;
        
        }
        
        //Excute 1
        if (e.getSource() == jb1) {
            Font font = new Font("Castellar", 1, 60);
            jb1.setFont(font);//set font size
            jb1.setText(X0_value);//X
            jb1.setBackground(color_1);
            jb1.setEnabled(false);//button enabled->false | button able->true
        }
        
        
        if (e.getSource() == jb2) {
            Font font = new Font("Castellar", 1, 60);
            jb2.setFont(font);//set font size
            jb2.setText(X0_value);
            jb2.setBackground(color_1);
            jb2.setEnabled(false);//button enabled->false | button able->true
        }

        if (e.getSource() == jb3) {
            Font font = new Font("Castellar", 1, 60);
            jb3.setFont(font);//set font size
            jb3.setText(X0_value);
            jb3.setBackground(color_1);
            jb3.setEnabled(false);//button enabled->false | button able->true
        }

        if (e.getSource() == jb4) {
            Font font = new Font("Castellar", 1, 60);
            jb4.setFont(font);//set font size
            jb4.setText(X0_value);
            jb4.setBackground(color_1);
            jb4.setEnabled(false);//button enabled->false | button able->true
        }
        if (e.getSource() == jb5) {
            Font font = new Font("Castellar", 1, 60);
            jb5.setFont(font);//set font size
            jb5.setText(X0_value);
            jb5.setBackground(color_1);
            jb5.setEnabled(false);//button enabled->false | button able->true
        }
        if (e.getSource() == jb6) {
            Font font = new Font("Castellar", 1, 60);
            jb6.setFont(font);//set font size
            jb6.setText(X0_value);
            jb6.setBackground(color_1);
            jb6.setEnabled(false);//button enabled->false | button able->true
        }
        if (e.getSource() == jb7) {
            Font font = new Font("Castellar", 1, 60);
            jb7.setFont(font);//set font size
            jb7.setText(X0_value);
            jb7.setBackground(color_1);
            jb7.setEnabled(false);//button enabled->false | button able->true
        }
        if (e.getSource() == jb8) {
            Font font = new Font("Castellar", 1, 60);
            jb8.setFont(font);//set font size
            jb8.setText(X0_value);
            jb8.setBackground(color_1);
            jb8.setEnabled(false);//button enabled->false | button able->true
        }
        if (e.getSource() == jb9) {
            Font font = new Font("Castellar", 1, 60);
            jb9.setFont(font);//set font size
            jb9.setText(X0_value);//X
            jb9.setBackground(color_1);
            jb9.setEnabled(false);//button enabled->false | button able->true
        }
        winningPossibilities();

    }

    void winningPossibilities() {
        //Horizontal Winning Possibilities
        if (jb1.getText() == jb2.getText() && jb2.getText() == jb3.getText() && jb3.getText() != "")      {win = true;}
        else if (jb4.getText() == jb5.getText() && jb5.getText() == jb6.getText() && jb6.getText() != "") {win = true;}
        else if (jb7.getText() == jb8.getText() && jb8.getText() == jb9.getText() && jb9.getText() != "") {win = true;}
        //Vertical Winning Possibilities
        else if (jb1.getText() == jb4.getText() && jb4.getText() == jb7.getText() && jb7.getText() != "") {win = true;} 
        else if (jb2.getText() == jb5.getText() && jb5.getText() == jb8.getText() && jb8.getText() != "") {win = true;} 
        else if (jb3.getText() == jb6.getText() && jb6.getText() == jb9.getText() && jb9.getText() != "") {win = true;} 
        //Diagonal Winning Posillities
        else if (jb1.getText() == jb5.getText() && jb5.getText() == jb9.getText() && jb9.getText() != "") {win = true;} 
        else if (jb3.getText() == jb5.getText() && jb5.getText() == jb7.getText() && jb7.getText() != "") {win = true;} 
        else {win = false;}
        whoWins();
    }

    void whoWins() {

        if (win == true) {
            series_count = series_count + 1;//2
            if (X0_value.equals("X"))//player one win
            {
                player_who_win = player1;//Vishal
                player1_win_count = player1_win_count + 1;//1 2
            }
            else//palyer two win
            {
                player_who_win = player2;//Deepak
                player2_win_count = player2_win_count + 1;//1
            }
            String win_title = player_who_win + " (" + X0_value + ") " + "Wins..!";
            jf.setTitle(win_title);
            JOptionPane.showMessageDialog(jf, win_title);
            restartGame();
        } 
        else if (win == false && count == 9)//Draw match
        {
            series_count++;

            JOptionPane.showMessageDialog(jf, " Match Draw..! ");
            restartGame();
        }
    }

    void restartGame() {

        if (total_series >= series_count) {
            int i = JOptionPane.showConfirmDialog(jf, "Do You Want To Restart The Game ?");
            if (i == 0) {
                jb1.setText("");
                jb2.setText("");
                jb3.setText("");
                jb4.setText("");
                jb5.setText("");
                jb6.setText("");
                jb7.setText("");
                jb8.setText("");
                jb9.setText("");

//                jb1.setEnabled(true);
//                jb2.setEnabled(true);
//                jb3.setEnabled(true);
//                jb4.setEnabled(true);
//                jb5.setEnabled(true);
//                jb6.setEnabled(true);
//                jb7.setEnabled(true);
//                jb8.setEnabled(true);
//                jb9.setEnabled(true);
                jb1.setBackground(null);
                jb2.setBackground(null);
                jb3.setBackground(null);
                jb4.setBackground(null);
                jb5.setBackground(null);
                jb6.setBackground(null);
                jb7.setBackground(null);
                jb8.setBackground(null);
                jb9.setBackground(null);

                btnEnabled(true);
                count = 0;
                win = false;

                if (player_who_win.equals(player1))
                {
                    player1_turn = true;
                } 
                else 
                {
                    player1_turn = false;
                }

                jf.setTitle(player_who_win + " (" + X0_value + ") turns");

            } 
            else if (i == 1)
            {
                System.exit(0);
            } 
            else
            {
                btnEnabled(false);
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(jf, "Series Completed..!");
            if (player1_win_count > player2_win_count) 
            {
//                  JOptionPane.showMessageDialog(jf,player1+" win the series..!");
                new WhoWinSeries(player1 + " win the series..!");
                jf.setVisible(false);
            } 
            else if (player2_win_count > player1_win_count)
            {
//                   JOptionPane.showMessageDialog(jf,player2+" win the series..!");
                new WhoWinSeries(player2 + " win the series..!");
                jf.setVisible(false);
            } else 
            {
//                   JOptionPane.showMessageDialog(jf,"Series Draw..!");
                new WhoWinSeries(" Series Draw..!");
                jf.setVisible(false);
            }
        }

    }

    void btnEnabled(boolean b) {
        jb1.setEnabled(b);
        jb2.setEnabled(b);
        jb3.setEnabled(b);
        jb4.setEnabled(b);
        jb5.setEnabled(b);
        jb6.setEnabled(b);
        jb7.setEnabled(b);
        jb8.setEnabled(b);
        jb9.setEnabled(b);
    }
    //only for testing purpose
    
}

