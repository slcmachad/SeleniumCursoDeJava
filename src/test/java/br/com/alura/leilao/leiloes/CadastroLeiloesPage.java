package br.com.alura.leilao.leiloes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroLeiloesPage {
	private WebDriver browser;
	private static final String URL_CADASTRO_LEILOES = "http://localhost:8080/leiloes/new";
	
	public CadastroLeiloesPage(WebDriver browser) {
		this.browser = browser;
	}

	public void fechar() {

		this.browser.quit();
	}

	public LeiloesPage cadastrarLeilao(String nome, String valorInicial, String dataAbertura) {
		this.browser.findElement(By.id("nome")).sendKeys(nome);		
		this.browser.findElement(By.id("valorInicial")).sendKeys(valorInicial);		
		this.browser.findElement(By.id("dataAbertura")).sendKeys(dataAbertura);		
		this.browser.findElement(By.id("button-submit")).submit();
		
		return new LeiloesPage(browser);
	}

	public boolean isPaginaAtual() {
		return browser.getCurrentUrl().equals(URL_CADASTRO_LEILOES);
	}

}
