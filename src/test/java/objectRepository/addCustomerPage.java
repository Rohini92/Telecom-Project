	package objectRepository;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.tele.Base;


	public class addCustomerPage extends Base {
		
		public addCustomerPage() {

			PageFactory.initElements(driver, this);
		
		}

		 
		@FindBy(id="fname")
		public WebElement fname;
		
		@FindBy(id="lname")
		public WebElement lname;
		
		@FindBy(id="email")
		public WebElement emailAdd;
		
		@FindBy(name="addr")
		public WebElement Address;
		
		@FindBy(id="telephoneno")
		public WebElement mobile;
		
		@FindBy(name="submit")
		public WebElement submit;

		
		public WebElement getFname() {
		return fname;
		}

		public WebElement getLname() {
			return lname;
		}

		public WebElement getEmailAdd() {
			return emailAdd;
		}

		public WebElement getAddress() {
			return Address;
		}

		public WebElement getMobile() {
			return mobile;
		}

		public WebElement getSubmit() {
			return submit;
		}
		public WebElement getCheck() {
			return check;
		
		}
}