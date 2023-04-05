/* This is a stub for the Cafe class */
/** This class represents a building of type Cafe
* This specific building only has an inventory of coffee and coffee products
  in addition to all the attributes of a regular building. 
* This class contains methods to sell coffee as well as restock coffee ingredients.
  
*/
public class Cafe extends Building{
    
    private int nCoffeeOunces; 
    private int nSugarPackets; 
    private int nCreams; 
    private int nCups;

    /**
   * Creates a Cafe using the "Building" class
   * @param name The name of the building
   * @param address The address of the building
   * @param nFloors The number of floors
   */

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 50;
        this.nSugarPackets = 50;
        this.nCreams = 50;
        this.nCups = 10;

        System.out.println("You have built a cafe: ☕");
    }

    public Cafe(String name, String address) {
        super(name, address);
        this.nCoffeeOunces = 50;
        this.nSugarPackets = 50;
        this.nCreams = 50;
        this.nCups = 10;

        System.out.println("You have built a cafe: ☕");
    }

    /**
    * Tells a user that they have not entered a coffee order.
    */
    public void sellCoffee(){
        System.out.println("Sorry, a coffee order was not received.");
    }

    /**
    * Sells a standard coffee order by decreasing the values of the coffee and coffee ingredients by a specified number.
    * @param coffeeOrder
    */
    public void sellCoffee(String coffeeOrder){

        if (coffeeOrder.toLowerCase().equals("regular" ) || coffeeOrder.toLowerCase().equals("normal")){
    if (16 > nCoffeeOunces){
        restock(50, nSugarPackets, nCreams, nCups);
    }
    if (2 > nSugarPackets){
        restock(nCoffeeOunces, 50, nCreams, nCups);
    }
    if (2 > nCreams){
        restock(nCoffeeOunces, nSugarPackets, 50, nCups);
    }
    if (nCups < 2){
        restock(nCoffeeOunces, nSugarPackets, nCreams, 10);
    }

    nCups = nCups-1;
    nCoffeeOunces = nCoffeeOunces - 16;
    nSugarPackets = nSugarPackets - 2;
    nCreams = nCreams - 2;
            }
    }
    
    /**
    * Sells coffee by decreasing the the values of the coffee and coffee ingredients.
    * @param size
    * @param nSugarPack
    * @param numCreams
    */
    public void sellCoffee(int size, int nSugarPack, int numCreams){
    
        if (size > nCoffeeOunces){
            restock(50, nSugarPackets, nCreams, nCups);
        }
        if (nSugarPack > nSugarPackets){
            restock(nCoffeeOunces, 50, nCreams, nCups);
        }
        if (numCreams > nCreams){
            restock(nCoffeeOunces, nSugarPackets, 50, nCups);
        }
        if (nCups < 2){
            restock(nCoffeeOunces, nSugarPackets, nCreams, 10);
        }

        nCups = nCups-1;
        nCoffeeOunces = nCoffeeOunces - size;
        nSugarPackets = nSugarPackets - nSugarPack;
        nCreams = nCreams - numCreams;
    } 

    /**
    * Restocks the coffee and coffee ingredients by increasing their varibale values
    * @param numCoffeeOunces
    * @param numSugarPackets
    * @param numberCreams
    * @param numCups
    */
    private void restock(int numCoffeeOunces, int numSugarPackets, int numberCreams, int numCups){
        nCoffeeOunces = numCoffeeOunces;
        nSugarPackets = numSugarPackets;
        nCreams = numberCreams;
        nCups = numCups;
    } 

    /**
   * Overrides the showOptions() method to print the methods available for the cafe class
   */
    @Override   
    public void showOptions() {
            System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + sellCoffee(int size, int nSugarPack, int numCreams)\n");
    }

    /**
   * Overrides the goTOFloor() to ensure persons are only able to access the first floor.
   */
    @Override
    public void goToFloor(int floorNum) {
        if (this.activeFloor == -1) {
            throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
        }
        if (floorNum > 1) {
            throw new RuntimeException("You are only allowed on the first floor.");
        }
        System.out.println("You are now on floor #" + floorNum + " of " + this.name);
        this.activeFloor = floorNum;
    }
    
    public static void main(String[] args) {
        
    }
    
}
