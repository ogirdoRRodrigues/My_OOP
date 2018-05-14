
/**
 * Escreva a descrição da classe Book aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Book
{
    //The fields
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private int copies;
    
    //Constructor
    
    public Book(String BookAuthor, String BookTitle, int BookPages){
        this.author = BookAuthor;
        this.title = BookTitle;
        this.pages = BookPages;
        this.refNumber = "";
        this.borrowed = 0;
        this.copies = 1;
    }
    
    //Getters
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public String getRefNumber(){
        return this.refNumber;
    }
    
    public int getBorrowed(){
        return this.borrowed;
    }
    
    public int getCopies(){
        return this.copies;
    }
    //Setters
    
    public void setRefNumber(String NumberRef){
        if(NumberRef.length() > 3){
            this.refNumber = NumberRef;
        }
        else{
            System.out.println("Enter a text that is larger than three.");
        }
    }
    
    //PrintDetails 
    public void printAuthor(){
        System.out.println("Author: "+ this.getAuthor());
    }
    
    public void printTitle(){
        System.out.println("Title: "+ this.getTitle());
    }
    
    public void borrowed(){
        if(this.getCopies() > 0){
            this.borrowed = this.borrowed + 1;
            this.copies -= 1;
        }
        else{
            System.out.println("All borrowed copies.");
        }
    }
    
    public void increaseCopies(){
        this.copies += 5;
    }
    
    public void bookBack(){
        if(this.getBorrowed() > 0){
            this.borrowed -= 1;
            this.copies += 1;
        }
        else{
            System.out.println("All books were returned.");
        }
    }
    public void printDetails(){
        System.out.println("################");
        System.out.println("# Book Author: "+ this.getAuthor());
        System.out.println("# Book Title: "+ this.getTitle());
        System.out.println("# Book Pages: "+ this.getPages());
        if(this.getRefNumber().length() > 3){
            System.out.println("# Book RefNumber: "+ this.getRefNumber());
        }
        else{
            System.out.println("# ZZZ");
        }
        System.out.println("# Book Borrowed: "+ this.getBorrowed());
        System.out.println("# Book Copies: "+ this.getCopies());
        System.out.println("################");
    }
}
