package Basic;

import java.io.IOException;

public class callwrapper {

	public static void main(String[] args) throws IOException  {
  Wrappermethods wm = new Wrappermethods();
  wm.insertapp("https://www.facebook.com");
  wm.enterbyid("email", "joshij@gmail.com");
  wm.enterbyid("pass", "xxxxxx");
  wm.clickbyxpath("u_0_2");
  wm.takesnap("E:\\takescreen\\file1.png");
  wm.closeapp();
	}

}
