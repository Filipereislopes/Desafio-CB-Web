package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TelaInicialPage {

    @FindBy(xpath = "//cb-nav-bar/div/div[4]")
    WebElement botaoPerfil;

    @FindBy(xpath = "(//item-card)[1]")
    WebElement botaoPrato;


    public void fazerLogin() throws InterruptedException {
        Thread.sleep(1500);
        this.botaoPerfil.click();
    }

    public void clicarBotaoPrato(){
        //Thread.sleep(2000);
        this.botaoPrato.click();
    }



}
