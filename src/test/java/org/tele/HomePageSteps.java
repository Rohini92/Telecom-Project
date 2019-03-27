package org.tele;

import cucumber.api.java.en.Given;
import objectRepository.HomePage;

public class HomePageSteps extends Base {

	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		HomePage home = new HomePage();
		Click(home.getLnk_addCustomer());
	}
		
	@Given("The user is in add tariff plan page")
	public void the_user_is_in_add_tariff_plan_page() {
		HomePage home = new HomePage();
		Click(home.getLnk_addTariffPlan());    
	}
}
