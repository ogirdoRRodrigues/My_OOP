package testedog;
public class Dog {
    private String name;
    private String color;
    private int age;
    private String breed;
    
//Constructor
    
    public Dog(String DogName, String DogColor, int DogAge, String DogBreed){
        this.name = DogName;
        this.color = DogColor;
        this.age = DogAge;
        this.breed = DogBreed;
    }
    
//Getters
    
    public String getName(){
        return this.name;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getBreed(){
        return this.breed;
    }
    
 //PrintDetails
    
    public void printDetails(){
        System.out.println("===================");
        System.out.println("Dog name: "+ this.getName());
        System.out.println("Dog age: "+ this.getAge());
        System.out.println("Dog breed: "+ this.getBreed());
        System.out.println("Dog color: "+ this.getColor());
        System.out.println("===================\n");
    }
}
