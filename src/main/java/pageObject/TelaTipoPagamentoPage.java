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
        Utils.esperaElementoSerVisivel(tipoPagTicketXpath).click();
    }

    public void clicarPagNaEntrega(){
        Utils.esperaElementoSerVisivel(botaoPagNaEntregaXpath).click();

    }
    public void preencherNovoCartao(){
        Utils.esperaElementoSerVisivel(campoNumeroCartaoXpath).sendKeys("5566954754080284");
        Utils.esperaElementoSerVisivel(campoDataCartaoXpath).sendKeys("0826");
        Utils.esperaElementoSerVisivel(campoNumSegurancaCartaoXpath).sendKeys("962");
        Utils.esperaElementoSerVisivel(campoNomeImpressoCartaoXpath).sendKeys("Teste DesafioCB");
        Utils.esperaElementoSerVisivel(campoCPFCartaoXpath).sendKeys("60866539174");
    }

    public void clicarSalvarNovoCartao(){
        Utils.esperaElementoSerVisivel(botaoSalvarNovoCartaoXpath).click();
    }

    public void confirmacaoCartaoNovo(){
        assertTrue(Utils.esperaElementoSerVisivel(verificacaoCartaoXpath).isDisplayed());
    }

}
