package protectproperties.ProtectDefault;
import java.util.*;
public class ProtectDefault 
{
    protected int m1,m2,m3,tot_mark,tot_subj,avg,ch;
    Scanner s=new Scanner(System.in);
    protected void get()
    {
        System.out.println("Enter your m1,m2,m3,tot_subj");
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
        tot_subj=s.nextInt();
        tot_mark=m1+m2+m3;
        avg=tot_mark/tot_subj;
    }
    protected void put()
    {
    System.out.println("Tot_mark is"+tot_mark+"\nAvg is"+avg);
    if(avg>90 &&avg<=100)
    {
        System.out.println("Very good");
    }
    else if(avg>80 &&avg<=90)
    {
        System.out.println("good");
    }
    else if(avg>70 && avg<=80)
    {
        System.out.println("Average");
    }
    else
    {
        System.out.println("Poor");
    }
    }
}