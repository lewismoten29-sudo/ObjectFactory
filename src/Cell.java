public class Cell {
 //Instance varibles
public int size;
public boolean isDividing;
public String cellType;
public boolean isCancerous;
public Cell() {
    size = 2;
    isDividing = true;
    cellType = "nerve cell";
    isCancerous = false;
} //end of cell method
public void printInfo(){
    System.out.println("Cell size: " + size + " micrometers");
    System.out.println("Is the cell dividing: " + isDividing);
    System.out.println("Cell type: " + cellType);
    System.out.println("Is the cell cancerous: " + isCancerous);

}  //end of print info method
} //end of file
