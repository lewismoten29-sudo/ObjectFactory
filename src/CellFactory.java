public class CellFactory {
  //Instance Variables
public int yearFounded = 2026;
public boolean isOperational = true;
public String director = "Lewis Moten";

public static void main(String[] args){
    CellFactory lab = new CellFactory();
} //end of psvm
    public Cell cell1; //Makes cell 1

    //cancer lab constructor
    public CellFactory(){
        System.out.println("Welcome to " + director +"'s cell factory.");
        System.out.println("This factory was founded in " + 2026);
        System.out.println("Factory is operational: " + isOperational);
        cell1 = new Cell();
        cell1.printInfo();//Prints the info for cell 1
    }//end of cellFactory constructor




} //end of the file
