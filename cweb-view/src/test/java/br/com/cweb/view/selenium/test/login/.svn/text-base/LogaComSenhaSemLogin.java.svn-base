package br.com.cweb.view.selenium.test.login;



import br.com.cweb.view.selenium.test.TestingSauce;

import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;

public class LogaComSenhaSemLogin extends TestingSauce {

	public void testLogaComSenhaSemLogin() throws Exception {
		selenium.open("/");
		selenium.waitForPageToLoad("60000");
		selenium.type("id=user_name", "");
		selenium.type("id=user_password", "iouhohioo");
		selenium.click("name=Submit");
		selenium.waitForPageToLoad("60000");
		verifyTrue(selenium.isTextPresent("Usuário/Senha inválida!"));
	}
}
