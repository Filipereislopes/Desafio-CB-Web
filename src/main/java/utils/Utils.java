package utils;

import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
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

    public static void captureElementScreenshot(WebDriver driver, String screenshotName){
        try {
            esperaElemento(1000);
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String destination = System.getProperty("user.dir") +
                    "/screenshots/" +
                    screenshotName + "_" +
                    System.currentTimeMillis() +
                    ".png";

            FileUtils.copyFile(source, new File(destination));
            System.out.println("Screenshot da última tela salva em: " + destination);
        } catch (Exception e) {
            System.out.println("Erro ao capturar screenshot: " + e.getMessage());
        }
    }

}

