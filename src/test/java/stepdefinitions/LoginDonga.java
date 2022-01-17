package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

public class LoginDonga extends BaseStepDef {
    TestContext testContext;

    public LoginDonga(TestContext context){
        super(context);
        testContext = context;
    }
    @Given("Go to login page {string}")
    public void goToLoginPage(String url) {
        driver.get(url);
    }

    @When("Input User{string} and Password{string}")
    public void inputUserAndPassword(String User, String Password) {
        driver.findElement(By.xpath("//input[@id='User']")).sendKeys(User);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
    }

    @And("Click button Login")
    public void clickButtonLogin() {
        driver.findElement(By.xpath("//a[@id='Lnew1']")).click();
    }

    @Then("Go to dashboard")
    public void goToDashboard() {
        String title = driver.getTitle();
        Assert.assertEquals(title,"SINH VIÊN ĐẠI HỌC ĐÔNG Á","Check lại");

    }
}
