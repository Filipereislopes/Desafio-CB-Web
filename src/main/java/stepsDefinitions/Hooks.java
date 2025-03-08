package stepsDefinitions;

import static utils.Utils.*;
import static utils.Utils.driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Utils;

public class Hooks {

        @Before()
        public void EntrarNoSiyte() {
            acessarSistema();
        }

        @After
        public void tearDown() {
            driver.quit();
        }

}
