package br.com.cweb.view.selenium.test.login;


import br.com.cweb.view.selenium.test.TestingSauce;

import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;

public class LogaComMatrizSucessoSeleniumTest extends TestingSauce  {

	public void testLogaComMatrizSucessoSelenium() throws Exception {
		selenium.open("/");
		selenium.waitForPageToLoad("60000");
		selenium.type("id=user_name", "master");
		selenium.type("id=user_password", "cweb123");
		selenium.click("name=Submit");
		selenium.waitForPageToLoad("60000");
		verifyTrue(selenium.isTextPresent("CWEB"));
		selenium.click("xpath=//td[@class='ux-startbutton-center']//button[.='CWEB']");
	}
}
