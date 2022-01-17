package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;

import java.util.Collections;

public class LookSchedule extends BaseStepDef {
    TestContext testContext;

    public LookSchedule(TestContext context){
        super(context);
        testContext = context;
    }
    @Given("Go to login page {string} And Enter User{string} Password{string} Click button Login")
    public void goToLoginPageAndEnterUserPasswordClickButtonLogin(String url, String User, String Password) {
        driver.get(url);
        driver.findElement(By.xpath("//input[@id='User']")).sendKeys(User);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
        driver.findElement(By.xpath("//a[@id='Lnew1']")).click();
    }

    @When("User Click On TKB")
    public void userClickOnTKB() {
        driver.findElement(By.xpath("//a[@aria-expanded='false']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Thời khóa biểu')]")).click();

    }

    @Then("TKB appear")
    public void tkbAppear() {
        String SomeThing = driver.findElement(By.xpath("//h4[contains(text(),'Thời khóa biểu hiện tại')]")).getText();
        Assert.assertEquals(SomeThing, "Thời khóa biểu hiện tại", "Sai mẹ rồi");
    }
}
