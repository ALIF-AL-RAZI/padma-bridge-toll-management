package padma_bridge_toll;


import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
public class  Toll_Plaza {
    DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
   LocalDateTime date1 = LocalDateTime.now();  

   DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
   LocalDateTime time1 = LocalDateTime.now(); 
   
   public void Date() {
    System.out.println(date.format(date1)); 
  }

  public void Time() {
    System.out.println(time.format(time1)); 
  }


    /*LocalDate Date = LocalDate.now(); 
    System.out.println(Date);

    LocalTime Time = LocalTime.now();
    System.out.println(Time);*/











  static int count=0;

  public  int vehicle_count(int c){
    //int count=1;
    count=count+c;
    return count;
    

  }

 
  public int transectionID(){
    int trx = 100001+count;
    return trx;
    }
  

  
    
}
