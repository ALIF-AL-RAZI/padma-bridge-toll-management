package padma_bridge_toll;
/*import java.util.ArrayList;
import java.util.Scanner;
 
public class main {

	public static void main(String[] args) {
            
            Toll_Plaza date_time = new Toll_Plaza();
            date_time.Date_Time();
            
            
		// TODO Auto-generated method stub
		Registered_User r1 = new Registered_User("Aditya","1234","12/05/22","Paid","Car","0151111");
       
 
        // Create an ArrayList object
        //(Declaring List of Person type)
        ArrayList<Registered_User> names = new ArrayList<>();
 
        // Adding objects to the ArrayList
        names.add(r1);
        //System.out.println(names.get(0).getNo_Plate());  
        
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter user car number");  
        
        String str= sc.nextLine(); 
        
        String str1 = names.get(0).getNo_Plate();
        
        
        if(str.equals(str1)) 
        {
        	System.out.println("Registerted user found");
        }
        else
        {
        	System.out.println(" NO Registerted user");
                
            
                
                Scanner Non_Reg_Info = new Scanner(System.in);
                
                System.out.println("Enter Name:");
                String Name = Non_Reg_Info.nextLine();
                
                
                
                
                System.out.println("Enter Vehicle Class:");
                
                int v_class = Non_Reg_Info.nextInt();
                
                Vehicle_Class payment = new Vehicle_Class();
                int pay = payment.payment(v_class);
                
                
                /*System.out.println("Enter Payment");
                String payment = Non_Reg_Info.nextLine();*/
                
               /* System.out.println("Name: " + Name);
                System.out.println("No Plate: " + str);
                System.out.println("Payment: " + pay);
        }
        
        
        
      
       

	}
    

}*/


import java.util.ArrayList;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                
                
		
               Toll_Plaza date_time = new Toll_Plaza();
                date_time.Date_Time();
		/*int count=1;*/
		while (true) {
                        User r1 = new User();
		        r1.checkUser();
                        int v=1;
                        /*int total_vehicle=count++;
                        System.out.println(total_vehicle);*/

                        Toll_Plaza count = new Toll_Plaza();
                        int pay = count.vehicle_count(v);
                        System.out.println("Today Vehicle count: " + pay);
                    }

                    /*System.out.println("Enter Vehicle Class:");
                
                int v_class = Non_Reg_Info.nextInt();
                
                Vehicle_Class payment = new Vehicle_Class();
                int pay = payment.payment(v_class);*/
		
      
       

	}

}