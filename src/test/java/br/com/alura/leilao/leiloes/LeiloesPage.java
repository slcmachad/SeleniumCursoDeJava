package br.com.alura.leilao.leiloes;

import org.openqa.selenium.WebDriver;

public class LeiloesPage {
	private static final String URL_LEILOES = "http://localhost:8080/leiloes";
	private WebDriver browser;
	
	public LeiloesPage(WebDriver browser) {
		this.browser = browser;
	}

	public void fechar() {

		this.browser.quit();
	}
}
