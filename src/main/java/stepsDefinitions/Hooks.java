package stepsDefinitions;

import static utils.Utils.*;
import static utils.Utils.driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

        @Before()
        public void EntrarNoSite() {
            acessarSistema();
        }

        @After
        public void finalizarTeste() throws InterruptedException {
            captureElementScreenshot(driver,"PrintTela");
            driver.quit();
        }

}
