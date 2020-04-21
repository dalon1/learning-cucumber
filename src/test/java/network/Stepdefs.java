package network;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/resources/network",
	glue = {"network"}
)
public class Stepdefs {
	boolean isNetworkOk;
	boolean isEmployeeLogIn;
	
	@Given("network is down")
	public void network_is_down() {
	    // Write code here that turns the phrase above into concrete actions
	    isNetworkOk = false;
	    assertEquals(false, isNetworkOk);
	}

	@When("employees try to log in")
	public void employees_try_to_log_in() {
	    // Write code here that turns the phrase above into concrete actions
	    isEmployeeLogIn = true;
	    assertEquals(true, isEmployeeLogIn);
	}

	@Then("the network must reject them")
	public void the_network_must_reject_them() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("FAILED", isNetworkOk && isEmployeeLogIn ? "SUCCESS" : "FAILED");
	}
}
