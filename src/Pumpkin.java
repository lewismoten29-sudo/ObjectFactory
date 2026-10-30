public class Pumpkin {
    //class = is like a blueprints that will make things

    //instance variable
    //todo:turn these ideas into variables. What data types?
   //color
    public String color;
   //size
    public int size;
   //is Jackolantern
    public boolean isJackolantern;

    //special method: constructor
    //name has to match the class name
    //do not use void
    public Pumpkin(int pSize, boolean pIsJackolantern, String pColor){
        color = pColor;
        size = pSize;
        isJackolantern = pIsJackolantern;



    }//end of Pumpkin Constructor












//todo: make a method called printInfo()
    public void printInfo(){
        //todo: use sout to print the information of the pumpkin
        System.out.println("The color of the pumpkin is " + color);
        System.out.println("The size of the pumpkin is " + size);
        System.out.println("The pumpkin is a Jack-o-Lantern " + isJackolantern); //readeable

    }//end of printInfo


}// end of file
