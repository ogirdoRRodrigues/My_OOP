package ticketmachine;
public class TicketMachine {
    public static void main(String[] args) {
        //Crio o objeto ticketOne informando o seu preço.
        MachineTicket ticketOne = new MachineTicket(500);
        ticketOne.insertMoney(1000);
        ticketOne.printTicket();
        System.out.println("Amount Balance: "+ ticketOne.getBalance());
        ticketOne.printTicket();
        System.out.println("Amount Balance: "+ ticketOne.getBalance());
        ticketOne.insertMoney(350);
        ticketOne.printTicket();
        System.out.println("Receiving: "+ ticketOne.refundBalance());
        System.out.println("Total Machine: "+ ticketOne.getTotal());
        ticketOne.emptyMachine();
        //Realizando clear na máquina.
        System.out.println("Total Machine: "+ ticketOne.getTotal());
    }
    
}
