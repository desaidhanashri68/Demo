import java.util.*;
public class array5 
{
    public static void main(String[] args) 
    {
      int m,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter rows");
      m=sc.nextInt();
      System.out.println("Enter coloums");
      n=sc.nextInt();
      int a[][]=new int[m][n];
      System.out.println("Enter elements of an array");
      for( int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
              a[i][j]=sc.nextInt();
          }
      }
      System.out.println("Entered elements of an array");
      for( int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
             System.out.print(a[i][j]+" ");
          }
          System.out.println();
      }
          
      
      
       
        
    }
}
