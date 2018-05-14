package ticketmachine;
public class MachineTicket {
    //o preço de um bilhe nesta máquina.
    private int ticket;
    //A quantia de dinheiro inserida por um usuário até o momento.
    private int balance;
    //Total de dinheiro depositado na máquina.
    private int total;
    
    //Cria uma máquina com preço do ticket informado.
    public MachineTicket(int cost){
        //Preço de um ticket na máquina
        this.ticket = cost;
        this.balance = 0;
        this.total = 0;
    }
    
    //Getters
    
    //Retorna o valor de Ticket
    public int getTicket(){
        return this.ticket;
    }
    
    //Retorna o valor de balance
    public int getBalance(){
        return this.balance;
    }
    
    
    public int getTotal(){
       return this.total;
    } 
    
    //Inserie uma quantia de dinheiro na máquina.
    public void insertMoney(int amount){
        if(amount > 0){
            this.balance = this.balance + amount;
        }
        else{
            System.out.println("Use a positive amount rather than"+ amount);
        }
    }
    
    //Função para realizar a compra de um ticket
    public void printTicket(){
        //Inserir uma quantia suficiente para comprar no minimo 1 ticket
        if(this.getBalance() >= this.getTicket()){
            System.out.println("===============");
            System.out.println("= Successful purchase");
            System.out.println("= Ticket");
            System.out.println("= Price: "+ this.getTicket());
            System.out.println("===============");
            //Atualiza o total de dinheiro na máquina
            this.total = this.total + this.getTicket();
            //Atualiza o saldo do usuário.
            this.balance = this.balance - this.getTicket();   
        }
        else{
            System.out.println("You have to insert: "+ (this.getTicket() - this.getBalance()));
        }
    }
    
    //Função que retorna o dinheiro do usuário caso ele não deseje mais comprar tickets.
    //Ou caso ele pague a mais por um ticket.
    public int refundBalance(){
        int amountToRefund = 0;
        amountToRefund = this.getBalance();
        this.balance = 0;
        return amountToRefund;
    }
    
    //Função que retorna o valor total da máquina e faz um clear.
    //Observamos que o método emptyMachine é um método de acesso e modificador ao mesmo tempo, visto que
    //Retorna o valor total e por seguinte realiza sua alteração.
    public int emptyMachine(){
        int amountTotal = 0;
        amountTotal = this.getTotal();
        this.total = 0;
        return amountTotal;
    }
}
