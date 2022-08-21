
package padma_bridge_toll;


public class Vehicle_Class {
    
    
    public int payment(int v){
        int pay;
        
        switch (v) {
            case 1:
                pay =100;
                
                break;
            case 2:
                pay =750;
                
                break;
            case 3:
                pay =1200;
                
                break;
            case 4:
                pay =1300;
                
                break;
            case 5:
                pay =1400;
               
                break;
            case 6:
                pay =2000;
                
                break;
            case 7:
                pay =2400;
                
                break;
            case 8:
                pay =1800;
                
                break;
            case 9:
                pay =2100;
                
                break;
            case 10:
                pay =2800;
                
                break;
            case 11:
                pay =5500;
                
                break;
            case 12:
                pay =6000;
                
                break;
            /*case 13:
                pay =6000;
                break;*/
                
            default:
                pay=6000;
                
                break;
        }

        return pay;
        
         
            
        
    }

    public void vehicleClass(int v){
        
        String vehicle;
        switch (v) {
            case 1:
                
                vehicle= "Motorcycle";
                break;
            case 2:
                
                vehicle= "Car/Jeep";
                break;
            case 3:
                
                vehicle= "Pickup";
                break;
            case 4:
                
                vehicle= "Microbus";
                break;
            case 5:
                
                vehicle= "Minibus";
                break;
            case 6:
                
                vehicle= "Medium Bus";
                break;
            case 7:
                
                vehicle= "Big Bus";
                break;
            case 8:
                
                vehicle= "Truck (up to 5 tonnes)";
                break;
            case 9:
                
                vehicle= "Truck (5 to 8 tonnes)";
                break;
            case 10:
                
                vehicle= "Truck (8 to 11 tonnes)";
                break;
            case 11:
                
                vehicle= "Truck (3 axle)";
                break;
            case 12:
               
                vehicle= "Trailer (4 axle)";
                break;
            /*case 13:
                pay =6000;
                break;*/
                
            default:
                
                vehicle= "Trailer (4 axle above)";
                break;
        }

        System.out.println("Vehicle Class: "+ vehicle);
          
            
        
    }

    
}
