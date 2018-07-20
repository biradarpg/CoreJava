package testngConcepts;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// This code will implement TestNG listeners

@Listeners(testngConcepts.Listener.class)

// For e.g. @Listeners(utility.Listener.class)

public class ListenerTest {

  @Test

  public void main() {

  }

}