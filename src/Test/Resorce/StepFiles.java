package Test.Resorce;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepFiles {
	
	@Given("^Add Two numbers$")
	public void Add_Two_numbers() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^(\\d+) addition (\\d+)$")
	public void addition(int arg1, int arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^the total sum should be (\\d+)$")
	public void the_total_sum_should_be(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}


}
