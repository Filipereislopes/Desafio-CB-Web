package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Utils;

import java.awt.*;

import static org.junit.Assert.assertTrue;

public class TelaPedidoPage {

    TelaInicialPage ti = new TelaInicialPage();

    By campoObservacaoXpath= By.xpath("//textarea");
    By botaoAdicionarXpath= By.xpath("//button[@class='ng-star-inserted']");
    By textSacolaXpath= By.xpath("//span[contains(.,'Sacola')]");
    By botaoSelecionarTipoPagamentoXpath= By.xpath("//ion-button[@class='choose-payment-method-button md button button-clear ion-activatable ion-focusable hydrated']");
    By botaoNovoCartaoXpath= By.xpath("//button[@class='add-button ng-star-inserted']");
    By botaoCartaoCreditoXpath= By.xpath("//payment-authorizartion");


    public void clicarNovoCartao(){
        Utils.driver.findElement(botaoNovoCartaoXpath).click();
        Utils.driver.findElement(botaoCartaoCreditoXpath).click();
    }

    public void clicarBotaoTipoPagemento() throws InterruptedException {
        Thread.sleep(3000);
        new Actions(Utils.driver).moveToElement(Utils.driver.findElement(By.xpath("//div[@class='card info-purchase']"))).build().perform();
        Utils.driver.findElement(botaoSelecionarTipoPagamentoXpath).click();
    }

    public void sacolaComPrato(){
        assertTrue(Utils.driver.findElement(textSacolaXpath).isDisplayed());
    }

    public void clicarBotaoAdicionar(){
        Utils.driver.findElement(botaoAdicionarXpath).click();
    }

    public void escreverObservacao(String text) throws InterruptedException {
        Thread.sleep(1500);
        Utils.driver.findElement(campoObservacaoXpath).sendKeys(text);
    }

    public void pedidoCompleto() throws InterruptedException {
        ti.clicarBotaoPrato();
        Thread.sleep(1500);
        clicarBotaoAdicionar();
    }

}
