package utils;


import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Utils {

    public static WebDriver driver;

    public static void acessarSistema() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\driver\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://app-hom.cocobambu.com/delivery");
    }

    public static void esperaElemento(int tempo) throws InterruptedException {
        Thread.sleep(tempo);
    }

}

