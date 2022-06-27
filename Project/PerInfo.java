import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.util.Formatter;
interface PerInfo
{
    abstract void disper();
}
class Per implements PerInfo{

    public void disper()
    {
       
        int k=1;
        while(k>0){
        
        int stm;
        Scanner std=new Scanner(System.in);
        System.out.println("\t.................................................................");
        System.out.println("\t| Dear Citizen,                                                 |");
        System.out.println("\t|You are permanent in this city . So you can take facilities.    |");
        System.out.println("\t.................................................................");

        System.out.println("\t________________________________________");
        System.out.println("\t|                                       |");
        System.out.println("\t|          Permanent Information        |");
        System.out.println("\t|_______________________________________|");
        System.out.println("");

        System.out.println("\t****************************************");
        System.out.println("\t|           1.Bank Service              |");
        System.out.println("\t*****************************************");
        System.out.println("");

        System.out.println("\t*****************************************");
        System.out.println("\t|           2.Gas Service                |");
        System.out.println("\t*****************************************");
        System.out.println("");

        System.out.println("\t*****************************************");
        System.out.println("\t|          3.Electricity Service         |");
        System.out.println("\t******************************************");
        System.out.println("");

        System.out.println("\t******************************************");
        System.out.println("\t|           4.Police Service              |");
        System.out.println("\t******************************************");
        System.out.println("");

        System.out.println("\t****************************************************");
        System.out.println("\t|           5.Internet and Telephone Service        |");
        System.out.println("\t****************************************************");
        System.out.println("");

        System.out.println("\t****************************************************");
        System.out.println("\t|           6.Airlines Service                      |");
        System.out.println("\t****************************************************");
        System.out.println("");

        System.out.println("\t****************************************************");
        System.out.println("\t|           7.Complains and Suggestions            |");
        System.out.println("\t****************************************************");
        System.out.println("");

        System.out.println("\t__________________________ ");
        System.out.println("\t|    Press 0 to Exit      |");
        System.out.println("\t|_________________________|");
        System.out.println(" ");
        stm=std.nextInt();
        k=stm;
        
        if(stm==1)
        {
            int k2;
            System.out.println("\t_____________________________ ");
            System.out.println("\t|                            |");
            System.out.println("\t|        Bank Service        |");
            System.out.println("\t|____________________________|");
            System.out.println(" ");

            System.out.println("\t *************************");
            System.out.println("\t |      1.Withdraw       |");
            System.out.println("\t************************");
            System.out.println(" ");

            System.out.println("\t************************** ");
            System.out.println("\t|       2.Diposit         |");
            System.out.println("\t***************************");
            System.out.println(" ");

            System.out.println("\t*************************** ");
            System.out.println("\t|       3.Loan            | ");
            System.out.println("\t*************************** ");
            System.out.println(" ");
            
            k2=std.nextInt();
             if(k2==1)
            {
               int ammount;
               int balance;
               int withdraw;
               System.out.println("\t ______________________________");
               System.out.println("\t|     Enter your Amount:       |");
               System.out.println("\t|______________________________|");
               System.out.println(" ");

               Scanner w=new Scanner(System.in);
                ammount=w.nextInt();
                System.out.println("\t______________________________ ");
                System.out.println("\t|    Enter your Balance:      | ");
                System.out.println("\t|_____________________________| ");
                System.out.println(" ");

                balance=w.nextInt();
                if(ammount>balance)
                {
                    System.out.println("\t Sorry, your ammount is higher than deposit");
                }
                else
                {
                withdraw= balance-ammount;
                System.out.println("\t--------------------------------------- ");
                System.out.println("\tYour current ammount is :"+withdraw      );
                System.out.println("\t---------------------------------------  ");
                }
 

            }
            if(k2==2)
            {
               int ammount;
               int balance;
               int diposit;
               System.out.println("\t______________________________");
               System.out.println("\t|     Enter your Amount:      | ");
               System.out.println("\t|_____________________________| ");
               System.out.println(" ");

               Scanner w=new Scanner(System.in);
                ammount=w.nextInt();
                System.out.println("\t_____________________________ ");
                System.out.println("\t|     Enter your Balance:    | ");
                System.out.println("\t|____________________________| ");
                System.out.println(" ");

                balance=w.nextInt();
                diposit= balance+ammount;
                System.out.println("\t---------------------------------------- ");
                System.out.println("\t   Your diposit ammount is :"+diposit     );
                System.out.println("\t---------------------------------------- "); 
                System.out.println(" ");
            }
            if(k2==3)
            {
                int m;
                int loan;
                System.out.println("\t________________________________________________");
                System.out.println("\t|    How much money you want to take loan?      |");
                System.out.println("\t|_______________________________________________|"); 
                System.out.println(" ");

                Scanner j= new Scanner (System.in);
                loan=j.nextInt();
                if( loan>=100000 && loan<=5000000){
                    System.out.println("\t--------------------------- ");
                    System.out.println("\t|   Dear Customar,         | ");
                    System.out.println("\t|   you can take loan      | ");
                    System.out.println("\t---------------------------- ");
                   }
                else  {
                    System.out.println("\t---------------------------- ");
                    System.out.println("\t|   Dear Customar,             |");
                    System.out.println("\t|   Sorry,you cannot take loan |");
                    System.out.println("\t--------------------------------");
                }
                
            }
        }
        if(stm==2)
        {   
            System.out.println("\t______________________________ ");
            System.out.println("\t|                             |");
            System.out.println("\t|        Gas Service          | ");
            System.out.println("\t|_____________________________| ");
            int permonth=400;
            int month;
            int bills;
            System.out.println("\t_______________________________________ ");
            System.out.println("\t|  How many month you want to payment? | ");
            System.out.println("\t|______________________________________| ");
            System.out.println(" ");
            Scanner sc= new Scanner(System.in);
            month=sc.nextInt();
            bills=permonth*month;
            System.out.println("\t--------------------------- ");
            System.out.println("\t  Your gas bill:"+bills      );
            System.out.println("\t--------------------------- ");


        }
       
        if(stm==3)
        {
            System.out.println(" \t___________________________________");
            System.out.println(" \t|                                  | ");
            System.out.println(" \t|       Electricity Service        | ");
            System.out.println(" \t|__________________________________|");
            int permonth=600;
            int month;
            int bills;
            System.out.println("\t __________________________________________ ");
            System.out.println("\t|  How many month you want to payment?     |");
            System.out.println("\t|__________________________________________| ");
            Scanner sc= new Scanner(System.in);
            month=sc.nextInt();
            bills=permonth*month;
            System.out.println("\t------------------------------- ");
            System.out.println("\tYour Electric  bill:"+bills       );
            System.out.println("\t-------------------------------- ");
        } 
        if(stm==4)
        {

            int p;
            Scanner pl=new Scanner(System.in);
            System.out.println("\t_____________________________________ ");
            System.out.println("\t|                                   |");
            System.out.println("\t|        Police Service             | ");
            System.out.println("\t|___________________________________| ");
            System.out.println(" ");

            System.out.println("\t************************************* ");
            System.out.println("\t|          1.Contact                |");
            System.out.println("\t************************************* ");
            System.out.println(" ");

            System.out.println("\t************************************* ");
            System.out.println("\t|          2.Complain               |");
            System.out.println("\t*************************************");
            System.out.println(" ");

            System.out.println("\t************************************ ");
            System.out.println("\t|          3.Rules and regulations  |");
            System.out.println("\t************************************* ");
            System.out.println(" ");

            System.out.println("\t************************************* ");
            System.out.println("\t|          4.Return to menu         |");
            System.out.println("\t************************************* ");
            p=pl.nextInt();
            if(p==1)
            {
               String name;
               String phonenumber;
               String address;

               System.out.println("\t-----------------------------------------------------------------");
               System.out.println("\t|                            Dear Citizen ,                                                |");
               System.out.println("\t| When you face any problem, please don't be afraid to call 999.|");
               System.out.println("\t-----------------------------------------------------------------");
               System.out.println(" ");

               System.out.println("\t ____________________________________ ");
               System.out.println("\t|          Enter your name:          | ");
               System.out.println("\t|____________________________________| ");
               System.out.println(" ");


               Scanner e=new Scanner (System.in);
               name=e.nextLine();
               System.out.println("\t ___________________________________________ ");
               System.out.println("\t|         Enter your Phone Number :        | ");
               System.out.println("\t|__________________________________________| ");
               System.out.println(" ");


               phonenumber=e.nextLine();
               System.out.println("\t__________________________________________ ");
               System.out.println("\t|         Enter your Address:            |");
               System.out.println("\t|________________________________________| ");
               System.out.println(" ");

               address=e.nextLine();
               System.out.println("\t--------------------------------------- ");
               System.out.println("\t|    Your response has been recorded. | ");
               System.out.println("\t--------------------------------------- ");
            }
                else if(p==2)
                {
                    int l;
                    System.out.println("\t***************************************** ");
                    System.out.println("\t|          Type of complains              |");
                    System.out.println("\t******************************************* ");
                    System.out.println("\t|         1. Murder case                  |");
                    System.out.println("\t|         2. Theif case                   |");
                    System.out.println("\t|         3. Lost  case                   |");
                    System.out.println("\t|         4. Child abuse case             |");
                    System.out.println("\t******************************************* ");
                    Scanner c=new Scanner(System.in);
                    l=c.nextInt();
                    if(l==1)
                    {   
                        
                        String victimname;
                        String complains;
                        System.out.println("\t________________________________________ ");
                        System.out.println("\t       Enter victim Name :               ");
                        System.out.println("\t________________________________________ ");
                        System.out.println(" ");
                        Scanner s=new Scanner(System.in);
                        victimname=s.nextLine();
                        System.out.println("\t_________________________________________ ");
                        System.out.println("\t        Enter your complains:              ");
                        System.out.println("\t _________________________________________");
                        System.out.println(" ");
                        complains=s.nextLine();
                        System.out.println("\t--------------------------------------------------------------------- ");
                        System.out.println("\t   Your response has been recorded. We are taking action immediately. ");
                        System.out.println("\t---------------------------------------------------------------------- ");
                    }
                         if(l==2)
                    {
                        try{
                          Formatter pcom=new Formatter("D:/Project/RegFile/police complain.txt");  
                        String complains;
                        System.out.println("\t_______________________________________ ");
                        System.out.println("\t           Enter your problem           ");
                        System.out.println("\t________________________________________ ");
                        System.out.println(" ");
                        Scanner r=new Scanner (System.in);
                        complains=r.nextLine();
                        pcom.format("%s \r\n",complains);
                        pcom.flush();
                        pcom.close();
                        System.out.println("\t--------------------------------------------------------------------- ");
                        System.out.println("\t Your response has been recorded. We are taking action immediately.");
                        System.out.println("\t----------------------------------------------------------------------- ");

                      }catch(Exception e)
                      {
                        System.out.println(e);
                      }

                    
                    }
                    if(l==3)
                    {
                        String lostitem;
                        String complains;
                        System.out.println("\t__________________________________________ ");
                        System.out.println("\t|           Which item you lost?          | ");
                        System.out.println("\t|_________________________________________| ");
                        System.out.println(" ");

                        Scanner m=new Scanner (System.in);
                        lostitem=m.nextLine();
                        System.out.println("\t___________________________________________ ");
                        System.out.println("\t|            Enter your problem  :          |");
                        System.out.println("\t|___________________________________________| ");
                        System.out.println("");
                        complains=m.nextLine();
                        System.out.println("\t---------------------------------------------------------------------------- ");
                        System.out.println("\tYour response has been recorded. We are taking action immediately.          ");                                                 
                        System.out.println("\t-------------------------------------------------------------------------   ");
                        System.out.println(" ");
                    }
                    if(l==4)
                    {
                        String complains;
                        System.out.println("\t______________________________________________");
                        System.out.println("\t|            Enter your problem  :            | ");
                        System.out.println("\t|_____________________________________________|");
                        System.out.println("");
                        Scanner n=new Scanner (System.in);
                        complains=n.nextLine();
                        System.out.println("\t-----------------------------------------------------------------");
                        System.out.println("\tYour response has been recorded. We are taking action immediately. ");
                        System.out.println("\t------------------------------------------------------------------");

                    }

                }
                else if(p==3)
                {
                        System.out.println("\t------------------------------------------------------------------------------------------------------------------");
                        System.out.println("\t|                         Dear Citizen,                                                                            |");
                        System.out.println("\t|This are some rules and regulation of this city . So if you break one or another rules ,police will take action.|");
                        System.out.println("\t------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        System.out.println("\t*******************************************************************************");
                        System.out.println("\t|1.Don't drive without driving licence.                                        |");
                        System.out.println("\t|------------------------------------------------------------------------------|");
                        System.out.println("\t|2.Don't break any traffic rules                                               |");
                        System.out.println("\t|------------------------------------------------------------------------------|");
                        System.out.println("\t|3.Don't take or carry any drugs or similar subtance                           | ");
                        System.out.println("\t|------------------------------------------------------------------------------|");
                        System.out.println("\t|4. Women abuse is prohibited                                                  |");
                        System.out.println("\t|------------------------------------------------------------------------------|");
                        System.out.println("\t|5.children abuse is banned                                                    | ");
                        System.out.println("\t*******************************************************************************");
                
                }
                
                else if(p==4)
                {
                disper();
                }
                else
                    {
                        System.out.println("\t Invalid Input");
                        disper();
                    }

        }
        if(stm==5)
        {
            System.out.println("\t_________________________________________________________");
            System.out.println("\t|                                                        |");
            System.out.println("\t|            Internet and Telephone Service              |");
            System.out.println("\t|________________________________________________________|");
            final int permonth=1000;
            int month;
            int bills;
            System.out.println("\t------------------------------------------------------");
            System.out.println("\t     How many month you want to payment?               ");
            System.out.println("\t-------------------------------------------------------");
            Scanner sc= new Scanner(System.in);
            month=sc.nextInt();
            bills=permonth*month;
            System.out.println("\t--------------------------------------------------------");
            System.out.println("\tYour internet and telephone bill:"+bills);
            System.out.println("\t---------------------------------------------------------");


        }
        if(stm==6)
        {
            int ar;

            Scanner di=new Scanner(System.in);
            System.out.println("\t**********************************");
            System.out.println("\t         Airlines Service             ");
            System.out.println("                                   ");
            System.out.println("\t- - - - - - - - - - - - - - - - - - -");
            System.out.println("\t1.International  |    2.Domestic");
            System.out.println("\t                 |                  ");
            System.out.println("\t**********************************");
            ar=di.nextInt();
            if(ar==1)
            {
            String a;
            String ticket;
            String visa;
            
            int per;
            int choose;
            System.out.println("\t**********************************");
            System.out.println("\t      International Deperture     ");
            System.out.println("\t**********************************");
            Scanner sd=new Scanner(System.in);
            System.out.println("\tEnter your name");
            a=sd.nextLine();
            System.out.println("\tNumber of person ");
            per=sd.nextInt();
            for(int i=1;i<=per;i++)
            {
                try{
                Formatter airint=new Formatter("D:/Project/RegFile/International Air.txt");
                String name;
                String pas;
                String vis;
                Scanner aa=new Scanner(System.in);
                System.out.println("Enter Name of person :");
                name=aa.nextLine();
                System.out.println("Enter passport number for person "+i+"=");
                pas=aa.nextLine();
                System.out.println("Enter visa Id for person "+i+"=");
                vis=aa.nextLine();
                System.out.println("");
                airint.format("%s %s %s\r\n",name,pas,vis);
                airint.flush();
                airint.close();
            }catch(Exception e)
            {
                System.out.println(e);
            }
            }
            

            System.out.println(" ");
            System.out.println("\t--Choose your destination--\t");
            System.out.println(" ");
            System.out.println("\t<><><><><><><><><><><><><><><><><><><><><><><><><>><><>");
            System.out.println("\t 1.--Dubai  (UAE)-- per person 2500 USD \t");
            System.out.println("__________________________________________________________ ");
            System.out.println("\t 2.--Mackha (KSA)-- per person 1400 USD \t");
            System.out.println("__________________________________________________________ ");
            System.out.println("\t 3.--Madina (KSA)--per person 1500 USD \t");
            System.out.println("__________________________________________________________ ");
            System.out.println("\t 4.--Paris (FRA)--per person 2000 USD \t");
            System.out.println("__________________________________________________________ ");
            System.out.println("\t 5.--Barcelona (ESP)--per person 1700 USD \t");
            System.out.println("__________________________________________________________ ");
            System.out.println("\t 6.--London (UK)--per person 1800 USD \t");
            System.out.println("__________________________________________________________ ");
            System.out.println("\t 7.--New York (USA)--per person 3000 USD \t");
            System.out.println("__________________________________________________________ ");
            System.out.println("\t 8.--Bali (INDO)--per person 1000 USD \t");
            System.out.println("__________________________________________________________ ");
            System.out.println("\t 9.--Kasmir (IND)--per person 700 USD \t");
            System.out.println("__________________________________________________________ ");
            System.out.println("\t 10.--Tokyo (JPN)--per person 1500 USD \t");
            System.out.println("\t<><><><><><><><><><><><><><><><><><><><><><><><><>><><>");
            
            choose=sd.nextInt();
            if(choose==1)
            {
            System.out.println("Your ticket price is ="+(per*2500)+" USD");
            System.out.println(" ");
            }
            if(choose==2)
            {
            System.out.println("Your ticket price is ="+(per*1400)+" USD");
            System.out.println(" ");
            }
            if(choose==3)
            {
            System.out.println("Your ticket price is ="+(per*15000)+" USD");
            System.out.println(" ");
            } 
            if(choose==4)
            {
            System.out.println("Your ticket price is ="+(per*2000)+" USD");
            System.out.println(" ");  
            }
            if(choose==5)
            {
            System.out.println("Your ticket price is ="+(per*1700)+" USD");
            System.out.println(" ");  
            }
            if(choose==6)
            {
            System.out.println("Your ticket price is ="+(per*1800)+" USD");
            System.out.println(" ");  
            }
            if(choose==7)
            {
            System.out.println("Your ticket price is ="+(per*3000)+" USD");
            System.out.println(" ");  
            }
            if(choose==8)
            {
            System.out.println("Your ticket price is ="+(per*1000)+" USD");
            System.out.println(" ");  
            }
            if(choose==9)
            {
            System.out.println("Your ticket price is ="+(per*700)+" USD");
            System.out.println(" ");  
            }
            if(choose==10)
            {
            System.out.println("Your ticket price is ="+(per*15000)+" USD");
            System.out.println(" ");  
            }
            
            
            int [] arr=new int[]{1,2,3,4,5};
            String[] str=new String[]{"AS25","WH12","ER25","WT88","DG25","ZA25","UY12","KN65","SD25","RF32"};
            
            System.out.println("Your terminal no ="+arr[new Random().nextInt(arr.length)]);
            
            System.out.println("Your ticket numbers are :");
            System.out.println(" ");
            for(int i=0;i<per;i++)
            {
                System.out.println(str[new Random().nextInt(str.length)]);
                System.out.println(" ");
            }

            
            }
            else if(ar==2)
            {
            String a;
            int per;
            int choose;
            Scanner ud=new Scanner(System.in);
            System.out.println(" "); 
            System.out.println("\t******************************\t");
            System.out.println("\t---Domestic Deperture----\t");
            System.out.println("\t******************************\t");
            System.out.println(" ");
            System.out.println("\t<><><><><><><><><><><><><><><><><><>\t");
            System.out.println("\t Enter your name :");
            a=ud.nextLine();
            System.out.println(" ");
            System.out.println("\t<><><><><><><><><><><><><><><><><><>\t");
            System.out.println("\t Number of person(Except you) :");
            per=ud.nextInt();
            System.out.println(" ");
            for(int i=1;i<per;i++)
            {
                try{
                Formatter airdom=new Formatter("D:/Project/RegFile/Domestic Air.txt");
                String name;
                Scanner aa=new Scanner(System.in);
                System.out.println("\t<><><><><><><><><><><><><><><><><><>\t");
                System.out.println("\t Enter person no "+i+" name :");
                name=aa.nextLine();
                System.out.println(" ");
                airdom.format("%s \r\n",name);
                airdom.flush();
                airdom.close();

            }catch(Exception e)
            {
                System.out.println(e);
            }
            }

            int [] arr=new int[]{1,2,3,4,5};
            System.out.println(" ");
            System.out.println("\t--Choose your destination--\t");
            System.out.println(" ");
            System.out.println("\t<><><><><><><><><><><><><><><><><><>\t");
            System.out.println("\t 1.--Jessor-- per person 2500 BDT \t");
            System.out.println("\t 2.--Chittagong-- per person 1400 BDT \t");
            System.out.println("\t 3.--Rajshahi--per person 1500 BDT \t");
            System.out.println("\t 4.--Sylhet--per person 2000 BDT \t");
            System.out.println("\t<><><><><><><><><><><><><><><><><><>\t");
            System.out.println(" ");
            choose=ud.nextInt();
            System.out.println(" ");
            if(choose==1)
            {
            System.out.println("Your ticket price is ="+(per*2500)+" BDT");
            System.out.println(" ");
            }
            if(choose==2)
            {
            System.out.println("Your ticket price is ="+(per*1400)+" BDT");
            System.out.println(" ");
            }
            if(choose==3)
            {
            System.out.println("Your ticket price is ="+(per*1500)+" BDT");
            System.out.println(" ");
            } 
            if(choose==4)
            {
            System.out.println("Your ticket price is ="+(per*2000)+" BDT"); 
            System.out.println(" "); 
            }

            System.out.println("_______________________________________________");
            System.out.println("Your terminal no ="+arr[new Random().nextInt(arr.length)]);
            System.out.println("_______________________________________________");
            System.out.println(" ");
            }
            else
            {
              System.out.println("Invalid Input");  
            }

        }
        if (stm==7)
        {
            System.out.println("\t-------Complains and Suggestions-----\t");
            
            System.out.println("\tEnter your Complain Suggestions under 20 words");
            try{
            Formatter com=new Formatter("D:/Project/RegFile/complain.txt");
            String a;
            Scanner ad=new Scanner(System.in);
            a=ad.nextLine();
            com.format("%s \r\n",a);
            com.flush();
            com.close();
            
            System.out.println("Thank you, your complain and Suggestions has taken, now its our responsibility to check it");
            System.out.println(" ");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }

       
    }
    }
}
   
    





