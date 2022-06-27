import java.util.Scanner;
class Tourist
{
    void distor()
    {
        int k=1;
        while(k>0)
        {
            int stm;
            Scanner std=new Scanner(System.in);
           
            System.out.println("\t Welcome to the city . I , the City Mayor, greatly welomes you to our city .Please enjoy visiting the city.If you face any problem please be sure to inform us .");
            System.out.println("\t To give any complains about any facilities please call at this number - 1620 . We will help you as soon as possible. ");
            System.out.println("    ");
            System.out.println("\t************************************************");
            System.out.println("\t---- Tourist Informations and Facilities ----");
            System.out.println("\t************************************************");
            System.out.println("    ");
            System.out.println("\t`````````````````````````");
            System.out.println("\t| 1.Transport facilities |");
            System.out.println("\t``````````````````````````");
            System.out.println("    ");
            System.out.println("\t``````````````````````");
            System.out.println("\t| 2.Hotel facilities |");
            System.out.println("\t``````````````````````");
            System.out.println("    ");
            System.out.println("\t````````````````````````");
            System.out.println("\t| 3.Historical Places |");
            System.out.println("\t````````````````````````");
            System.out.println("    ");
            System.out.println("\t```````````````````    ");
            System.out.println("\t| Press 0 to Exit | ");
            System.out.println("\t```````````````````    ");
            System.out.println("    ");
            stm=std.nextInt();
            k=stm;
            
            if(stm==1)
            {   System.out.println("\t****************************** ");
                System.out.println("\t-----Transport Facility------");
                System.out.println("\t******************************");
                System.out.println("    ");
                String name;

                Scanner st=new Scanner(System.in);
                System.out.println("\t`````````````````````````````````    ");
                System.out.println("\t Transport Account Holder Name = ");
                System.out.println("\t`````````````````````````````````    ");
                name=st.nextLine();

                System.out.println("    ");


                int h=1;
                while(h>0)
                {
                    int htm;
                    Scanner htd=new Scanner(System.in);
                    System.out.println("    ");
                    System.out.println("\t```````````````````````````````    ");
                    System.out.println("\t---- Transport facilities ----");
                    System.out.println("\t```````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("\t*********************************************************************************************    ");
                    System.out.println("\t To ensure your entetainment and curisity , we recommend you to choose Cab facility. ");
                    System.out.println("\t But if you are less than 6 people you can enjoy airline facility for long distence journey.");
                    System.out.println("\t*********************************************************************************************    ");
                    System.out.println("    ");
                    System.out.println("\t````````````````````````````````````````````    ");
                    System.out.println("\t 1.Bus Facility (Persons Quantity :30(Max) ) ");
                    System.out.println("\t````````````````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("\t`````````````````````````````````````````````````    ");
                    System.out.println("\t 2.Motorcycle Facility (Persons Quantity :2(Max) ) ");
                    System.out.println("\t`````````````````````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("\t``````````````````````````````````````````````    ");
                    System.out.println("\t 3.Train Facility (Persons Quantity :200(Max) ) ");
                    System.out.println("\t``````````````````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("\t``````````````````````````````````````````    ");
                    System.out.println("\t 4.Cab Facility (Persons Quantity :5(Max) ) ");
                    System.out.println("\t``````````````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("\t```````````````````````````````````````````````    ");
                    System.out.println("\t 5.Airlines Facility (Persons Quantity :6(Max) ) ");
                    System.out.println("\t```````````````````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("\t*********************    ");
                    System.out.println("\t | Press 0 to Exit | ");
                    System.out.println("\t*********************    ");
                    System.out.println("    ");
                    htm=htd.nextInt();
                    h=htm;
                    
                    if(htm==1)
                    {   System.out.println("\t``````````````````````````    ");
                        System.out.println("\t----- Bus Facility ------");
                        System.out.println("\t``````````````````````````    ");
                        System.out.println("    ");

                        int perhead=200;
                        int persons;
                        int bills;
                        System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    ");
                        System.out.println("\t How many people are you ? ");
                        System.out.println("\t Please input the count of people : ");
                        System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    ");
                        System.out.println("    ");
                        Scanner sc= new Scanner(System.in);
                        persons=sc.nextInt();

                        if(persons>=1 && persons<=30)
                        {
                        bills=perhead*persons;
                        System.out.println("\t``````````````````````````````````    ");
                        System.out.println("\t Your Bus Transport Bill :"+bills);
                        System.out.println("\t``````````````````````````````````    ");
                        System.out.println("    ");
                        }
                        else
                        {
                        System.out.println("\t```````````````````````````````````````````````````````````````````    ");
                        System.out.println("\t Max person Limit is 30 .Please consider other transport facilities.");
                        System.out.println("\t```````````````````````````````````````````````````````````````````    ");
                        System.out.println("    ");
                        }


                    }
                    if(htm==2)
                    {

                        System.out.println("\t`````````````````````````````````    ");
                        System.out.println("\t----- Motorcycle Facility ------");
                        System.out.println("\t`````````````````````````````````    ");
                        System.out.println("    ");

                        int perhead=100;
                        int persons;
                        int bills;
                        System.out.println("\t````````````````````````````````````    ");
                        System.out.println("\t How many people are you ? ");
                        System.out.println("\t Please input the count of people : ");
                        System.out.println("\t````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner sc= new Scanner(System.in);
                        persons=sc.nextInt();

                        if(persons>=1 && persons<=2)
                        {
                        bills=perhead*persons;
                        System.out.println("\t........................................    ");
                        System.out.println("\t Your Motorcycle Transport Bill :"+bills);
                        System.out.println("\t........................................    ");
                        System.out.println("    ");
                        }
                        else
                        {
                        System.out.println("\t```````````````````````````````````````````````````````````````````    ");
                        System.out.println("\t Max person Limit is 2 .Please consider other transport facilities.");
                        System.out.println("\t```````````````````````````````````````````````````````````````````    ");
                        System.out.println("    ");

                         }

                    }

                    if(htm==3)
                    {

                        System.out.println("\t*****************************    ");
                        System.out.println("\t------ Train Facility ------");
                        System.out.println("\t*****************************    ");
                        System.out.println("    ");

                        int perhead=100;
                        int persons;
                        int bills;
                        System.out.println("\t`````````````````````````````````````    ");
                        System.out.println("\t How many people are you ? ");
                        System.out.println("\t Please input the count of people : ");
                        System.out.println("\t`````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner sc= new Scanner(System.in);
                        persons=sc.nextInt();

                        if(persons>=1 && persons<=200)  
                        {
                        bills=perhead*persons;
                        System.out.println("\t```````````````````````````````    ");
                        System.out.println("\t Your Train Transport Bill :"+bills);
                        System.out.println("\t```````````````````````````````    ");
                        System.out.println("    ");
                        }
                        else
                        {
                        System.out.println("\t`````````````````````````````````````````````````````````````````````    ");
                        System.out.println("\t Max person Limit is 200 .Please consider other transport facilities.");
                        System.out.println("\t`````````````````````````````````````````````````````````````````````    ");
                        System.out.println("    ");

                         }

                    }

                    if(htm==4)
                    {

                        System.out.println("\t`````````````````````````````    ");
                        System.out.println("\t------ Cab Facility ------");
                        System.out.println("\t8`````````````````````````````    ");
                        System.out.println("    ");

                        int perhead=150;
                        int persons;
                        int bills;
                        System.out.println("\t```````````````````````````````````````    ");
                        System.out.println("\t How many people are you ? ");
                        System.out.println("\t Please input the count of people : ");
                        System.out.println("\t```````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner sc= new Scanner(System.in);
                        persons=sc.nextInt();
                        
                        if(persons>=1 && persons<=5)
                        {
                        bills=perhead*persons;
                        System.out.println("\t```````````````````````````````````    ");
                        System.out.println("\t Your Cab Transport Bill :"+bills);
                        System.out.println("\t```````````````````````````````````    ");
                        System.out.println("    ");
                        }
                        else
                        {
                        System.out.println("\t```````````````````````````````````````````````````````````````````    ");
                        System.out.println("\t Max person Limit is 5 .Please consider other transport facilities.");
                        System.out.println("\t```````````````````````````````````````````````````````````````````    ");
                        System.out.println("    ");

                         }

                    }

                    if(htm==5)
                    {
                        System.out.println("\t*********************************    ");
                        System.out.println("\t------  Airlines Facility ------");
                        System.out.println("\t*********************************    ");
                        System.out.println("    ");

                        int perhead=2500;
                        int persons;
                        int bills;
                        System.out.println("\t```````````````````````````````````````    ");
                        System.out.println("\t How many people are you ? ");
                        System.out.println("\t Please input the count of people : ");
                        System.out.println("\t```````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner sc= new Scanner(System.in);
                        persons=sc.nextInt();
                        
                        if(persons>=1 && persons<=6)
                        {
                        bills=perhead*persons;
                        System.out.println("\t````````````````````````````````````````    ");
                        System.out.println("\t Your Airlines Transport Bill :"+bills);
                        System.out.println("\t````````````````````````````````````````    ");
                        }
                        else
                        {
                        System.out.println("\t````````````````````````````````````````````````````````````````````    ");
                        System.out.println("\t Max person Limit is 6 .Please consider other transport facilities.");
                        System.out.println("\t````````````````````````````````````````````````````````````````````    ");
                        System.out.println("    ");

                         }

                    }

                }
            }




            if(stm==2)
            {
                System.out.println("\t******************************    ");
                System.out.println("\t------ Hotel Facility ------");
                System.out.println("\t******************************    ");
                System.out.println("    ");
                String name;
                Scanner st=new Scanner(System.in);
                System.out.println("    ");
                System.out.println("\t```````````````````````````````    ");
                System.out.println("\t Hotel Account Holder Name = ");
                System.out.println("\t```````````````````````````````    ");
                name=st.nextLine();

                System.out.println("    ");

                int p=1;
                while(p>0)
                {
                    int ptm;
                    Scanner ptd=new Scanner(System.in);
                    System.out.println("\t```````````````````````````````    ");
                    System.out.println("\t---- Hotel Information ----");
                    System.out.println("\t```````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("\t````````````````````````````````    ");
                    System.out.println("\t 1.Hotel Pan Pacific Sonargaown.");
                    System.out.println("\t````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("\t````````````````````````````````    ");
                    System.out.println("\t 2.Hotel Radison Blu.");
                    System.out.println("\t````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("\t````````````````````````````````    ");
                    System.out.println("\t 3.Hotel Sheraton.");
                    System.out.println("\t````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("\t````````````````````````````````    ");
                    System.out.println("\t 4.Hotel Amari Dhaka.");
                    System.out.println("\t````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("\t````````````````````````````````    ");
                    System.out.println("\t 5.Hotel Le Meridien.");
                    System.out.println("\t````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("\t````````````````````````````````    ");
                    System.out.println("\t 6.Hotel Royal Paradise.");
                    System.out.println("\t```````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("\t```````````````````````````````    ");
                    System.out.println("\t 7.Hotel Rain Tree.");
                    System.out.println("\t```````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("\t*********************    ");
                    System.out.println("\t | Press 0 to Exit | ");
                    System.out.println("\t*********************    ");
                    System.out.println("    ");
                    ptm=ptd.nextInt();
                    p=ptm;
                    
                    if(ptm==1)
                    {
                        System.out.println("\t```````````````````````````````````````````    ");
                        System.out.println("\t----- Hotel Pan Pacific Sonargaown ------");
                        System.out.println("\t```````````````````````````````````````````    ");

                        int perhead=12500;
                        int persons;
                        int days;
                        int bills;
                        System.out.println("\t`````````````````````````````````````````    ");
                        System.out.println("\t How many people are you ? ");
                        System.out.println("\t Please input the count of people : ");
                        System.out.println("\t`````````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner sc= new Scanner(System.in);
                        persons=sc.nextInt();

                        System.out.println("\t````````````````````````````````````````````    ");
                        System.out.println("\t Please input the days you want to stay : ");
                        System.out.println("\t````````````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner nc= new Scanner(System.in);
                        days=nc.nextInt();

                        bills=perhead*persons*days;
                        System.out.println("\t````````````````````````````````````    ");
                        System.out.println("\t Your Total Hotel Bill is :"+bills);
                        System.out.println("\t````````````````````````````````````    ");
                        System.out.println("    ");
                        System.out.println("\t~~~~~~----------------------------------------------    ");
                        System.out.println("\t Thank you for choosing this hotel.We welcome you. ");
                        System.out.println("\t~~~~~~----------------------------------------------    ");

                    }
                    if(ptm==2)
                    {

                        System.out.println("\t```````````````````````````````    ");
                        System.out.println("\t-----Hotel Radison Blu------");
                        System.out.println("\t```````````````````````````````    ");
                        System.out.println("    ");

                        int perhead=14400;
                        int persons;
                        int days;
                        int bills;
                        System.out.println("\t`````````````````````````````````````    ");
                        System.out.println("\t How many people are you ? ");
                        System.out.println("\t Please input the count of people : ");
                        System.out.println("\t`````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner sc= new Scanner(System.in);
                        persons=sc.nextInt();

                        System.out.println("\t````````````````````````````````````````````````````````    ");
                        System.out.println("\t Please input the days you want to reserve the room : ");
                        System.out.println("\t````````````````````````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner nc= new Scanner(System.in);
                        days=nc.nextInt();

                        bills=perhead*persons*days;
                        System.out.println("\t```````````````````````````````````    ");
                        System.out.println("\t Your Total Hotel Bill is :"+bills);
                        System.out.println("\t```````````````````````````````````    ");
                        System.out.println("    ");
                        System.out.println("\t~~~~~~~-------------------------------------------------------------------------------    ");
                        System.out.println("\t Thank you for choosing this hotel.We welcome you to our hotel.Please enjoy your stay. ");
                        System.out.println("\t~~~~~~~-------------------------------------------------------------------------------    ");
                    }

                    if(ptm==3)
                    {
                        System.out.println("\t```````````````````````````````    ");
                        System.out.println("\t------ Hotel Sheraton ------");
                        System.out.println("\t```````````````````````````````    ");
                        System.out.println("    ");
                        int perhead=12000;
                        int persons;
                        int days;
                        int bills;
                        System.out.println("\t```````````````````````````````````````   ");
                        System.out.println("\t How many people are you ? ");
                        System.out.println("\t Please input the count of people : ");
                        System.out.println("\t```````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner sc= new Scanner(System.in);
                        persons=sc.nextInt();

                        System.out.println("\t`````````````````````````````````````````````    ");
                        System.out.println("\t Please input the days you want to stay : ");
                        System.out.println("\t`````````````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner nc= new Scanner(System.in);
                        days=nc.nextInt();

                        bills=perhead*persons*days;
                        System.out.println("\t```````````````````````````````````    ");
                        System.out.println("\t Your Total Hotel Bill is :"+bills);
                        System.out.println("\t````````````````````````````````````    ");
                        System.out.println("    ");
                        System.out.println("\t~~~~~~~`````````````````````````````````````````````````````````````````````````````````    ");
                        System.out.println("\t Thank you for choosing this hotel.We welcome you to our hotel.Please enjoy your stay. ");
                        System.out.println("\t~~~~~~~`````````````````````````````````````````````````````````````````````````````````````    ");

                        System.out.println("    ");
                    }

                    if(ptm==4)
                    {
                        System.out.println("\t``````````````````````````````````    ");
                        System.out.println("\t----- Hotel Amari Dhaka ------");
                        System.out.println("\t``````````````````````````````````    ");
                        System.out.println("    ");
                        int perhead=10400;
                        int persons;
                        int days;
                        int bills;
                        System.out.println("\t`````````````````````````````````````    ");
                        System.out.println("\t How many people are you ? ");
                        System.out.println("\t Please input the count of people : ");
                        System.out.println("\t````````````````````````````````````    ");
                        System.out.println("    ");
                        
                        Scanner sc= new Scanner(System.in);
                        persons=sc.nextInt();

                        System.out.println("\t`````````````````````````````````````````````    ");
                        System.out.println("\t Please input the days you want to stay : ");
                        System.out.println("\t`````````````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner nc= new Scanner(System.in);
                        days=nc.nextInt();

                        bills=perhead*persons*days;
                        System.out.println("\t````````````````````````````   ");
                        System.out.println("\t Your Total Hotel Bill is :"+bills);
                        System.out.println("\t````````````````````````````    ");
                        System.out.println("    ");
                        System.out.println("\t~~~~~~~~-------------------------------------------------------------------------------    ");
                        System.out.println("\t Thank you for choosing this hotel.We welcome you to our hotel.Please enjoy your stay. ");
                        System.out.println("\t~~~~~~~~--------------------------------------------------------------------------------    ");
                        System.out.println("    ");
                    }


                    if(ptm==5)
                    {
                        System.out.println("\t````````````````````````````````    ");
                        System.out.println("\t----- Hotel Le Meridien ------");
                        System.out.println("\t````````````````````````````````    ");
                        System.out.println("    ");

                        int perhead=17280;
                        int persons;
                        int days;
                        int bills;
                        System.out.println("\t`````````````````````````````````````    ");
                        System.out.println("\t How many people are you ? ");
                        System.out.println("\t Please input the count of people : ");
                        System.out.println("\t`````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner sc= new Scanner(System.in);
                        persons=sc.nextInt();

                        System.out.println("\t```````````````````````````````````````````    ");
                        System.out.println("\t Please input the days you want to stay : ");
                        System.out.println("\t```````````````````````````````````````````    ");
                        Scanner nc= new Scanner(System.in);
                        days=nc.nextInt();

                        bills=perhead*persons*days;
                        System.out.println("    ");
                        System.out.println("\t```````````````````````````    ");
                        System.out.println("\t Your Total Hotel Bill is :"+bills);
                        System.out.println("\t````````````````````````````    ");
                        System.out.println("    ");
                        System.out.println("\t~~~~~~~----------------------------------------------------------------------------------    ");
                        System.out.println("\t Thank you for choosing this hotel.We welcome you to our hotel.Please enjoy your stay. ");
                        System.out.println("\t~~~~~~~----------------------------------------------------------------------------------    ");
                        System.out.println("    ");


                    }

                    if(ptm==6)
                    {
                        System.out.println("\t```````````````````````````````````    ");
                        System.out.println("\t----- Hotel Royal Paradise ------");
                        System.out.println("\t```````````````````````````````````    ");
                        System.out.println("    ");

                        int perhead=6500;
                        int persons;
                        int days;
                        int bills;
                        System.out.println("\t`````````````````````````````````````    ");
                        System.out.println("\t How many people are you ? ");
                        System.out.println("\t Please input the count of people : ");
                        System.out.println("\t`````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner sc= new Scanner(System.in);
                        persons=sc.nextInt();

                        System.out.println("\t````````````````````````````````````````````    ");
                        System.out.println("\t Please input the days you want to stay : ");
                        System.out.println("\t````````````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner nc= new Scanner(System.in);
                        days=nc.nextInt();

                        bills=perhead*persons*days;
                        System.out.println("\t```````````````````````````    ");
                        System.out.println("\t Your Total Hotel Bill is :"+bills);
                        System.out.println("\t```````````````````````````    ");
                        System.out.println("    ");
                        System.out.println("\t~~~~~~~--------------------------------------------------------------------------------    ");
                        System.out.println("\t Thank you for choosing this hotel.We welcome you to our hotel.Please enjoy your stay. ");
                        System.out.println("\t~~~~~~~--------------------------------------------------------------------------------    ");
                        System.out.println("    ");
                    }

                    if(ptm==7)
                    {
                        System.out.println("\t*****************************    ");
                        System.out.println("\t----- Hotel Rain Tree ------");
                        System.out.println("\t*****************************    ");
                        System.out.println("    ");
                        int perhead=7000;
                        int persons;
                        int days;
                        int bills;
                        System.out.println("\t`````````````````````````````````````    ");
                        System.out.println("\t How many people are you ? ");
                        System.out.println("\t Please input the count of people : ");
                        System.out.println("\t`````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner sc= new Scanner(System.in);
                        persons=sc.nextInt();

                        System.out.println("\t``````````````````````````````````````````   ");
                        System.out.println("\t Please input the days you want to stay : ");
                        System.out.println("\t``````````````````````````````````````````    ");
                        System.out.println("    ");
                        Scanner nc= new Scanner(System.in);
                        days=nc.nextInt();

                        bills=perhead*persons*days;
                        System.out.println("\t```````````````````````````````````    ");
                        System.out.println("\t Your Total Hotel Bill is :"+bills);
                        System.out.println("\t```````````````````````````````````    ");
                        System.out.println("    ");
                        System.out.println("\t~~~~~~--------------------------------------------------------------------------------    ");
                        System.out.println("\t Thank you for choosing this hotel.We welcome you to our hotel.Please enjoy your stay. ");
                        System.out.println("\t~~~~~~---------------------------------------------------------------------------------    ");

                        System.out.println("    ");
                    }


                }
            }




            if(stm==3)
            {
                System.out.println("*****************************************************************************************************    ");
                System.out.println("                                ------ Historical Places  ------                                             ");
                System.out.println("                                                                                                         ");
                System.out.println("            In this facility you will get information on the historical places .     ");
                System.out.println("******************************************************************************************************   ");
                System.out.println("    ");

                /*String name;
                Scanner st=new Scanner(System.in);
                System.out.println("`````````````````    ");
                System.out.println("Persons Name = ");
                System.out.println("`````````````````    ");
                name=st.nextLine();*/

                System.out.println("    ");

                int g=1;
                while(g>0)
                {

                    int gtm;
                    Scanner gtd=new Scanner(System.in);
                    System.out.println("`````````````````````````````````` ```  ");
                    System.out.println("  Choose Your Preferred Historical Place :");
                    System.out.println("``````````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("`````````````````````````````````````````    ");
                    System.out.println("  1.Lal Bager Kella . ");
                    System.out.println("``````````````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("`````````````````````````````````````````    ");
                    System.out.println("  2.Bongo vhobon .");
                    System.out.println("``````````````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("`````````````````````````````````````````    ");
                    System.out.println("  3.Ahsan Monjhil .");
                    System.out.println("````````````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("`````````````````````````````````````````    ");
                    System.out.println("  4.Hathir Jhil . ");
                    System.out.println("`````````````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("``````````````````````````````````````````    ");
                    System.out.println("  5.National Museum .");
                    System.out.println("``````````````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("```````````````````````````````````````````    ");
                    System.out.println("  6.National Money Museum .");
                    System.out.println("```````````````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("``````````````````````````````````````````   ");
                    System.out.println("  7.Panam City .");
                    System.out.println("``````````````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("```````````````````````````````````````````    ");
                    System.out.println("  8.Mainamati . ");
                    System.out.println("```````````````````````````````````````````    ");
                    System.out.println("    ");
                    System.out.println("**************************    ");
                    System.out.println(" |  Press '0' to Exit. |  ");
                    System.out.println("**************************    ");
                    System.out.println("    ");
                    gtm=gtd.nextInt();
                    g=gtm;
                    if(gtm==1)
                    {
                        System.out.println("                 1.Lal Bager Kella . ");
                        System.out.println("    ");
                        System.out.println("Information : Lalbagh Fort (Fort Aurangabad) is an incomplete Mughal Palace fortress at Dhaka on the Buriganga River in the southwestern part of the old city of Dhaka. Prince Muhammad Azam, son of Emperor Aurangzeb, began the construction while he was serving as the Viceroy of Bengal. Built in 17th Century dated 1678. Main attractions are - Tomb of Pari Bibi, Lalbagh mosque, Audience hall and Hammam Khana (bathing place) of Nawab Shaista Khan. ");
                        System.out.println("    ");
                        

                    }
                    if(gtm==2)
                    {
                        System.out.println("                2.Bongo vhobon . ");
                        System.out.println("    ");
                        System.out.println("Information : The Bangabhaban (lit. House of Bengal) is the official residence and principal workplace of the President of Bangladesh, located on Bangabhaban Road, and short road connecting Dilkusha Avenue, Dhaka. It is surrounded by the Bangabhaban Gardens (formerly Nawab's Dilkusha Gardens).The site hosted the Dilkusha Government House during British rule which was used by the Viceroy of India and the Governor of Bengal. The house was the official Governor's Residence of East Pakistan after the creation of Pakistan. President Abu Sayeed Chowdhury became the first Bangladeshi president to reside there after taking oath on 12 January 1971. The President Guard Regiment unit is responsible for the palace's security. ");
                        System.out.println("    ");
                        System.out.println("    ");

                    }
                    if(gtm==3)
                    {
                         System.out.println("               3.Ahsan Monjhil .");
                        System.out.println("    ");
                        System.out.println(" Information : Ahsan Manzil was the official residential palace and seat of the Nawab of Dhaka. The building is situated at Kumartoli along the banks of the Buriganga River in Dhaka, Bangladesh. Construction was started in 1859 and was completed in 1872. It was constructed in the Indo-Saracenic Revival architecture. ");
                        System.out.println("    ");
                        
                        System.out.println("    ");

                    }

                    if(gtm==4)
                    {
                        System.out.println("                4.Hathir Jhil .");
                        System.out.println("    ");
                        System.out.println(" Information : Legend has it that the elephants of Dhaka's Pilkhana used to take baths in these wetlands  hence the name Hatirjheel. Architect Iqbal Habib, who heads the consultant firm of the Hatirjheel-Begunbari development project, said that the Bhawal Raja used to keep his tamed elephants at Pilkhana. ");
                        System.out.println("    ");

                        
                        System.out.println("    ");

                    }

                    if(gtm==5)
                    {
                        System.out.println("                5.National Museum . ");
                        System.out.println("    ");
                        System.out.println(" Information : The Bangladesh National Museum is the national museum of Bangladesh.The museum is well organized and displays have been housed chronologically in several departments like department of ethnography and decorative art, department of history and classical art, department of natural history, and department of contemporary and world civilization. The museum also has a rich conservation laboratory. Nalini Kanta Bhattasali served as the first curator of the museum during 1914–1947. ");
                        System.out.println("    ");
                        
                        System.out.println("    ");

                    }

                    if(gtm==6)
                    {
                        System.out.println("                6.National Money Museum . ");
                        System.out.println("    ");
                        System.out.println(" Information : The Currency Museum is the first of its kind in Bangladesh to highlight the history of taka and its development. Speaker Shirin Sharmin Chaudhury installed the Taka Jadughar in Mirpur at training academy of Bangladesh Bank. This Currency Museum was built in the Bangladesh Bank in 2009. ");
                        System.out.println("    ");
                        System.out.println(" This museum is located at Mirpur-2 in Dhaka city of Bangladesh. There are so many buses stirring towards Mirpur-2. It is few kilometer south-west from Sher-e-Bangla National Stadium. It is the best place for numismatist to manner research activities. There are many international quality hotels are in Dhaka City. This will be the place like paradise the person who loves to collect coins. ");
                       
                        System.out.println("    ");

                    }


                    if(gtm==7)
                    {
                        System.out.println("                7.Panam City . ");
                        System.out.println("    ");
                        System.out.println(" Information :The city is located in Sonargaon of Narayanganj, just beside the capital, Dhaka. The ancient architecture of Mughal period is found here. Baro-Bhuiyans used to rule here. It was within the capital in that time. As a capital, Sonargaon was enriched with architectural beauties. Numerous British Colonial monuments and forts are seen across this 20km area. ");
                        System.out.println("    ");

                        

                    }

                    if(gtm==8)
                    {
                        System.out.println("                8.Mainamati . ");
                        System.out.println("    ");
                        System.out.println(" Information : It is the extinct Buddhist religious site in the district of Comilla. It serves a beautiful colonial cemetery as Comilla Cantonment is nearby. The Mainamati Cemetery is a historical memorial with about thousands of graves from Second World War. ");
                       System.out.println("    ");
                        System.out.println(" More Information : Mainamati was the name of a Chandra Queen, mother of Govindachandra who was a ruler of Chandra dynasty. Between the 10th and 11th century, they ruled the Samatata division of Bengal. Currently, this is the part of Comilla, 114 km away from the capital, Dhaka. They used this place to perform their religious activities.   ");
                        

                    }

                }
            }

        }
    }

}