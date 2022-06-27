import java.io.File;
import java.util.Scanner;

public class Read
{
 public static void main(String[]args)
 { try{
 	File re=new File("D:/Project/RegFile/Code.txt");
 	Scanner sc=new Scanner(re);
 	while(sc.hasNext())
 	{
 		String option=sc.next();
 	}
 }catch(Exception e)
 {
 	System.out.println(e);
 }
 }
}