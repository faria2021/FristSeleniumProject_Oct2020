package launchBrowser;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome{

//ctrl+space is for bringing the main method in selenium
//ctrl ++ for make front big and ctrl _ _ for make small
//shift key will use for coping the hole things
	
	
	public static void main(String[] args) throws InterruptedException {
	
   
	System.setProperty("webdriver.chrome.driver", "C:\\Aug2020_Selenium\\FirstSeleniumProject\\driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	// driver.manage().window().minimize();
	Thread.sleep(4000);
	driver.close();
	

	
}
	
	//from w3 School
//    class Animal{
//	public void animalSound() {
//		System.out.println("the animal makes a sound");
//	}
//	class pig extends Animal{
//		public void animalSound() {
//			System.out.println("the pig says wee wee");
//		}
//		//now this is a polipormizam concept;same class name,we can make three way of object of this class
//		Animal animal = new Animal();
//		pig pig = new pig();
//		Animal pig1 = new Pig();
//	}
}

