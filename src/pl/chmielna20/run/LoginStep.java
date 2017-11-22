package pl.chmielna20.run;

import cucumber.api.java8.En;
import pl.chmielna20.Main;
import pl.chmielna20.pages.LoginPage;

public class LoginStep implements En {

	LoginPage login;

	public LoginStep() {
		Then("Navigate to login page", () -> {
			login = new LoginPage(Main.driver);
			login.goToPage();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			login.typeEmail();
			login.typePassword();
		});
	}

}
