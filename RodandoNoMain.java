package br.com.helenamatos.aceitacao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RodandoNoMain {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://github.com/helenabatiista/TestSELENIUM");
	}
	
}
