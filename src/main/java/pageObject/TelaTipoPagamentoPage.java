package pageObject;

import org.openqa.selenium.By;
import utils.Utils;

import static org.junit.Assert.assertTrue;

public class TelaTipoPagamentoPage {

    By campoNumeroCartaoXpath= By.xpath("//input[@id='cardNumber']");
    By campoDataCartaoXpath= By.xpath("//input[@id='cc-exp-date']");
    By campoNumSegurancaCartaoXpath= By.xpath("//input[@id='cvv']");
    By campoNomeImpressoCartaoXpath= By.xpath("//input[@id='ion-input-4']");
    By campoCPFCartaoXpath= By.xpath("//input[@id='cpfCnpj']");
    By botaoSalvarNovoCartaoXpath= By.xpath("//button[contains(.,'SALVAR')]");
    By verificacaoCartaoXpath= By.xpath("//span[contains(.,'Padrão')]");
    By botaoPagNaEntregaXpath= By.xpath("//ion-segment-button[contains(.,'NA ENTREGA')]");
    By tipoPagTicketXpath= By.xpath("//payment-types-item[contains(.,'Ticket Refeição')]");

    public void clicarCartaoTicket(){
        Utils.driver.findElement(tipoPagTicketXpath).click();
    }

    public void clicarPagNaEntrega() throws InterruptedException {
        Utils.esperaElemento(1000);
        Utils.driver.findElement(botaoPagNaEntregaXpath).click();

    }
    public void preencherNovoCartao(){
        Utils.driver.findElement(campoNumeroCartaoXpath).sendKeys("5566954754080284");
        Utils.driver.findElement(campoDataCartaoXpath).sendKeys("0826");
        Utils.driver.findElement(campoNumSegurancaCartaoXpath).sendKeys("962");
        Utils.driver.findElement(campoNomeImpressoCartaoXpath).sendKeys("Teste DesafioCB");
        Utils.driver.findElement(campoCPFCartaoXpath).sendKeys("60866539174");
    }

    public void clicarSalvarNovoCartao(){
        Utils.driver.findElement(botaoSalvarNovoCartaoXpath).click();
    }

    public void confirmacaoCartaoNovo(){
        assertTrue(Utils.driver.findElement(verificacaoCartaoXpath).isDisplayed());
    }

}
