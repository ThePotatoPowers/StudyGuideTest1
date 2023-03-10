import java.util.ArrayList; // import for ArrayList, necessary if we want to use ArrayLists
import java.util.List; // import for List, necessary if we want to use Lists. 
//We don't want to use Lists, but I am just using it to show polymorphism
import java.util.Scanner; // import for Scanner, necessary if we want to use Scanner
import java.io.File; // import for File, necessary if we want to use Files
import java.io.FileNotFoundException; /* import for FileNotFoundException, necessary if we want to use Files because 
 we need to handle if the file is not found */
/** 
     * @author: Zidane Karim
     * @version: Test 1
     */

// IMPORTANT PRE-NOTE! Please don't worry too much about syntax. We'll have a reference sheet that should help a ton. 
// Here I just want to show how concepts work 


public class Study extends EpicAbstractClass { 
    // Inheritance, Abstract Classes, and Interfaces
    
    // inherits from EpicAbstractClass, 
    // which means that Study needs to implement all of the abstract methods in EpicAbstractClass. Let's do that!
    // We can use the non-abstract methods in EpicAbstractClass, like printEpicSauce(), without having to implement them in Study
    private String epicSauce; // this is a private variable, which means that it can only be accessed in this class.

    public String getEpicSauce() {
        return epicSauce;
    }
    public void setEpicSauce(String epicSauce) {
        this.epicSauce = epicSauce;
    }
    public boolean isEpicSauce(String compare) {
        return epicSauce.equals(compare);
    }

    public Study(String epicSauce) {
        super(epicSauce); // this calls the constructor in EpicAbstractClass, which sets the epicSauce variable
    }
                                               
    
    
    public static void main(String[] args) throws Exception { // the code for if we want to run anything directly in this file! java filename runs the main method
        // I'll explain the throws Exception part later

        Study study = new Study("Epic Sauce"); // create a new Study object, which is an instance of the Study class
        study.setEpicSauce("bruh");
        System.out.println(study.getEpicSauce());
        System.out.println(study.isEpicSauce("bruh"));
        study.printEpicSauce();








        // Exceptions, Polymorphism, Files, ArrayList 
        try {
            File file = new File("EpicText.txt"); // create a new File object, which we need to represent the file as a java object
            Scanner scanner = new Scanner(file); // create a new Scanner object, which is a class that reads files
            /*
             * The important part of Scanner is the nextLine() method, which READS the next line in the file and converts it to a String that
             * we can use
             */
            List<String> lines = new ArrayList<String>(); // create a new ArrayList object, which is a class that stores a list of objects
            /*
             * The important part of ArrayLists are that they don't need to have a set size, and you can add and remove elements from them
             * easily
             * This is important because we might not know how many lines are in the file, so we can't make an array with a set size
             * Also we can add/remove stuff from the list if we want, which we can't in a normal array
             * 
             * You might notice that the datatype for lines is List rather than ArrayList. This is polymorphism, which is a concept that
             * allows us to do some cool stuff with inheritance. Basically, we can use the List class as the datatype for lines, even though
             * we are using an ArrayList object. This is because ArrayList is a subclass of List, so we can use the List class as the
             * datatype for lines, and it will still work. 
             * 
             * This is useful because, let's say that List has a method called printEpicSauce() and ArrayList doesn't. If we use List as the
             * datatype for lines, we can still call printEpicSauce() on lines, even though it is an ArrayList object. When we do polymorphism
             * with the datatypes, the JVM will use List's printEpicSauce() method, even though it is an ArrayList object. 
             * 
             * When we compile, it's read as a list by computer
             * When we run, it's read as an ArrayList by the JVM
             * That isn't really important but could be a test question
             * 
             * That was a really long explanation so let me know if I can clarify
             * 
             */

            while (scanner.hasNextLine()) { // while there is another line in the file
                lines.add(scanner.nextLine()); // add the next line of the file to the ArrayList
                // lines.remove(0); // remove the first element of the ArrayList
                // lines.add(0, "Hello!"); // add "Hello!" to the first element of the ArrayList
                // lines.set(0, "Hello!"); // set the first element of the ArrayList to "Hello!"
                //lines.remove("h"); // remove the first element of the ArrayList that is equal to "h"

                // I left all those commented out because I don't want to do that stuff it was just to show the methods
            }
            scanner.close(); // close the scanner
            if (lines.size() == 0) throw new Exception("File is empty!"); 
            /*
             * Here I make my own exception, with the key word throw. I throw an exception if the file is empty, which to me is an error.
             * Java doesn't see it as an error, but I do/the user does, so I throw an exception.
             * 
             * Now the throws Exception part of the main method makes sense. I am throwing an exception, so I need to make sure it's handled.
             * You can handle by putting it into a try catch block, or by putting throws ExceptionType into the method signature. 
             * I put it into the main method because it's shorter and less to write
             */

            for (String line : lines) { // for each line in the ArrayList
                System.out.println(line); // print the line
            }


            // Let's play with ArrayLists a bit more!
            lines.remove(0); // remove the first element of the ArrayList
            System.out.println(lines.get(0)); // Look at the NEW first element of the ArrayList!
            // The ArrayList is now shorter by one element, and the first element is now the second element of the ArrayList.
            // Basically you just shift everything to the left by one index, and the size() of the ArrayList is now one less than it was before
            






        } catch (FileNotFoundException e) { // if the file is not found
            System.out.println("File not found!"); // print "File not found!"
        }
        finally {
            System.out.println("Done!"); // print "Done!" no matter what, if we had an error or not. 
            // For one try, we can have multiple catch blocks
            // but only one finally block
        }
    
    }

}
