package pageObject;

import org.openqa.selenium.By;
import utils.Utils;
import static org.junit.Assert.assertTrue;

public class TelaPedidoPage {

    TelaInicialPage ti = new TelaInicialPage();

    By campoObservacaoXpath= By.xpath("//form/textarea");
    By botaoAdicionarXpath= By.xpath("//button[@class='ng-star-inserted']");
    By textSacolaXpath= By.xpath("//span[contains(.,'Sacola')]");
    By botaoNovoCartaoXpath= By.xpath("//button[@class='add-button ng-star-inserted']");
    By botaoCartaoCreditoXpath= By.xpath("//payment-authorizartion");
    By botaoConfirmarPedidoXpath= By.xpath("//button[@class='confirm-order-button']");
    By botaoConfirmarFazerPedidoXpath= By.xpath("//button/span[contains(.,'CONFIRMAR E FAZER PEDIDO')]");
    By pedidoRealizadoXpath= By.xpath("//span[@class='forecast-time']");

    public void confirmacaoPedidoRealizado(){
        assertTrue(Utils.esperaElementoSerVisivel(pedidoRealizadoXpath).isDisplayed());
    }

    public void clicarConfirmarfazerPedido() throws InterruptedException {
        Thread.sleep(1000);
        Utils.esperaElementoSerClicavel(botaoConfirmarFazerPedidoXpath).click();
    }

    public void  clicarConfirmarPedido(){
        Utils.esperarPaginaCarregar();
        Utils.esperaElementoLoop(botaoConfirmarPedidoXpath,3).click();
    }

    public void clicarNovoCartao(){
        Utils.esperaElementoSerVisivel(botaoNovoCartaoXpath).click();
        Utils.esperaElementoSerVisivel(botaoCartaoCreditoXpath).click();
    }

    public void clicarBotaoTipoPagemento(){
        Utils.esperaElementoSerVisivel(botaoConfirmarPedidoXpath).click();
    }

    public void sacolaComPrato(){
        assertTrue(Utils.esperaElementoSerVisivel(textSacolaXpath).isDisplayed());
    }

    public void clicarBotaoAdicionar(){
        Utils.esperaElementoSerClicavel(botaoAdicionarXpath).click();
    }

    public void escreverObservacao(String text){
        Utils.esperarPaginaCarregar();
        Utils.esperaElementoSerClicavel(campoObservacaoXpath).sendKeys(text);
    }

    public void pedidoCompleto(){
        Utils.esperarPaginaCarregar();
        ti.clicarBotaoPrato();
        clicarBotaoAdicionar();
    }

}
