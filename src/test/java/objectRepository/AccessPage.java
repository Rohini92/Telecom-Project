package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tele.Base;

public class AccessPage {

	public AccessPage() {
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(xpath = "//table//tr[2]//b")
	private WebElement customeridmesage;
	@FindBy(xpath = "//table//tr[1]//b")
	private WebElement customeriddisplayed;

	public WebElement getcustomeridmesage() {
		return customeridmesage;
	}

	public WebElement getcustomeriddisplayed() {
		return customeriddisplayed;
	}

}
