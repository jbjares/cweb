package br.com.cweb.view.selenium.test;

import junit.framework.Test;
import br.com.cweb.view.selenium.test.login.LimpaLoginSenhaSeleniumTest;
import br.com.cweb.view.selenium.test.login.LogaComMatrizSucessoSeleniumTest;
import br.com.cweb.view.selenium.test.login.LogaComSenhaSemLogin;
import br.com.cweb.view.selenium.test.login.LogaComUsuarioSemSenha;
import br.com.cweb.view.selenium.test.login.LoginSenhaInvalidosSeleniumTest;

public class TestSuite extends junit.framework.TestSuite{

	
    public static Test suite() {
    	TestSuite suite = new TestSuite();
        suite.addTestSuite(LoginSenhaInvalidosSeleniumTest.class);
        suite.addTestSuite(LimpaLoginSenhaSeleniumTest.class);
        suite.addTestSuite(LogaComMatrizSucessoSeleniumTest.class);
        suite.addTestSuite(LogaComUsuarioSemSenha.class);
        suite.addTestSuite(LogaComSenhaSemLogin.class);
        return suite;
    }
}
