public class TicketClient {
    public static void main(String[] args){
            Ticket[] tickets=new Ticket[6];
        tickets[0]=new Ticket(0);
            tickets[1] =new WalkupTicket(1);
             tickets[2]=new AdvanceTicket(2,15);
        tickets[3]=new AdvanceTicket(3,5);
        tickets[4]=new StudentAdvanceTicket(4,15);
        tickets[5]=new StudentAdvanceTicket(5,5);


             for(int i=0;i<6;i++){
                 System.out.println(tickets[i]);
             }

    }
}
