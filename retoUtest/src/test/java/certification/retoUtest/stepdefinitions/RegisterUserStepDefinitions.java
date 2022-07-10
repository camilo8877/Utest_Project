package certification.retoUtest.stepdefinitions;

import certification.retoUtest.tasks.RegisterUserReto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterUserStepDefinitions {
    @Managed(driver= "chrome")
    WebDriver driver;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Cristian");

    }
    @Given("^user in the home page$")
    public void userInTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));
    }

    @When("^user create an account filling all fields$")
    public void userCreateAnAccountFillingAllFields() {
        theActorInTheSpotlight().attemptsTo(RegisterUserReto.makeInformation());

    }

    @Then("^user sees its username$")
    public void userSeesItsUsername() {

    }
}
