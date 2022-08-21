package padma_bridge_toll;

public class Payment {
    public void transectionDetails(int cash, int vClass){
        Vehicle_Class payment = new Vehicle_Class();
                  int pay = payment.payment(vClass);
                  int return1 = cash - pay;

                  System.out.println("Cash:"+ cash);
                  System.out.println("Payable amount:"+ pay);
                  System.out.println("Return:"+ return1);

    }
}
