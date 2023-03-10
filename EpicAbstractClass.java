public abstract class EpicAbstractClass implements EpicInterface {

    /*
    *   The type EpicAbstractClass must implement the inherited abstract method EpicInterface.getEpicSauce()
        The type EpicAbstractClass must implement the inherited abstract method EpicInterface.setEpicSauce(String)
        The type EpicAbstractClass must implement the inherited abstract method EpicInterface.isEpicSauce(String)
        The type EpicAbstractClass must implement the inherited abstract method EpicInterface.printEpicSauce()

        This error looks scary, but it's actually really simple. It's just asking us to honor our contract from EpicInterface. 
    */

    private String epicSauce = "Epic Sauce"; // this is a private variable, which means that it can only be accessed in this class.

    // now let's make a constructor
    public EpicAbstractClass (String epicSauce) {
        this.epicSauce = epicSauce;
    }

    public void printEpicSauce() {
        System.out.println(epicSauce+ "? epic sauce!");
    } // this is a non-abstract method in an abstract class. We can't make an instance of EpicAbstractClass, but we can use its method
    // printEpicSauce() without having to implement it in Study

    // now let's make a getter and setter
    public abstract String getEpicSauce();
    public abstract void setEpicSauce(String epicSauce);
    // since these are abstract methods unlike above, we can't put a body for them. We just need to specify that they exist because we have to honor
    // our contract with EpicInterface

    // now let's make a method that returns a boolean
    public abstract boolean isEpicSauce(String compare); // same logic as above!

}
