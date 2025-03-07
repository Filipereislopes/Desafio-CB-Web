package pageObject;

import org.openqa.selenium.By;
import utils.Utils;


public class TelaInicialPage {

    By botaoPerfilXpath= By.xpath("//cb-nav-bar/div/div[4]");
    By botaoEntrarXpath= By.xpath("(//div[@class='option-item clickable'])[1]");
    By campoEmailXpath= By.xpath("//input[@id='ion-input-2']");
    By campoSenhaXpath= By.xpath("//input[@id='ion-input-3']");
    By botaoEntrarLoginXpath= By.xpath("//button[contains(.,'ENTRAR')]");
    By botaoFecharMensagemXpath= By.xpath("//button[contains(.,'FECHAR')]");
    By campoCodigoVerificacao1Xpath= By.xpath("(//input)[1]");
    By campoCodigoVerificacao2Xpath= By.xpath("(//input)[2]");
    By campoCodigoVerificacao3Xpath= By.xpath("(//input)[3]");
    By campoCodigoVerificacao4Xpath= By.xpath("(//input)[4]");
    By campoCodigoVerificacao5Xpath= By.xpath("(//input)[5]");
    By campoCodigoVerificacao6Xpath= By.xpath("(//input)[6]");
    By botaoAcessarXpath= By.xpath("//button[contains(.,'ACESSAR')]");
    By botaoNaoAlterarLocalizacaoXpath= By.xpath("(//button[contains(.,'NÃO')])[2]");
    By botaoPratoXpath= By.xpath("(//item-card[contains(.,'Camarão Coco Brasil')])[1]");



    public void fazerLogin() throws InterruptedException {
        Utils.driver.findElement(botaoPerfilXpath).click();
        Utils.driver.findElement(botaoEntrarXpath).click();
        Utils.driver.findElement(campoEmailXpath).click();
        Utils.driver.findElement(campoEmailXpath).sendKeys("testefilipeqa@gmail.com");
        Utils.driver.findElement(campoSenhaXpath).click();
        Utils.driver.findElement(campoSenhaXpath).sendKeys("desafioCB#1");
        Utils.driver.findElement(botaoEntrarLoginXpath).click();
        Thread.sleep(3000);
        Utils.driver.findElement(botaoFecharMensagemXpath).click();
        Utils.driver.findElement(campoCodigoVerificacao1Xpath).sendKeys("A");
        Utils.driver.findElement(campoCodigoVerificacao2Xpath).sendKeys("A");
        Utils.driver.findElement(campoCodigoVerificacao3Xpath).sendKeys("A");
        Utils.driver.findElement(campoCodigoVerificacao4Xpath).sendKeys("A");
        Utils.driver.findElement(campoCodigoVerificacao5Xpath).sendKeys("A");
        Utils.driver.findElement(campoCodigoVerificacao6Xpath).sendKeys("A");
        Utils.driver.findElement(botaoAcessarXpath).click();
        Thread.sleep(3000);
        if (Utils.driver.findElement(botaoNaoAlterarLocalizacaoXpath).isDisplayed()){
            Utils.driver.findElement(botaoNaoAlterarLocalizacaoXpath).click();
        }
    }

    public void clicarBotaoPrato() {
        Utils.driver.findElement(botaoPratoXpath).click();
    }



}
