package br.sp.fdandrade.test;

import org.junit.Test;

import br.sp.fdandrade.page.GooglePage;

public class GoogleTest extends GooglePage {

	@Test
	public void devePesquisarFilmePorTituloNoGoogle() {

		consulta("jumanji próxima fase");

		navegador.getPageSource().contains("Aproximadamente 2.300.000 resultados");

	}

	@Test
	public void devePesquisaFilmePorDiretorNoGoogle() {

		consulta("Jake Kasdan");

		navegador.getPageSource().contains("Aproximadamente 2.940.000 resultados");

	}

}
