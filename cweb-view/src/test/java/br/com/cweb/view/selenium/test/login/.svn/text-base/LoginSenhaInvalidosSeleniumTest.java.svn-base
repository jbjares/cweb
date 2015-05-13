package br.com.cweb.view.selenium.test.login;

import br.com.cweb.view.selenium.test.TestingSauce;

import com.thoughtworks.selenium.*;

import java.util.regex.Pattern;

import junit.framework.Assert;

public class LoginSenhaInvalidosSeleniumTest extends TestingSauce {

	public void testLoginSenhaInvalidosSelenium() throws Exception {
		selenium.open("/");
		selenium.waitForPageToLoad("60000");
		selenium.click("id=header");
		selenium.type("id=user_name", "hjoiuhiuo");
		selenium.type("id=user_password", "iohjioio");
		selenium.click("name=Submit");
		verifyTrue(selenium.isTextPresent("Usuário/Senha inválida!"));
	}

}
