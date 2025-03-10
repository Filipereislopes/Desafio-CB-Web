package pageObject;

import org.openqa.selenium.By;
import utils.Utils;
import static org.junit.Assert.assertTrue;

public class TelaPedidoPage {

    TelaInicialPage ti = new TelaInicialPage();

    By campoObservacaoXpath= By.xpath("//textarea");
    By botaoAdicionarXpath= By.xpath("//button[@class='ng-star-inserted']");
    By textSacolaXpath= By.xpath("//span[contains(.,'Sacola')]");
    By botaoNovoCartaoXpath= By.xpath("//button[@class='add-button ng-star-inserted']");
    By botaoCartaoCreditoXpath= By.xpath("//payment-authorizartion");
    By botaoConfirmarPedidoXpath= By.xpath("//button[@class='confirm-order-button']");
    By botaoConfirmarFazerPedidoXpath= By.xpath("//button[@class='confirm-button ng-star-inserted']");
    By pedidoRealizadoXpath= By.xpath("//span[@class='forecast-time']");

    public void confirmacaoPedidoRealizado(){
        assertTrue(Utils.driver.findElement(pedidoRealizadoXpath).isDisplayed());
    }

    public void clicarConfirmarfazerPedido() throws InterruptedException {
        Utils.esperaElemento(1000);
        Utils.driver.findElement(botaoConfirmarFazerPedidoXpath).click();
    }

    public void  clicarConfirmarPedido() throws InterruptedException {
        Utils.esperaElemento(2500);
        Utils.driver.findElement(botaoConfirmarPedidoXpath).click();
    }

    public void clicarNovoCartao() throws InterruptedException {
        Utils.esperaElemento(1000);
        Utils.driver.findElement(botaoNovoCartaoXpath).click();
        Utils.driver.findElement(botaoCartaoCreditoXpath).click();
    }

    public void clicarBotaoTipoPagemento(){
        Utils.driver.findElement(botaoConfirmarPedidoXpath).click();
    }

    public void sacolaComPrato(){
        assertTrue(Utils.driver.findElement(textSacolaXpath).isDisplayed());
    }

    public void clicarBotaoAdicionar(){
        Utils.driver.findElement(botaoAdicionarXpath).click();
    }

    public void escreverObservacao(String text) throws InterruptedException {
        Utils.esperaElemento(1000);
        Utils.driver.findElement(campoObservacaoXpath).sendKeys(text);
    }

    public void pedidoCompleto() throws InterruptedException {
        ti.clicarBotaoPrato();
        Utils.esperaElemento(2000);
        clicarBotaoAdicionar();
    }

}
