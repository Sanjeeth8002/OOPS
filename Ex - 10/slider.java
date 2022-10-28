package exp_10;

import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.*;  
class slider implements AdjustmentListener  
{ 
    JFrame f;
    JScrollBar s,s1,s2;
    
slider(){  
f= new JFrame("Scrollbar Example");
s=new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 130);  
s1=new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 130); 
s2=new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 130); 
s.setBounds(100,100, 100,30);  
s1.setBounds(100,150, 100,30);
s2.setBounds(100,200, 100,30);
s.addAdjustmentListener(this);
s1.addAdjustmentListener(this);
s2.addAdjustmentListener(this);
f.add(s);  
f.add(s1); 
f.add(s2); 

f.setSize(400,400);  
f.setLayout(null);  
f.setVisible(true); 
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
    @Override
    public void adjustmentValueChanged(AdjustmentEvent ae)
{
    int yellow= s.getValue();
    int pink = s1.getValue();
    int blue =s2.getValue();
    f.getContentPane().setBackground(new Color(yellow,pink,blue));
   
}
public static void main(String args[])  
{  
        slider slider = new slider();  
}}
