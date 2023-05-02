/*
 * Activity 4.9.2
 * Creators: Emil Wilson, Vihan Khajanchi, Samarth Pasala, Brandon Huynh
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    //6 //14 //15
    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant.trumpet();

    //8
    Tiger tiger = new Tiger();
    tiger.swim();
    tiger.huntAlone();
    // 10
    tiger.growl();
    tiger.getLifeSpan();
    //9 Hierarchy: Tiger -> Feline -> Animal -> Object

    // PLTW 4.96 #1-3
    Animal a = new Elephant("leaves, grasses, roots", false, 60.0);
    a.isNocturnal();
    Animal a1 = new Elephant();
    Animal a2 = new Lion();
    Animal a3 = new Gorilla();
    // no access a.trumpet();

    // PLTW 4.96 #5
    Animal a1 = new Animal();
    a1.sleep();
    // Object a2 = new Animal();
    // a2.sleep();

    // PLTW 4.96 #9
    Object o = new Object();
    System.out.println(o.toString());
    Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(e.toString());

    // PLTW 4.96 #11
    Animal a3 = new Animal();
    System.out.println(a3.toString());
    
    // PLTW 4.96 #13
    Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(a4.toString());

    // PLTW 4.96 #15
    Object o2 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(o2.toString());


    
    
    // 19: the output indicates that the Elephant class did not call the Animal constructor, meaning that the instance variables were not initialized

    // 23: there needs to be a no-argument constructor within the Elephant, Tiger, and Feline class since they all have a parameterized constructor.
    
    //Conclusion questions: 1) The ways that subclasses can use the constructors of their superclass(es) is by using the special keyword super(), by using/calling parameter lists through it. With the super() keyword, one is able to initialize inherited instance variables. 
  }
}