package OOPS;

public class Common {

	// Abstraction using Interface
	interface BrowserActions {
		void openApplication(String url);

		void closeApplication();
	}

	// Encapsulation: Page Object class with private data and public methods
	static class LoginPage {
		private String username;
		private String password;

		public void setUsername(String username) {
			this.username = username;
		}

		public String getUsername() {
			return username;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPassword() {
			return password;
		}

		public void login() {
			System.out.println("Logging in with username: " + username);
			System.out.println("Logging in with password: " + password);
		}
	}

	// Inheritance: Base class for common setup/teardown
	static class BaseTest {
		void setUp() {
			System.out.println("Setting up the test environment.");
		}

		void tearDown() {
			System.out.println("Tearing down the test environment.");
		}
	}

	// Polymorphism: Parent class
	static class Page {
		void navigate() {
			System.out.println("Navigating to a page...");
		}
	}

	// Child class overriding the navigate method
	static class HomePage extends Page {
		@Override
		void navigate() {
			System.out.println("Navigating to the Home Page...");
		}

		// Method Overloading
		void search(String product) {
			System.out.println("Searching for product: " + product);
		}

		void search(String product, String category) {
			System.out.println("Searching for product: " + product + " in category: " + category);
		}
	}

	// Class that implements abstraction (interface)
	static class AppDriver implements BrowserActions {
		public void openApplication(String url) {
			System.out.println("Opening application at: " + url);
		}

		public void closeApplication() {
			System.out.println("Closing the application.");
		}
	}

	// Moved the main method here for execution
	public static void main(String[] args) {

		// Abstraction using Interface
		BrowserActions app = new AppDriver();
		app.openApplication("http://example.com");

		// Inheritance (Using BaseTest directly or creating a local subclass if needed)
		BaseTest test = new BaseTest();
		test.setUp();

		// Encapsulation
		LoginPage loginPage = new LoginPage();
		loginPage.setUsername("testuser");
		loginPage.setPassword("password123");
		loginPage.login();

		// Polymorphism: Overriding and Overloading
		HomePage homePage = new HomePage();
		homePage.navigate(); // Overridden method
		homePage.search("Laptop"); // Overloaded method
		homePage.search("Laptop", "Electronics"); // Overloaded method

		// Teardown
		test.tearDown();
		app.closeApplication();
	}
}