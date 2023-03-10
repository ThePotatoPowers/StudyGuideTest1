public interface EpicInterface {
    String epicSauce = "Epic Sauce"; // we can't make variables private in interfaces, only public and/or final or nothing
    public void printEpicSauce();
    public String getEpicSauce();
    public void setEpicSauce(String epicSauce);
    public boolean isEpicSauce(String compare); // this is a method that returns a boolean, true or false

    // This file should have no body, just the method headers. That's all interfaces are, little blueprints/foundations that we can use to
    // specify to programmers what they need to implement. Remember Mr. Holmes's contracts? Interfaces are contracts that we force instead of
    // hoping for
}