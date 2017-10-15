package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import services.Weather;

import java.io.IOException;

/**
 * Created by clovisolivier on 31/01/17.
 */
public class WeatherSteps {

    public Weather requester = new Weather();
    
    @Given("^I want to set \"(.*?)\" in param \"(.*?)\"$")
    public void i_want_to_set_in_param(String arg1, String arg2) throws Throwable {
        requester.AddValueInParam(arg1, arg2);
    }

    @When("^I call the weather WS$")
    public void i_call_the_example_WS() throws IOException {
    		requester.callGetWS();
    }

    @Then("^status code should be (\\d+)$")
    public void status_code_should_be(int arg1) {
    		requester.assertStatusCode(arg1);
    }

    @Given("date_from is (.+)$")
    public void dateFromIs(String date_from){
        requester.AddParamDateFrom(date_from);
    }

    @Given("date_to is (.+)$")
    public void dateToIs(String date_to){
        requester.AddParamDateTo(date_to);
    }

    @When("call the weather service$")
    public void callTheStatsService() throws IOException{
        requester.callGetWS();
    }

    @Then("^the server should handle it and return a (\\d+) status$")
    public void the_server_should_handle_it_and_return_a_status(int status_code) throws Throwable {
        requester.assertStatusCode(status_code);
    }
}
