import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;

public class TvNetTest {
    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@mode = 'primary']");
    private final By HOME_PAGE_TITLE = By.xpath(".//span[contains(@class, 'headline')]");
    private final By TITLE_COMMENT_BTN = By.xpath(".//a[contains(@class, 'comments')]");
    private final By HOME_PAGE_COMMENTS = By.xpath(".//span[contains(@class, 'comment')]");
    private final By LOGO = By.xpath(".//a[contains(@class, 'header-logo')]");
    private final By RUS_LANGUAGE_SWITCHER = By.xpath("//div[contains(@class, 'menu-items--top')]//a[contains(.,'RUS')]");

    @Test
    public void TaskOneFirstTitleCommentPage() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tvnet.lv");

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        driver.findElement(ACCEPT_COOKIES_BTN).click();
//        driver.findElement(RUS_LANGUAGE_SWITCHER).click();

        List<WebElement> titles = driver.findElements(HOME_PAGE_TITLE);
//        List<WebElement> comments = driver.findElements(TITLE_COMMENT_BTN);

        for (int i = 0; i < 1; i = i + 1) {
            if (!titles.get(i).getText().isEmpty()) {
                driver.findElement(HOME_PAGE_TITLE).click();
                wait.until(ExpectedConditions.elementToBeClickable(TITLE_COMMENT_BTN));
                driver.findElement(TITLE_COMMENT_BTN).click();
            }
        }
    }

    @Test
    public void TaskTwoFirstTitlePrint() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tvnet.lv");

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        driver.findElement(ACCEPT_COOKIES_BTN).click();

        List<WebElement> titles = driver.findElements(HOME_PAGE_TITLE);

        for (int i = 0; i < 1; i = i + 1) {
            if (!titles.get(i).getText().isEmpty()) {
                System.out.println("-------------------------------");
                System.out.println("HW task #2 - Tvnet first title: ");
                System.out.println(titles.get(i).getText());
                System.out.println("-------------------------------");
            }
        }
    }

    @Test
    public void TaskThreeLocators() {
        System.out.println("---------------------");
        System.out.println("HW task 3 - LOCATORS:");
        System.out.println("3-1 / HOME_PAGE_TITLE : " + HOME_PAGE_TITLE);
        System.out.println("3-2 / HOME_PAGE_COMMENTS : " + HOME_PAGE_COMMENTS);
        System.out.println("3-3 / LOGO : " + LOGO);
        System.out.println("3-4 / RUS_LANGUAGE_SWITCHER : " + RUS_LANGUAGE_SWITCHER);
        System.out.println("---------------------");

    }

    @Test                     // not finished - comments appear
    public void TaskFourTitlesPrint() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tvnet.lv");

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        driver.findElement(ACCEPT_COOKIES_BTN).click();

        List<WebElement> titles = driver.findElements(HOME_PAGE_TITLE);

        System.out.println("---------------------------------------");
        System.out.println("HW task #4 - Tvnet list of all titles: ");

        for (int i = 0; i < titles.size(); i = i + 1) {
            if (!titles.get(i).getText().isEmpty()) {
                System.out.println(i + 1 + ". " + titles.get(i).getText());
            }
        }
    }

    @Test                // not finished
    public void TaskFiveTitlesPrintWithCommentsCount() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tvnet.lv");

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        driver.findElement(ACCEPT_COOKIES_BTN).click();

        List<WebElement> titles = driver.findElements(HOME_PAGE_TITLE);
        List<WebElement> comments = driver.findElements(HOME_PAGE_COMMENTS);

        System.out.println("------------------------------------------------------------");
        System.out.println("HW task #5 - Tvnet list of all titles with comments count: ");

//        for (WebElement we : comments) {
//            System.out.println(we.getText().isEmpty() ? "0" : we.getText());
//        }

        for (int i = 0; i < comments.size(); i = i + 1) {
            if (!comments.get(i).getText().isEmpty()) {
                System.out.println(i + 1 + ". " + comments.get(i).getText());

//                for (int j = 0; j < comments.size(); j = j + 1) {
//                    if (!comments.get(j).getText().isEmpty()) {
//
//                        System.out.println(i + 1 + ". " + titles.get(i).getText() + " | comments " + comments.get(i).getText());
//                    }
//                }
            }
        }
    }
}
