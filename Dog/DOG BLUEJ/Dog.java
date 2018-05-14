
/**
 * Escreva a descrição da classe Dog aqui.
 * This class contains the information of a dog.
 * @author (Rodrigo Ferreira Rodrigues) 
 * @version (14/05/2018 : 04:10)
 */
public class Dog
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String name;
    private String breed;
    private int age;
    private String color;

    /**
     * COnstrutor para objetos da classe Dog
     */
    public Dog(String DogName, String DogBreed, int DogAge, String DogColor)
    {
        // inicializa variáveis de instância
        this.name = DogName;
        this.breed = DogBreed;
        this.age = DogAge;
        this.color = DogColor;
    }

    /**
     * Getters
     */
    
    public String getName(){
        return this.name;
    }
    
    public String getBreed(){
        return this.breed;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getColor(){
        return this.color;
    }
    
    /**
     * Método que imprime o estado atual do cachorro.
    */
   
    public void printDetails(){
        System.out.println("Name: "+ this.getName());
        System.out.println("Breed: "+ this.getBreed());
        System.out.println("Age: "+ this.getAge());
        System.out.println("Color: "+ this.getColor());
    }
}
