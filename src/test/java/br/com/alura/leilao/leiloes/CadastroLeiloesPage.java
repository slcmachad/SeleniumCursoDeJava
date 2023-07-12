package br.com.alura.leilao.leiloes;

import org.openqa.selenium.WebDriver;

public class CadastroLeiloesPage {
	private WebDriver browser;
	
	public CadastroLeiloesPage(WebDriver browser) {
		this.browser = browser;
	}

	public void fechar() {

		this.browser.quit();
	}

}
