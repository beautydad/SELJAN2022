package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsongroups {
  @Test
  public void login() {
	  System.out.println("login");
	  //executed and passes
  }
  
  @Test(dependsOnMethods= {"login"})
  public void search() {
	  Assert.assertEquals("abc", "xyz");
	  System.out.println("search");
	  /// executed and failes
  }
  
  @Test(dependsOnMethods= {"search"},alwaysRun=true)
  public void logout() {
	  //not executed and skipped
	  System.out.println("logout");
  }


}
