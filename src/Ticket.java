public class Ticket {
   private int number;
   public double getPrice(){
        return 50;
    }
    public Ticket(int number){
       this.number=number;
    }
    public String toString(){

        return ("Number: "+this.number+", Price: "+getPrice());
    }
}
