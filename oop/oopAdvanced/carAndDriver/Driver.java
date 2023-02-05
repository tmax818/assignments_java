public class Driver extends Car {


    public void drive(){
        this.gas -= 1;
        System.out.println(String.format("Driving. Gas remaining: %d", this.gas));
    }

    public void boost(){
        this.gas -= 3;
        System.out.println(String.format("Boosting. Gas remaining: %d", this.gas));
    }

    public void refuel(){
        this.gas += 2;
        System.out.println(String.format("Refueling. Gas remaining: %d", this.gas));
    }
    
}
