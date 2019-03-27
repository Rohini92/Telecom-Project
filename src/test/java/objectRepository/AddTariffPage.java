package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tele.Base;

public class AddTariffPage {

	public AddTariffPage() {
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(id = "rental1")
	private WebElement monthlyRental;

	@FindBy(id = "local_minutes")
	private WebElement freeLocalMins;

	@FindBy(id = "inter_minutes")
	private WebElement freeIntMins;

	@FindBy(id = "sms_pack")
	private WebElement freeSMSpack;

	@FindBy(id = "minutes_charges")
	private WebElement localperminchar;

	@FindBy(id = "inter_charges")
	private WebElement interpermincharges;

	@FindBy(id = "sms_charges")
	private WebElement smsPercharge;

	@FindBy(name = "submit")
	private WebElement btnsubmit;

	@FindBy(xpath = "//input[@type='reset']")
	private WebElement butreset;

	@FindBy(xpath = "//h2[contains(text(),'Congratulation you add Tariff Plan')]")
	private WebElement successmessage;

	@FindBy(xpath = "//ul[@class='actions']//a[contains(text(),'Home']")
	private WebElement hometext;

	public WebElement getSuccessmessage() {
		return successmessage;
	}

	public void setSuccessmessage(WebElement successmessage) {
		this.successmessage = successmessage;
	}

	public WebElement getHometext() {
		return hometext;
	}

	public void setHometext(WebElement hometext) {
		this.hometext = hometext;
	}

	public WebElement getMonthlyRental() {
		return monthlyRental;
	}

	public void setMonthlyRental(WebElement monthlyRental) {
		this.monthlyRental = monthlyRental;
	}

	public WebElement getFreeLocalMins() {
		return freeLocalMins;
	}

	public void setFreeLocalMins(WebElement freeLocalMins) {
		this.freeLocalMins = freeLocalMins;
	}

	public WebElement getFreeIntMins() {
		return freeIntMins;
	}

	public void setFreeIntMins(WebElement freeIntMins) {
		this.freeIntMins = freeIntMins;
	}

	public WebElement getFreeSMSpack() {
		return freeSMSpack;
	}

	public void setFreeSMSpack(WebElement freeSMSpack) {
		this.freeSMSpack = freeSMSpack;
	}

	public WebElement getLocalperminchar() {
		return localperminchar;
	}

	public void setLocalperminchar(WebElement localperminchar) {
		this.localperminchar = localperminchar;
	}

	public WebElement getInterpermincharges() {
		return interpermincharges;
	}

	public void setInterpermincharges(WebElement interpermincharges) {
		this.interpermincharges = interpermincharges;
	}

	public WebElement getSmsPercharge() {
		return smsPercharge;
	}

	public void setSmsPercharge(WebElement smsPercharge) {
		this.smsPercharge = smsPercharge;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

	public void setBtnsubmit(WebElement btnsubmit) {
		this.btnsubmit = btnsubmit;
	}

	public WebElement getButreset() {
		return butreset;
	}

	public void setButreset(WebElement butreset) {
		this.butreset = butreset;
	}

}
