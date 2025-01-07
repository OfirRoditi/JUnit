//Purpose:
//This is a stub class designed to simulate the behavior of a login system for testing purposes.
// Instead of implementing a full authentication system (e.g., interacting with a database), it provides predefined behavior.
public class StubLoginSystem {
    /**
     * Simulates a login attempt by validating the provided email and password.
     *
     * @param email    The user's email address.
     * @param password The user's password.
     * @return true if the credentials are valid, false otherwise.
     */
    private final String validEmail;
    private final String validPassword;

    // Constructor to initialize custom credentials
    public StubLoginSystem(String validEmail, String validPassword)
    {
        this.validEmail = validEmail;
        this.validPassword = validPassword;
    }
    public boolean login(String email, String password)
    {
        // Check for empty email or password
        if (email == null || email.isEmpty() || password == null || password.isEmpty()) {
            return false; // Fail for missing fields
        }

        // Check for invalid email format
        if (!email.contains("@")) {
            return false; // Fail for invalid email format
        }

        // Check for valid credentials
        if (validEmail.equals(email) && validPassword.equals(password)) {
            return true; // Login succeeds for correct credentials
        }

        // Default case: credentials are incorrect
        return false;
    }
}

