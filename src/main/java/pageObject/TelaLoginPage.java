package pageObject;

import org.openqa.selenium.By;
import utils.Utils;

public class TelaLoginPage {

    By botaoPerfilXpath= By.xpath("//cb-nav-bar/div/div[4]");
    By botaoEntrarXpath= By.xpath("(//div[@class='option-item clickable'])[1]");
    By campoEmailXpath= By.xpath("//input[@id='ion-input-2']");
    By campoSenhaXpath= By.xpath("//input[@id='ion-input-3']");
    By botaoEntrarLoginXpath= By.xpath("//button[contains(.,'ENTRAR')]");
    By botaoFecharMensagemXpath= By.xpath("//button[contains(.,'FECHAR')]");
    By campoCodigoVerificacao1Xpath= By.xpath("//input[contains(@id,'otp_0')]");
    By campoCodigoVerificacao2Xpath= By.xpath("//input[contains(@id,'otp_1')]");
    By campoCodigoVerificacao3Xpath= By.xpath("//input[contains(@id,'otp_2')]");
    By campoCodigoVerificacao4Xpath= By.xpath("//input[contains(@id,'otp_3')]");
    By campoCodigoVerificacao5Xpath= By.xpath("//input[contains(@id,'otp_4')]");
    By campoCodigoVerificacao6Xpath= By.xpath("//input[contains(@id,'otp_5')]");
    By botaoAcessarXpath= By.xpath("//button[contains(.,'ACESSAR')]");
    By botaoNaoAlterarLocalizacaoXpath= By.xpath("(//button[contains(.,'NÃO')])[2]");

    public void fazerLogin(){
        Utils.esperaElementoSerVisivel(botaoPerfilXpath).click();
        Utils.esperaElementoSerVisivel(botaoEntrarXpath).click();
        Utils.esperaElementoSerVisivel(campoEmailXpath).sendKeys("testefilipeqa@gmail.com");
        Utils.esperaElementoSerVisivel(campoSenhaXpath).sendKeys("desafioCB#1");
        Utils.esperaElementoSerVisivel(botaoEntrarLoginXpath).click();
        Utils.esperaElementoLoop(botaoFecharMensagemXpath,2).click();
        Utils.esperaElementoSerVisivel(campoCodigoVerificacao1Xpath).sendKeys("A");
        Utils.esperaElementoSerVisivel(campoCodigoVerificacao2Xpath).sendKeys("A");
        Utils.esperaElementoSerVisivel(campoCodigoVerificacao3Xpath).sendKeys("A");
        Utils.esperaElementoSerVisivel(campoCodigoVerificacao4Xpath).sendKeys("A");
        Utils.esperaElementoSerVisivel(campoCodigoVerificacao5Xpath).sendKeys("A");
        Utils.esperaElementoSerVisivel(campoCodigoVerificacao6Xpath).sendKeys("A");
        Utils.esperaElementoSerVisivel(botaoAcessarXpath).click();
        if (Utils.esperaElementoSerClicavel(botaoNaoAlterarLocalizacaoXpath).isDisplayed()){
            Utils.esperaElementoLoop(botaoNaoAlterarLocalizacaoXpath,2).click();
        }
    }

}
