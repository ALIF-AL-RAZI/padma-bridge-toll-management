package padma_bridge_toll;

import java.util.ArrayList;
import java.util.Scanner;

public class Registered_User  extends User{

   int cash;
	private String Name;
	private String No_Plate;
	private String Date;
	private String Pay_Status;
	private String Vehicle;
	private String Phone;
	private int check = 0;
	
	public int getCheck() {
		return check;
	}

	public Registered_User(String name, String no_Plate, String date, String pay_Status, String vehicle, String phone) {
		super();
		Name = name;
		No_Plate = no_Plate;
		Date = date;
		Pay_Status = pay_Status;
		Vehicle = vehicle;
		Phone = phone;
	}
	
	//Creating a empty constructor to call constructor that doesn't require variables
	
	public Registered_User() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNo_Plate() {
		return No_Plate;
	}
	public void setNo_Plate(String no_Plate) {
		No_Plate = no_Plate;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getPay_Status() {
		return Pay_Status;
	}
	public void setPay_Status(String pay_Status) {
		Pay_Status = pay_Status;
	}
	public String getVehicle() {
		return Vehicle;
	}
	public void setVehicle(String vehicle) {
		Vehicle = vehicle;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	public String getString()
	{
		return "name = " + Name + " " + "number plate = " +No_Plate + " " + "registration date = " + Date + " " + "payment status = "+ Pay_Status + " vehicle type = " + Vehicle + " phone number = " + Phone ;
	}
	 
    
    //Method To check Whether the user is stored or not
	//In Registered User Method 
	@Override
	public void checkUser()
	{
		Registered_User r1 = new Registered_User("Aditya","0001","12/05/22","Paid","1","0151111");
		Registered_User r2 = new Registered_User("Ramesh","0002","11/05/22","Paid","3","0150030");
		Registered_User r3 = new Registered_User("John","0003","13/05/22","NonPaid","6","0181111");
		Registered_User r4 = new Registered_User("Khan","0004","14/05/22","Paid","8","01911424");
		Registered_User r5 = new Registered_User("Birla","0005","17/05/22","NonPaid","9","0141111");
		
		
		 ArrayList<Registered_User> names = new ArrayList<Registered_User>();
		 
	     // Adding objects to the ArrayList
	     names.add(r1);
	     names.add(r2);
	     names.add(r3);
	     names.add(r4);
	     names.add(r5);
	
	
	
		 Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
	     System.out.print("Enter user car number");  
	     String str= sc.nextLine(); 
	     String str1 = "";
	     
	    
	     for(int i=0 ;i<names.size();i++)
	        { 
	        	 str1 = names.get(i).getNo_Plate();
	        	 
	        	 
	        	//System.out.println(str1);
	            if(str.equals(str1)) 
	           {
	             
	        	 //Check Variable Is Used To Check Register User Exsits Or Not
	             // if Check is > 0 print User found orElse Print User NotFound
				 //System.out.println("Registerted User Found");
	        	  check+=1;

				  String st44 = names.get(i).getNo_Plate();

				  int vno =Integer.parseInt(st44);

				  System.out.println("\nName: " + names.get(i).getName());
				  System.out.println("Number plate: " + names.get(i).getNo_Plate());
				  System.out.println("Phone number: " + names.get(i).getPhone());
				  Vehicle_Class vclass = new Vehicle_Class();
                  vclass.vehicleClass(vno);
				  Vehicle_Class payment = new Vehicle_Class();
                  int pay = payment.payment(vno);
				  System.out.println("Payable amount: "+ pay);
				  System.out.println("Payment status: "+ names.get(i).Pay_Status);

				  

				  if (names.get(i).Pay_Status=="NonPaid"){
					System.out.println("Enter User amount:" );
				//Scanner amount = new Scanner(System.in);
					cash = sc.nextInt();
				  }
				  //
				  //
				  
				 
				  System.out.println("\n\nReceipt\n\n");


				  Toll_Plaza trxid = new Toll_Plaza();
                  int c = trxid.transectionID();
				  System.out.println("Transaction Id: "+c);
	        	  
	        	  Toll_Plaza date_time = new Toll_Plaza();
				  System.out.print("Date: ");
                  date_time.Date();
				  System.out.print("Time: ");
                  date_time.Time();
				  vclass.vehicleClass(vno);

				  if (names.get(i).Pay_Status=="NonPaid"){

					
					
					System.out.println("Payment method: Cash");

				  Payment trxDetails = new Payment();

				  trxDetails.transectionDetails(cash, vno);
				  }
				  else
				  System.out.println("Payment method: Online");

				  
                  

				  System.out.println("Payment status: Paid");
	        	  
	           }

			   

			   
	            
	        
//	            if(check > 0)
//		        {
//		        	System.out.println("name = " + names.get(i).getName() + "number plate = " +No_Plate + " " + "registration date = " + Date + " " + "payment status = "+ Pay_Status + " vehicle type = " + Vehicle + " phone number = " + Phone);
//		        }
//		        
//		        else
//		        {
//		        	System.out.println("No Registerted User Found");
//		        }
	            
	            
	       } 
           
		   

		   if(check > 0)
		   {
			System.out.println("\nRegisterted User Found");
		}
		
		else
		{
			System.out.println("\nNo Registerted User Found");
		}
	     
	    /* 
	     for(int i=0 ;i<names.size();i++)
	     {
	    	 
	     if(check > 0)
	        {
	        	System.out.println("name = " + names.get(i).getName() + "number plate = " +No_Plate + " " + "registration date = " + Date + " " + "payment status = "+ Pay_Status + " vehicle type = " + Vehicle + " phone number = " + Phone);
	        }
	        
	        else
	        {
	        	System.out.println("No Registerted User Found");
	        }
	     }
	     */
	     
	     
	     // if Check is > 0 print User found orElse Print User NotFound   
	      
	        
	        
	        	
	        
	        
	      
		
	}

	
	
	
	
	
}