public class AdvanceTicket extends Ticket {
    private int number;
    private int advanceDays;
    @Override
    public double getPrice() {
        if (advanceDays >= 10) {
            return 0.6* super.getPrice();
        }
         else if (advanceDays > 0) {
             return 0.8 * super.getPrice();
         }
        return 0;
    }
    public AdvanceTicket(int number,int advanceDays){
        super(number);
        this.advanceDays=advanceDays;
        this.number=number;

    }
    public String toString(){

        return ("Ticket Type:Advance, Number: "+this.number+", Price: "+getPrice());
    }



}
