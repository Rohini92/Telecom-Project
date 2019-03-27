package org.tele;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectRepository.addCustomerPage;

public class addCustomer extends Base{
	@When("The user fill in the customer details")
	public void the_user_fill_in_the_customer_details(DataTable customerDetails) {
		addCustomerPage page= new addCustomerPage();
		List<Map<String,String>>customerDetailsMaps=customerDetails.asMaps(String.class, String.class);
		System.out.println(customerDetails);
		type(page.getFname(),customerDetailsMaps.get(2).get("fname"));
		type(page.getLname(),customerDetailsMaps.get(0).get("lname"));
		type(page.getEmailAdd(),customerDetailsMaps.get(1).get("emailAdd"));
		type(page.getAddress(),customerDetailsMaps.get(2).get("Address"));
		type(page.getMobile(),customerDetailsMaps.get(2).get("mobile"));	
		
	}

	@When("The user clicks the sumbit button")
	public void the_user_clicks_the_sumbit_button() {
		addCustomerPage page = new addCustomerPage();
		Click(page.getSubmit());
	}
}

	


