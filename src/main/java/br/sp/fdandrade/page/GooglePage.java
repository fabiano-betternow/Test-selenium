package br.sp.fdandrade.page;

import org.openqa.selenium.By;

import br.sp.fdandrade.common.BaseTest;

public class GooglePage extends BaseTest {

	public GooglePage consulta(String texto) {

		navegador.findElement(By.name("q")).sendKeys(texto);
		navegador.findElement(By.name("btnK")).click();

		return this;
	}

}
