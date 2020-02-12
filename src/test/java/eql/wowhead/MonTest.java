
package eql.wowhead;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

public class MonTest {

private String BROWSER=System.getProperty("browser");
	
WebDriver driver;

	@Before
	
	public void setUp() {
		System.out.println("\n@Before");
		
		if (BROWSER.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
		else if (BROWSER.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/main/resources/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if (BROWSER.equalsIgnoreCase("Explorer")) {
			System.setProperty("webdriver.ie.driver", "src/main/resources/Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		else 
			System.out.println("Veuillez choisir un navigateur entre Chrome, Fixefoxe et Explorer");
	}

	@Test

	public void testPageObject() throws InterruptedException {
		driver.get("https://fr.wowhead.com");
		//Thread.sleep(2000);
		PageAccueil page_accueil = PageFactory.initElements(driver, PageAccueil.class);
		driver.manage().window().maximize();
		System.out.println("1");
		Thread.sleep(5000);
		System.out.println("2");
		
		page_accueil.validerCookies(driver);
		System.out.println("3");
		PageRecherche pageRecherche = page_accueil.rechercher(driver,"Lardeur");
		Thread.sleep(2000);
		PagePNJ page_pnj = pageRecherche.choisirElement(driver);

	}
}