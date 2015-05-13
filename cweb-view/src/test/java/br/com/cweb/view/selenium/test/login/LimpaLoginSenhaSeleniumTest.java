package br.com.cweb.view.selenium.test.login;



import br.com.cweb.view.selenium.test.TestingSauce;

import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;

public class LimpaLoginSenhaSeleniumTest extends TestingSauce {

	public void testLimpaLoginSenhaSelenium() throws Exception {
		selenium.open("/");
		selenium.waitForPageToLoad("60000");
		selenium.type("id=user_name", "huiuhiuh");
		selenium.type("id=user_password", "uohuohuhuo");
		selenium.click("name=limpa");
		verifyEquals("", selenium.getValue("id=user_name"));
		verifyEquals("", selenium.getValue("id=user_password"));
		verifyTrue(selenium.isTextPresent(""));
	}
}
