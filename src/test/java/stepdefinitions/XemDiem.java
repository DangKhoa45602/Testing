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

public class XemDiem extends BaseStepDef {
    TestContext testContext;

    public XemDiem(TestContext context){
        super(context);
        testContext = context;
    }
    @When("User Click On KQHT")
    public void userClickOnKQHT() {
        driver.findElement(By.xpath("//a[normalize-space()='Góc sinh viên']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Kết quả học tập')]")).click();
    }

    @Then("KQHT appear")
    public void kqhtAppear() {

        boolean BangDiem = driver.findElement(By.xpath("//div[@class='well']")).isDisplayed();
        Assert.assertTrue(true, "Sai roi condi");

    }
}
