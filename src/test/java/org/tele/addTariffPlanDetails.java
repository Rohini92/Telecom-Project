package org.tele;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import objectRepository.AddTariffPage;

public class addTariffPlanDetails extends Base{

@When("The user fill in the tariff plan details {string} , {string},{string},{string},{string},{string},{string}")
public void the_user_fill_in_the_tariff_plan_details(String MonthRent, String freeLoc,
		String freeInt, String freeSMS, String localCharge, String intCharge, String smsCharge) {
	AddTariffPage page = new AddTariffPage();
	type(page.getMonthlyRental(),MonthRent);
	type(page.getFreeLocalMins(),freeLoc);
	type(page.getFreeIntMins(),freeInt);
	type(page.getFreeSMSpack(),freeSMS);
	type(page.getLocalperminchar(),localCharge);
	type(page.getInterpermincharges(),intCharge);
	type(page.getSmsPercharge(),smsCharge);
	
}


@Then("The user should see the success message {string} in add tariff plan page")
public void the_user_should_see_the_success_message_in_add_tariff_plan_page(String string) {
	AddTariffPage page = new AddTariffPage();
	Assert.assertEquals("Congratulation you add Tariff Plan",page.getSuccessmessage().getText());
}
}
