package br.com.cweb.view.selenium.test;

import org.junit.Before;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;


public class TestingSauce extends SeleneseTestCase {

    protected DefaultSelenium selenium;

    @Before
    public void setUp() throws Exception {
        DefaultSelenium selenium = new DefaultSelenium(
                "ondemand.saucelabs.com",
                80,
                "{\"username\": \"cwebteste\"," +
                "\"access-key\": \"38821261-6138-4dd4-9629-f2b1a1263947\"," +
                "\"os\": \"Windows 2003\"," +
                "\"browser\": \"firefox\"," +
                "\"browser-version\": \"7\"," +
                "\"name\": \"Testing with Selenium\"}",
                "http://cweb.cwebteste.cloudbees.net/");
        selenium.start();
        this.selenium = selenium;
    }
    

    public void tearDown() throws Exception {
        this.selenium.stop();
    }

	
}
