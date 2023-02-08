
/**
 * Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()
 */

public class Gorilla extends Mammal {

    /**
     * For the throwSomething() method, have it print out a message indicating that the gorilla has thrown something, as well as decrease the energy level by 5
     */

    public void throwSomething(){
        this.setEnergyLevel(this.getEnergyLevel() - 5);
        System.out.printf("Throw something, energyLevel is now: %d%n", this.getEnergyLevel());
    }

    /**
     * For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10
     */

     public void eatBananas(){
        this.setEnergyLevel(this.getEnergyLevel() + 10);
        System.out.printf("eatBananas, energyLevel is now: %d%n", this.getEnergyLevel());
     }

     /**
      * For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10
      */

      public void climb(){

      }
}
