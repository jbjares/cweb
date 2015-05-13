package br.com.cweb.view.selenium.test.login;



import br.com.cweb.view.selenium.test.TestingSauce;

import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;

public class LogaComUsuarioSemSenha extends TestingSauce {
	
	public void testLogaComUsuarioSemSenha() throws Exception {
		selenium.open("/");
		selenium.waitForPageToLoad("60000");
		selenium.type("id=user_password", "");
		selenium.type("id=user_name", "master");
		selenium.type("id=user_password", "");
		selenium.click("name=Submit");
		selenium.waitForPageToLoad("60000");
		verifyTrue(selenium.isTextPresent("Usuário/Senha inválida!"));
	}
}
