package ValidatePassword;

import java.util.Scanner;

public class password {

    public static void main(String[] args) 
    {
    int i;
    for( i=0;i<3;i++)
    {
    String Password;
    Scanner obj = new Scanner(System.in);
    System.out.print("ENTER THE NEW PASSWORD: ");
    Password = obj.next();
    int length = 0;
    int numCount = 0;
    int capitalCount = 0;
    for (int x = 0; x < Password.length(); x++) 
    {
      if ((Password.charAt(x) > 47 && Password.charAt(x) < 58)) 
      {
        numCount++;
      }
      else if ((Password.charAt(x) > 64 && Password.charAt(x) < 91)) 
      {
        capitalCount++;
      }
      length = (x + 1);
    }
     if (numCount < 2) 
     {
       System.out.println("Password must contain atleast 2 numbers");
     
    }
    if (capitalCount < 2) 
    {
      System.out.println("Password must contain atleast two capital letters");
    }
    else if (length < 2) 
    {
      System.out.println("Password must be long");
    }
   
    System.out.println("The password is:"+Password);
    }
   }
}
