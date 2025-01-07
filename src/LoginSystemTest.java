//Purpose:
//This is a JUnit test class for testing the StubLoginSystem class.
// It contains test cases to validate the behavior of the login method under different scenarios
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginSystemTest
{
    //declares a field that will reference an object of type StubLoginSystem.
    private StubLoginSystem stubLoginSystem;
    private String correct_email = "Ofir.rodity@gmail.com";
    private String correct_pass = "123456";

    //The @Before annotation ensures this method runs before every test method.
    @org.junit.Before
    public void setUp()
    {
        stubLoginSystem = new StubLoginSystem(correct_email,correct_pass); // Initialize stub before each test
    }

    //Test number 1:
//    @Test
//    public void testSuccessfulLogin() {
//        boolean isLoggedIn = stubLoginSystem.login(correct_email, correct_pass);
//        assertTrue("Login should succeed with valid credentials.", isLoggedIn);
//    }


    @Test
    public void testLoginFailure_InvalidEmail() {
        boolean isLoggedIn = stubLoginSystem.login("correct_email", correct_pass);
        System.out.println(isLoggedIn);
        assertFalse("Login should fail with an invalid email format.", isLoggedIn);
    }

    @Test
    public void testLoginFailure_IncorrectPassword() {
        boolean isLoggedIn = stubLoginSystem.login(correct_email, "wrongpass");
        //assertFalse expects the value of isLoggedIn to be false for the test to pass.
        assertFalse("Login should fail with an incorrect password.", isLoggedIn);
    }

    @Test
    public void testLoginFailure_EmptyFields() {
        boolean isLoggedIn = stubLoginSystem.login("", "");
        assertFalse("Login should fail with empty email and password fields.", isLoggedIn);
    }
}
