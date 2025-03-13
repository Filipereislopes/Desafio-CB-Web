package utils;

import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

    public static WebDriver driver;
    private static WebDriverWait wait;

    public static void acessarSistema() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\driver\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(Utils.driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://app-hom.cocobambu.com/delivery");
    }

    public static WebElement esperaElementoSerClicavel(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static WebElement esperaElementoSerVisivel(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void esperarPaginaCarregar() {
        ExpectedCondition<Boolean> pageLoadCondition = driver ->
                ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
        wait.until(pageLoadCondition);
    }

    public static WebElement esperaElementoLoop(By locator, int maxAttempts) {
        int attempts = 0;
        WebElement element = null;

        while (attempts < maxAttempts) {
            try {
                element = wait.until(ExpectedConditions.elementToBeClickable(locator));
                return element;
            } catch (TimeoutException e) {
                attempts++;
                System.out.println("Tentativa " + attempts + " falhou para " + locator + ". Tentando novamente...");
                if (attempts == maxAttempts) {
                    System.err.println("Elemento " + locator + " não ficou clicável após " + maxAttempts + " tentativas.");
                    return null;
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return element;
    }


    public static void captureElementScreenshot(WebDriver driver, String screenshotName){
        try {
            Thread.sleep(1000);
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

