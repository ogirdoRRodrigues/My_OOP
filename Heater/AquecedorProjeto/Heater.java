
/**
 * Escreva a descrição da classe Heater aqui.
 * 
 * @author (Rodrigo Ferreira Rodrigues) 
 * @version (14/05/2018)
 */
public class Heater
{
    //The current teperature
    private double temperature;
    
    /**
    * Create a Heater object, with initial temperature of 15 degress.
    */
   
   public Heater(){
       this.temperature = 15.0f;
   }
       
   /**
   * Increase the temperature
   */  
  
   public void increaseTemperature(){
       this.temperature += 5.0f;
   }
   
   /**
    * Decrease temperature
    */
   
   public void decraseTemperature(){
       this.temperature -= 5.0f;
    }
}

