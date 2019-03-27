package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tele.Base;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(xpath = "(//a[text()='Add Customer'])[1]")
	private WebElement lnk_addCustomer;

	@FindBy(xpath = "(//a[text()='Add Tariff Plan'])[1]")
	private WebElement lnk_addTariffPlan;

	public WebElement getLnk_addCustomer() {
		return lnk_addCustomer;
	}

	public WebElement getLnk_addTariffPlan() {
		return lnk_addTariffPlan;
	}

}
