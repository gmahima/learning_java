public class hi{
  public static void main(String[] args){
    System.out.println("we're going to create a new pez dispenser");
    PezDispenser dispenser = new PezDispenser("yoda");
    PezDispenser dispenserAnother = new PezDispenser("eren");
    System.out.printf(" dispenser hi this is %s \n", dispenser.getCharacterName());
    System.out.printf(" dispenserAnother hi this is %s \n", dispenserAnother.getCharacterName());
     String previousValue = dispenser.swapHead("darthvader");
     System.out.printf("previously it was %s now it is %s \n", previousValue, dispenser.getCharacterName());
     dispenser.swapHead("bhargav");
     System.out.printf("now it is %s \n", dispenser.getCharacterName());
     System.out.printf(" dispenserAnother hi this is %s \n", dispenserAnother.getCharacterName());
    }

}
