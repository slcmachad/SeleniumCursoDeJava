package br.com.alura.leilao.leiloes;

import org.openqa.selenium.WebDriver;

public class CadastroLeiloesPage {
	private static final String URL_CADASTRO_LEILOES = "http://localhost:8080/leiloes/new";
	private WebDriver browser;
	
	public CadastroLeiloesPage(WebDriver browser) {
		this.browser = browser;
	}

	public void fechar() {

		this.browser.quit();
	}

	public void carregarFormulario() {
		this.browser.navigate().to(URL_CADASTRO_LEILOES);
		return new CadastroLeilaoPage(browser);
	}
}
