### JUnit and StubLoginSystem - Key Concepts

#### 1. JUnit Testing Framework
- JUnit is a Java library used to write and run tests for individual methods (unit tests).
- It ensures code quality by validating the behavior of methods with various inputs.
- Key Annotations:
  - `@Test`: Marks a method as a test case.
  - `@Before`: A method annotated with `@Before` runs before each test to set up the testing environment.

#### 2. StubLoginSystem Class
- A stub is a simplified class used to simulate real functionality for testing purposes.
- The `StubLoginSystem` class:
  - Simulates a login system with hardcoded valid credentials.
  - Validates input email and password using `if` statements.
  - Ensures specific scenarios can be tested without relying on external systems (e.g., databases).

#### 3. JUnit Test Class
- Test classes validate the functionality of methods using test cases.
- Example:
  ```java
  @org.junit.Before
  public void setUp() {
      stubLoginSystem = new StubLoginSystem("ofir.rodity@gmail.com", "123456"); // Initializes the stub before each test
  }

  @Test
  public void testSuccessfulLogin() {
      boolean isLoggedIn = stubLoginSystem.login("ofir.rodity@gmail.com", "123456");
      assertTrue(isLoggedIn);
  }
