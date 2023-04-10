package br.com.helenamatos.aceitacao;

import javax.tools.Diagnostic;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ComGoogleChrome {
	
	WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "/home/helena/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void deveAbrirChromeEProcurarPorEfraimGentilNoGoogle (){
		driver.get("http://www.google.com.br");
		WebElement busca = driver.findElement( By.id("gbqfq") );
		busca.sendKeys("Helenamatos");
		busca.sendKeys( Keys.RETURN );
	}
	
}
