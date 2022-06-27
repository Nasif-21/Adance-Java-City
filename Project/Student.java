import java.util.Scanner;
abstract class Student 
{
Student(){}
abstract void disstu();

} 
class StuInfo extends Student
{
	void disstu()
	{
        int k=1;
        while(k>0){
		
		int stm;
        Scanner std=new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" \t How can we Help you? ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("\t------------------------------");
        System.out.println("\t|                              |");
        System.out.println("\t| 1.Educational Institute Info |");
        System.out.println("\t|                              |");
        System.out.println("\t-------------------------------");
        System.out.println("\t|                              |");
        System.out.println("\t| 2.Scolarship facilities      |");
        System.out.println("\t|                              |");
        System.out.println("\t-------------------------------");
        System.out.println("\t|                              |");
        System.out.println("\t| 3.House Facility             |");
        System.out.println("\t|                              |");
        System.out.println("\t------------------------------");
        System.out.println("\t|                              |");
        System.out.println("\t| Press 0 to Exit              |");
        System.out.println("\t|                              |");
        System.out.println("\t-------------------------------");
        
        stm=std.nextInt();
        k=stm;
        if(stm==1)
        {
        	System.out.println("\t----Educational Institute Information----\t");
        	System.out.print("\t---Name----");
        	System.out.print("\t           ---Adress----");
        	System.out.println("");
        	System.out.println("\t/////////////////////////////////////////////");
        	System.out.println("\t 1.Tanha International College      |  Farmgate");
            System.out.println("\t/////////////////////////////////////////////");
        	System.out.println("");
        	System.out.println("\t/////////////////////////////////////////////");
        	System.out.println("\t 2.Thamid Institute of Technology   | Mirpur 14");
            System.out.println("\t/////////////////////////////////////////////");
        	System.out.println("");
        	System.out.println("\t/////////////////////////////////////////////////");
        	System.out.println("\t 3.Nasif Uddin International School  | Shewapara");
            System.out.println("\t//////////////////////////////////////////////////");
        	System.out.println("");
        	System.out.println("\t/////////////////////////////////////////////////");
        	System.out.println("\t4.Rufaida University of Medical Science | Uttara ");
            System.out.println("\t/////////////////////////////////////////////////");
        	System.out.println("");
        	System.out.println("\t////////////////////////////////////////////////////");
        	System.out.println("\t 5.F.Bin Abdullah International University | Gulshan");
            System.out.println("\t////////////////////////////////////////////////////");
        	System.out.println("");
        	System.out.println("\t/////////////////////////////////////////////");
        	System.out.println("\t 6.Sheikh Institute of Textile    |    Banani");
            System.out.println("\t/////////////////////////////////////////////");
        	System.out.println("");
        	System.out.println("\t/////////////////////////////////////////////");
        	System.out.println("\t 7.Salim Sadman  Modern School     |  Gulistan");
            System.out.println("\t/////////////////////////////////////////////");
        	System.out.println("");
        	System.out.println("\t///////////////////////////////////////////////////////");
        	System.out.println("\t 8. NTTR Atomic Science Research Institute   Cankharpur");
            System.out.println("\t///////////////////////////////////////////////////////");
        	System.out.println("");


        }
        if(stm==2)
        {
        	System.out.println("\t-----Scolarship  facilities------\t");
        	
        	System.out.println("\t_____This is only for higher study purpose only______ ");
        	
        	double ps,js,ss,hs;
        	Scanner s=new Scanner(System.in);

        	
        		System.out.println("\t*****   Enter your board exam results ****");
        		System.out.println("\t--------------------------------");
        		System.out.println("\t     Result of PSC exam         ");
        		System.out.println("\t--------------------------------");
        		ps=s.nextDouble();
        		System.out.println("");
        		System.out.println("\t--------------------------------");
        		System.out.println("\t     Result of JSC exam         ");
        		System.out.println("\t--------------------------------");
        		js=s.nextDouble();
        		System.out.println("");
        		System.out.println("\t--------------------------------");
        		System.out.println("\t     Result of SSC exam         ");
        		System.out.println("\t--------------------------------");
                ss=s.nextDouble();
                System.out.println("");
        		System.out.println("\t--------------------------------");
        		System.out.println("\t     Result of HSC exam         ");
        		System.out.println("\t--------------------------------");
                hs=s.nextDouble();
        		System.out.println("");
        		double total=ps+js+ss+hs;
        		
        		System.out.println("");
        		if(ps>5||js>5||ss>5||hs>5)
        		{
        			System.out.println("\tCheck your GPA, you have put more than 5, GPA cannot be greater than 5");
        		}
        		else{
        		 if(total==20)
        		 {
        		System.out.println("\t[   Your total GPA during all board exam was ="+total+"]");
            	System.out.println("\t ~~CONGRATULATIONS!!!~~ You will get 100% Scolarship in your study  ");
            	System.out.println("");
                 }
            
            else if(total>=15&&total<=19)
            {
            	System.out.println("\t[   Your total GPA during all board exam was ="+total+"]");
            	System.out.println("\t ~~CONGRATULATIONS!!!~~ You will get 80% Scolarship in your study  ");
            	System.out.println("");
            }
            else if(total>=13&&total<=14)
            {
            	System.out.println("\t[   Your total GPA during all board exam was ="+total+"]");
            	System.out.println("\t ~~CONGRATULATIONS!!!~~ You will get 30% Scolarship in your study  ");
            	System.out.println("");
            }
            else
            {
            	System.out.println("\t[   Your total GPA during all board exam was ="+total+"]");
            	System.out.println("");
            	System.out.println("\t____Sorry!!! you are not eligble for scolarship______");
            	System.out.println("");
            	System.out.println("\t------Best of luck for next time------");
            	System.out.println("");
            }
        	
        	}
        	
        	
           
}
            
        
            	
        

        if(stm==3)
        {
        	
        	String hl;
        	int nl;
        	char option;
        	Scanner bs=new Scanner(System.in);

        	System.out.println("\t-----House Facility-----\t");
        	System.out.println("\t {{{{{{{{  Your current  location  }}}}}}}}}");
        	hl=bs.nextLine();
        	System.out.println("\t====================================");
        	System.out.println("\t1.Mirpur : fair 13000 BDT per month ");
        	System.out.println("\t====================================");
        	System.out.println(" ");
        	System.out.println("\t====================================");
        	System.out.println("\t2.Gulshan :fair 12000 BDT per month ");
        	System.out.println("\t====================================");
        	System.out.println(" ");
        	System.out.println("\t====================================");
        	System.out.println("\t3.Banani :fair 25000 BDT per month  ");
            System.out.println("\t====================================");
        	System.out.println(" ");
        	System.out.println("\t=====================================");
        	System.out.println("\t4.Basundhara:fair 20000 BDT per month");
        	System.out.println("\t=====================================");
        	System.out.println(" ");
        	System.out.println("\t====================================");
        	System.out.println("\t5.Dhandondi:fair 15000 BDT per month");
        	System.out.println("\t====================================");
        	System.out.println(" ");
        	System.out.println("\t====================================");
        	System.out.println("\t6.Chankharpur:fair 8000 BDT per month");
        	System.out.println("\t====================================");
        	System.out.println(" ");
        	System.out.println("\t====================================");
        	System.out.println("\t7.Jatrabari:fair 9000 BDT per month ");
        	System.out.println("\t====================================");
        	System.out.println(" ");
        	System.out.println("\t====================================");
        	System.out.println("\t8.Diabari :fair 11000 BDT per month ");
        	System.out.println("\t====================================");
        	System.out.println(" ");
        	System.out.println("\t====================================");
        	System.out.println("\t9.Farmgate : fair 10000 BDT per month");
        	System.out.println("\t====================================");
        	System.out.println(" ");
        	System.out.println("\t=======================================");
        	System.out.println("\t10.Cantonment :fair 18000 BDT per month");
        	System.out.println("\t=======================================");
        	System.out.println(" ");
        	System.out.println("\t=======================================");
        	System.out.println("\t11.Mohakhali :fair 16000 BDT per month ");
        	System.out.println("\t=======================================");
        	System.out.println(" ");
        	System.out.println("\t====================================");
        	System.out.println("\t12.Uttara :fair 24000 BDT per month");
        	System.out.println("\t====================================");
        	System.out.println(" ");
        	System.out.println("\t______________________________");
        	System.out.println("\tYour preffered new location = ");
        	nl=bs.nextInt();
        	System.out.println("\t______________________________");
        	if(nl==1){System.out.println("\t1.Mirpur : fair 13000 BDT per month ");}
        	if(nl==2){System.out.println("\t2.Gulshan :fair 12000 BDT per month");}
        	if(nl==3){System.out.println("\t3.Banani :fair 25000 BDT per month");}
        	if(nl==4){System.out.println("\t4.Basundhara:fair 20000 BDT per month");}
        	if(nl==5){System.out.println("\t5.Dhandondi:fair 15000 BDT per month");}
        	if(nl==6){System.out.println("\t6.Chankharpur:fair 8000 BDT per month");}
        	if(nl==7){System.out.println("\t7.Jatrabari:fair 9000 BDT per month");}
        	if(nl==8){System.out.println("\t8.Diabari :fair 11000 BDT per month");}
        	if(nl==9){System.out.println("\t9.Farmgate : fair 10000 BDT per month ");}
        	if(nl==10){System.out.println("\t10.Cantonment :fair 18000 BDT per month");}
        	if(nl==11){System.out.println("\t11.Mohakhali :fair 16000 BDT per month ");}
        	if(nl==12){System.out.println("\t12.Uttara :fair 24000 BDT per month");}
            
            System.out.println("\t---------Yes/No, press Y or N-----------");
            option=bs.next().charAt(0);
            if(option=='Y'){
            System.out.println("\t::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        	System.out.println("\tYour have been setteled to "+nl+"no location");
        	System.out.println("\t::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            }
            else if(option=='N')
            {
            disstu();
            }
        }
        }
       
    }
}




	

