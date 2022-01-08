package Advanced;

public class sampletestcasegrid {

		WebDriver driver;
		String baseurl, nodeurl;
		@BeforeTest
		public void setup() throws MalformedURLException
		{
		baseurl="http://facebook.com/";
		nodeurl="http://192.168.0.56:5506/wd/hub";
		DesiredCapabilities capablity = DesiredCapabilities.firefox();
		capablity.setBrowserName("firefox");
		capablity.setPlatform(Platform.WINDOWS);
		driver =new RemoteWebDriver(new URL(nodeurl),capablity);
		}
		@Aftertest
		public void aftertest()
		{
		driver.quit();
		}
		@Test
		public void simpletest(){
		driver.get(baseurl);
		String a= driver.getTitle();
		System.out.println("title of the page:"+a);
		}
		}

}
