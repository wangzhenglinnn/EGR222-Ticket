public class StudentAdvanceTicket extends AdvanceTicket {
    private int number;
    private int advanceDays;
    @Override
    public double getPrice() {
        return 0.5 * super.getPrice();
    }
    public StudentAdvanceTicket(int number,int advanceDays){
      super(number,advanceDays);
        this.advanceDays=advanceDays;
        this.number=number;

    }
    public String toString(){

        return ("Ticket Type:Student Advance, Number: "+this.number+", Price: "+getPrice());
    }


}
