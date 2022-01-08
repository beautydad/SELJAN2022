package Advanced;

import org.testng.annotations.DataProvider;

import com.baseclass.Library;

public class Excel_dataprovider extends Library {
	
	
		
		OrangeLogin orangelogin;
		
		SeleniumUtility utility;
		@BeforeClass
		public void setup() throws IOException{
			launchApplication();
			
		}
		
		@DataProvider(name="orangehrm")
		public Object[][] passData() throws IOException{
			ExcelUtility read=new ExcelUtility();
			System.out.println("after method instant");
			Object[][] data = read.readData("src/test/resources/TestData/test.xlsx", "Sheet1");
			System.out.println("after reading data");
			return data;
		}
		@Test(dataProvider="orangehrm")
		public void Login(String username,String password) throws  InterruptedException, FileNotFoundException, IOException{
			orangelogin = new OrangeLogin(driver);
			orangelogin.EnteruserName(username);
			Thread.sleep(1000);		
			orangelogin.Enterpassword(password);
			Thread.sleep(1000);	
			orangelogin.submitButton();
			
		}
		
		@AfterClass
		public void teardown(){
			utility= new SeleniumUtility(driver);
			utility.to_take_screenshot("src/test/resources/ScreenShots/orangelogin.png");
			utility.getTitle();
			quit();
		}


	}

}
