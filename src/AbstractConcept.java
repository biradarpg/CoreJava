package src;


public abstract class AbstractConcept
{
  public void name()              // concrete (non-abstract) method
  {
    System.out.println("Name is Jyostna");
  }
  public void marks()             // concrete (non-abstract) method
  {
    System.out.println("Marks scored are 80");
  }
  public static void main(String args[])
  {
  //  AbstractConcept s1 = new AbstractConcept();   // Error raised, see the errror in screenshot
  }
}