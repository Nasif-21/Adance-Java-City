import java.util.Scanner;
import java.io.Console;
import java.io.File;
import java.util.Formatter;
public class Main
{
	static
	{
		System.out.println("\t----JAVA CITY CLASSIFIED----\t");
	}
	public static void main(String[]args)
	{
    

    System.out.println("");
    System.out.println("\t***************************************");
    System.out.println("\t            Team Members              ");
    System.out.println("\t SHEIKH MUHTASIM NASIF      20-42119-1");
    System.out.println("");
    System.out.println("\t MYSARA NUR TANHA           20-42261-1");
    System.out.println("");
    System.out.println("\tFAHAD BIN ABDULLAH          20-42275-1");
    System.out.println("");
    System.out.println("\t***************************************");
    try{
        Formatter fm=new Formatter("D:/Project/RegFile/Registration.txt"); 
    Scanner sc=new Scanner(System.in);
    String n;
    String d;
    String c;
    String g;
    String p; 
    int a;
    Registration r=new Registration();
    r.f.mkdir();
    r.file1.createNewFile();
    r.file2.createNewFile();
    System.out.println("\t------------------------------");
    System.out.println("\t|       Enter your name       |");
    System.out.println("\t------------------------------");

    System.out.println("");
    r.setName(n=sc.nextLine());
    System.out.println("");
    System.out.println("\t------------------------------");
    System.out.println("\t|   Enter your date of birth  |");
     System.out.println("\t------------------------------");
System.out.println("");
    r.setDob(d=sc.nextLine());
System.out.println("");

    System.out.println("\t------------------------------");
    System.out.println("\t|     Enter your city         |");
    System.out.println("\t------------------------------");
System.out.println("");
    r.setCity(c=sc.nextLine());
    System.out.println("");
    System.out.println("\t------------------------------");
    System.out.println("\t|  Enter gender (Male/Female) |" );
    System.out.println("\t------------------------------");
    System.out.println("");
    r.setGender(g=sc.nextLine());
System.out.println("");
    System.out.println("\t------------------------------");
    System.out.println("\t|       Enter password        |");
    System.out.println("\t------------------------------");
    System.out.println("");
    r.setPass(p=sc.nextLine());
System.out.println("");
    System.out.println("\t------------------------------");
    System.out.println("\t|         Your age            |");
    System.out.println("\t------------------------------");
System.out.println("");
    r.setAge(a=sc.nextInt());
System.out.println("");

    

       if(r.getGender().contains("Male"))
    {
    	System.out.println("\t[   Hello Mr "+r.getName()+"     ]");
    }
    else if(r.getGender().contains("Female"))
    {
    	System.out.println("\t[  Hello Mrs  "+r.getName()+"      ]");
    }
    else
    {
    	System.out.println("Wrong input");
    }
	

    Info in=new Info();
    
    r.signup();
    r.login();
    
    in.dis2();
    

    Student stu=new StuInfo();	
    Tourist t=new Tourist();
    PerInfo pr=new Per();
     
    int k;
    Scanner jj=new Scanner(System.in);
    k=jj.nextInt();
    if(k==3&&a>=8 && a<=26){
        cls();
    stu.disstu();
    }
    else if(k==2&&c!="Dhaka")
    {
     cls();
    t.distor();
    }
    else if(k==1&&c.contains("Dhaka") && a>=19)
    {
    cls();
    pr.disper();
    }
    else
    {
    	System.out.println("Error, please check again");
        
    	
    }

}catch(Exception e)
{
    System.out.println(e);
}

}
public static void cls()
{
try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);
}

    
    
}
}


