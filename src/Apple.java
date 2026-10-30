public class Apple {
 //todo: add the instance varible
  public int amount;
  public boolean isRed;
  public String appleName;
  public String size;

//todo: make a constructor that gives the instance variable default value
public Apple(){
    amount = 2;
    isRed = true;
    appleName = "Granny Smith";
    size = "Medium";

}
    public Apple(int aAmount , boolean aIsRed, String aAppleName, boolean aSize) {
        amount = aAmount;
        isRed = aIsRed;
        appleName = aAppleName;
        size = aSize;
    }
//todo: make printInfo method
public void printInfo(){
    System.out.println("Amount of apples: " + amount);
    System.out.println("The apple red:" + isRed);
    System.out.println("Apple Name: " + appleName);
    System.out.println("Size" + size);
}






}//end of apple class
