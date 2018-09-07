package src.testngConcepts;

import org.testng.annotations.Test;

public class TestNgDependsEx {

  @Test (dependsOnMethods = { "OpenBrowser" })

  public void SignIn() {

	  System.out.println("This will execute second (SignIn)");

  }

  @Test

  public void OpenBrowser() {

/*<<<<<<< HEAD
	  
=======
>>>>>>> eab87807215fd472400c8ce41025c28283a3518f*/
	  System.out.println("This will execute first (Open Browser)");

  }

  @Test (dependsOnMethods = { "SignIn" })

  public void LogOut() {

	  System.out.println("This will execute third (Log Out)");

  }
}