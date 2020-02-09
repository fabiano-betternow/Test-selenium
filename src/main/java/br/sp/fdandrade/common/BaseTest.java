package br.sp.fdandrade.common;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

	public WebDriver navegador;
	public WebDriverWait wait;
	public int timeout = 60;

	@Before
	public void pesquisa() {
		navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		wait = new WebDriverWait(navegador, timeout);

		navegador.get("https://www.google.com.br/");
		Assert.assertEquals("Google", navegador.getTitle());
	}

	@After
	public void finaliza() {
		navegador.quit();
	}
}
