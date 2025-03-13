package pageObject;

import org.openqa.selenium.By;
import utils.Utils;

public class TelaInicialPage {


    By botaoPratoXpath= By.xpath("(//item-card[contains(.,'Carbonara Coco Bambu')])[1]");

    public void clicarBotaoPrato() {
        Utils.esperaElementoSerVisivel(botaoPratoXpath).click();
    }

}
