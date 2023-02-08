
/**
 * Create a Mammal class that has an energyLevel member variable and displayEnergy() method. The displayEnergy() method should show the animal's energy level as well as return it.
 */

public class Mammal {

    private int energyLevel;

    public Mammal(){
        this.energyLevel = 100;
    }


    public int getEnergyLevel() {
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    
}
