package eql.wowhead;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageRecherche {

	@FindBy (xpath="//td[@class='icon-boss-padded']/a")
	private WebElement element_recherche;
	

	public PagePNJ choisirElement(WebDriver driver) {
		
		
		element_recherche.click();
		
		return PageFactory.initElements(driver, PagePNJ.class);
	
	}
}
