public class WalkupTicket extends Ticket{
    private int number;

    @Override
    public double getPrice(){
        return super.getPrice();
    }
    public WalkupTicket(int number){
        super(number);
        this.number=number;

    }
    public String toString(){
        return ("Ticket Type:Walk-up, Number: "+this.number+", Price: "+getPrice());
    }

}
