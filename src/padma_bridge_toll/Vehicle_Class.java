
package padma_bridge_toll;


public class Vehicle_Class {
    
    
    public  void payment(int v){
        int pay;
        String vehicle;
        switch (v) {
            case 1:
                pay =100;
                vehicle= "Motorcycle";
                break;
            case 2:
                pay =750;
                vehicle= "Car/Jeep";
                break;
            case 3:
                pay =1200;
                vehicle= "Pickup";
                break;
            case 4:
                pay =1300;
                vehicle= "Microbus";
                break;
            case 5:
                pay =1400;
                vehicle= "Minibus";
                break;
            case 6:
                pay =2000;
                vehicle= "Medium Bus";
                break;
            case 7:
                pay =2400;
                vehicle= "Big Bus";
                break;
            case 8:
                pay =1800;
                vehicle= "Truck (up to 5 tonnes)";
                break;
            case 9:
                pay =2100;
                vehicle= "Truck (5 to 8 tonnes)";
                break;
            case 10:
                pay =2800;
                vehicle= "Truck (8 to 11 tonnes)";
                break;
            case 11:
                pay =5500;
                vehicle= "Truck (3 axle)";
                break;
            case 12:
                pay =6000;
                vehicle= "Trailer (4 axle)";
                break;
            /*case 13:
                pay =6000;
                break;*/
                
            default:
                pay=6000;
                vehicle= "Trailer (4 axle above)";
                break;
        }
        System.out.println("Vehicle Class: "+ vehicle);
        System.out.println("Payment: "+pay);   
            
        
    }

    
}
