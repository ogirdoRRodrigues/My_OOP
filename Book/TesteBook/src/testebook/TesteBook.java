package testebook;
public class TesteBook {
    public static void main(String[] args) {
        Book book1 = new Book("Ana Carolina", "Confissões", 500);
        book1.borrowed();
        book1.printDetails();
        book1.borrowed();
        book1.bookBack();
        book1.printDetails();
        book1.bookBack();
    }
    
}
