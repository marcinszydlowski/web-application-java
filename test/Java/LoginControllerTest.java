package Java;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;


//test login controller
public class LoginControllerTest {

    //create instance variable
    private WebDriver driver;

    @Before
    public void setUp() {
        // Create a new instance of the html unit driver
        driver = new HtmlUnitDriver();

        //Navigate to desired web page
        driver.get("http://localhost:3000");
    }

    @Test
    @DisplayName("should simulate login and verify if successful.")
    public void shouldSimulateLoginAndVerifyIfSuccessful() {
        //verify user credentials
        enterCredentials("admin", "admin");

        //verify title of welcome page
        verifyTitle("Welcome Page");
    }

    //method to simulate login process
    private void enterCredentials(String user, String pass) {
        //fetch username and password input boxes
        WebElement elementUser = driver.findElement(By.name("username"));
        WebElement elementPass = driver.findElement(By.name("password"));

        //write into the input boxes
        elementUser.sendKeys(user);
        elementPass.sendKeys(pass);

        //submit form
        elementPass.submit();
    }

    //method to ensure user has logged in
    private void verifyTitle(String expectedTitle) {
        //get the title of the page
        String actualTitle = driver.getTitle();

        // verify title
        assertThat(actualTitle, equalTo(expectedTitle));
    }
}