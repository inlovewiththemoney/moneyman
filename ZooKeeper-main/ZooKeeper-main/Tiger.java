// 5
public class Tiger extends Feline {

  public Tiger(String food, boolean nocturnal, 
  double aveLifeSpan)
{
super(food, nocturnal, aveLifeSpan);
}

  public void swim() {
    System.out.println("The tiger is swimming.");
  }

  public void huntAlone() {
    System.out.println("The tiger is hunting alone.");
  }
}