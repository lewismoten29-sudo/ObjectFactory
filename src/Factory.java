public class Factory {

//todo: make 2 varibles called isOpen and yearFounded. What data type do you need ?
    //instance variables; always use public
public int yearFounded = 2026;
public boolean isOpen = true;
//String: hold words, punctuation, sentences
    //have to use quotation marks ("...")
public String owner = "Lewis";

//object;  objects are made from classes we create
public Pumpkin pumpkin1;
//todo: make another pumpkin called pumpkin 2
public Pumpkin pumpkin2 ;
public boolean isMold;

//todo: make pumpkin 3
    //1: define it 2. use constructor 3. change the default value of  pumpkin3 4. print new pumpkin info
public Pumpkin pumpkin3;
public int randomSize;



public static void main(String[] args) {
        Factory a = new Factory();


    } //end of psvm

    //special method: constructor
    public Factory(){
        System.out.println("Welcome to Lewis's Factory"); //prints words in "" in terminal
        System.out.println("the year founded is ...");
        System.out.println(yearFounded);
        System.out.println("it is " + isOpen + " that the factory is Open");
        //todo: print out who the owner is
        System.out.println("the owner is " + owner );
        pumpkin1 = new Pumpkin(10, true,"Orange");
        //System.out.println("Pumpkin Color: " + pumpkin1.color);
        //todo: print out the rest of pumpkin's instance variables
        //System.out.println("Pumpkin Size: " + pumpkin1.size);
        //System.out.println("Is the pumpkin a Jack-O-Lantern:  " + pumpkin1.isJackolantern);
       pumpkin1.printInfo();
        //todo: use the pumpkin constuctor to finish making pumpkin 2
        randomSize = (int)(Math.random() * 30); //range 0-29
        pumpkin2 = new Pumpkin(randomSize,false,"Rainbow");
        pumpkin2.color = "Blue";
        pumpkin2.size = randomSize; //pumpkin 2 is double the size of pumpkin 1
        pumpkin2.printInfo();
        //Pumpkin 3
        pumpkin3 = new Pumpkin(randomSize, true, "White");
        pumpkin3.color = "White";
        pumpkin3.size = pumpkin2.size *2;
        pumpkin3.isJackolantern = false;
        //print out information for pumpkin 3
        pumpkin3.printInfo();






    }//end of constructor




}// end of file
