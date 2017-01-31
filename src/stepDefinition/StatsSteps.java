import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

/**
 * Created by clovisolivier on 31/01/17.
 */
public class StatsSteps {

    public Stats requester = new Stats();

    @Given("account_id number (.+)$")
    public void accountIdNumber(String account_id){
        requester.AddParamAccountId(account_id);
    }

    @Given("date_from is (.+)$")
    public void dateFromIs(String date_from){
        requester.AddParamDateFrom(date_from);
    }

    @Given("date_to is (.+)$")
    public void dateToIs(String date_to){
        requester.AddParamDateTo(date_to);
    }

    @When("call the stats service$")
    public void callTheStatsService() throws IOException{
        requester.callGetWS();
    }

    @Then("^the server should handle it and return a (\\d+) status$")
    public void the_server_should_handle_it_and_return_a_status(int status_code) throws Throwable {
        requester.assertStatusCode(status_code);
    }
}
