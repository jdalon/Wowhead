package eql.wowhead;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




	
	public class PageAccueil {

		@FindBy (name="q")
		private WebElement barre_de_recherche;

		@FindBy (xpath="//div[contains(@class,'as-js-btn-deactivate-all-initial as-oil__btn-grey as-oil__btn-initial')]")
		private WebElement refuserCookies;

		@FindBy (xpath="//div[contains(@class,'as-oil-l-item initial-btn-wrapper')]/button")
		private WebElement validation;
		
		
	public void validerCookies(WebDriver driver) throws InterruptedException {
		

		validation.click();
	}
	
	
	public PageRecherche rechercher (WebDriver driver, String elt) {
	
		
		barre_de_recherche.sendKeys(elt);
		barre_de_recherche.sendKeys(Keys.ENTER);
		
		
		return PageFactory.initElements(driver, PageRecherche.class);
	
	
}
}