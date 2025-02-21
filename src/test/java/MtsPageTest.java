import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MtsPageTest {
    private WebDriver driver;
    private MtsPage mtsPage;

    @BeforeClass
    public void setup() {
        //путь к драйверу
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://mts.by");
        mtsPage = new MtsPage(driver);
    }

    @Test
    public void testOnlineRechargeBlock() {
        Assert.assertTrue(mtsPage.isPaymentSystemLogosDisplayed(), "Блок 'Онлайн пополнение без комиссии' не отображается");

    }

    @Test
    public void testPaymentSystemLogos() {
        Assert.assertTrue(mtsPage.isPaymentSystemLogosDisplayed(), "Логотипы платёжных систем не отображаются");
    }

    @Test
    public void testMoreInfoLink() {
        mtsPage.clickMoreInfoLink();
        Assert.assertEquals(driver.getTitle(), "О сервисе - МТС");
    }

    @Test
    public void testFillFieldsAndContinue() {
        mtsPage.fillRechargeForm("297777777", "100", "test@mail.ru");
        Assert.assertTrue(mtsPage.isNextPageDisplayed(), "Не удалось перейти на следующую страницу после нажатия 'Продолжить'");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
