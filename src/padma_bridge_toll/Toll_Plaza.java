package padma_bridge_toll;


import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
public class  Toll_Plaza {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   
   public void Date_Time() {
    System.out.println(dtf.format(now)); 
  }
  static int count=0;

  public  int vehicle_count(int c){
    //int count=1;
    count=count+c;
    return count;
  }

  
    
}
