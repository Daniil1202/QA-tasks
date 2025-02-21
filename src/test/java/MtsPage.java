import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MtsPage {
    private WebDriver driver;

    private By onlineRechargeBlock = By.xpath("//h2[contains(text(), 'Онлайн пополнение без комиссии')]");
    private By paymentSystemLogos = By.cssSelector(".payment-system-logos img");
    private By moreInfoLink = By.linkText("Подробнее о сервисе");

    // локаторы для формы пополнения
    private By phoneField = By.id("phone");
    private By amountField = By.id("amount");
    private By emailField = By.id("email");
    private By continueButton = By.id("continue");

    public MtsPage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean isOnlineBlockDisplayed(){
        return driver.findElement(onlineRechargeBlock).isDisplayed();
    }
    public boolean isPaymentSystemLogosDisplayed(){
        return !driver.findElements(paymentSystemLogos).isEmpty();
    }
    public void clickMoreInfoLink(){
        driver.findElement(moreInfoLink).click();
    }
    public void fillRechargeForm(String phone, String amount, String email) {
        driver.findElement(phoneField).sendKeys(phone);
        driver.findElement(amountField).sendKeys(amount);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(continueButton).click();
    }

    // Метод для проверки успешного перехода на следующую страницу
    public boolean isNextPageDisplayed(){
        return !driver.getTitle().contains("Ошибка");
    }
}


















