//5

public class Elephant extends Hooved {
  // 13
  public Elephant(String food, boolean nocturnal, 
                double aveLifeSpan)
  {
  super(food, nocturnal, aveLifeSpan);
  }
  
  public void forage(){
    System.out.println("The elephant forages.");
  }

  public void trumpet(){
    System.out.println("The elephant trumpets.");
  }

  // PLTW 4.96 #8
  public String toString()
{
  return "This is an object of the Elephant class.";
}
}