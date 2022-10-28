package Distconverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Converter implements ActionListener
{
     JFrame jf;
     JLabel L1, L2;
     JTextField tf1, tf2;
     JButton b1;
    
     Converter()
     {
          jf = new JFrame();
         
          jf.setSize(350,200);
          jf.setTitle("Converter");
         
          FlowLayout FL = new FlowLayout(FlowLayout.CENTER,20,20);
          jf.setLayout(FL);
         
          Font f1 = new Font("TimesNewRoman Script", Font.BOLD, 15);
          Font f2 = new Font("TimesNewRoman Script", Font.BOLD, 15);
          Dimension d1 = new Dimension(100,30);
          Dimension d2 = new Dimension(120,30);

          L1 = new JLabel("Miles:", SwingConstants.RIGHT);
          L2 = new JLabel("Kilometers:",SwingConstants.RIGHT);
          L1.setFont(f1);
          L1.setPreferredSize(d1);
          L2.setFont(f1);
          L2.setPreferredSize(d1);
         
          tf1=new JTextField("",15);
          tf2=new JTextField("",15);
         
          tf1.setFont(f1);
          tf2.setFont(f1);
         
                  
          b1 = new JButton("CONVERT");
          b1.setFont(f2);
          b1.setPreferredSize(d2);
             
          jf.add(L1);
         
          jf.add(tf1);
          jf.add(L2);
          jf.add(tf2);
          jf.add(b1);
         
          b1.addActionListener(this);
                       
          jf.setVisible(true);
          jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
    
    
     public void actionPerformed(ActionEvent ae)
     {
          double m = Double.parseDouble(tf1.getText());
          double km = m*1.609;
         
          tf2.setText(Double.toString(km));
     }
    
     public static void main(String as[])
     {
          new Converter();
     }
}
