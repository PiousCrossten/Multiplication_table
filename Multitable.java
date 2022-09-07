import java.util.*;
public class Multitable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("This is the Program to Print Multiplication Table");
      Scanner a=new Scanner(System.in);
      System.out.println("Enter the Number for which You need a muliplication table");
      int x = a.nextInt();
      for(int i=1;i<=10;i++)
      {
    	  System.out.print(+x);
    	  System.out.print( "*" );
    	  System.out.print(+i);
    	  System.out.print( "=" );
    	  System.out.print(+x*i);
    	  System.out.println( "");
      }
      
	}

}
