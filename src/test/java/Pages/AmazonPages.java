package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import util.Hooks;

public class AmazonPages {

    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;



    static By accept = By.id("sp-cc-accept");

    static By search = By.xpath("//input[@id='twotabsearchtextbox']");

    static By searchButton = By.id("nav-search-submit-button");

    static By amazonFilter = By.cssSelector("span[class='s-navigation-icon-text aok-relative'] span[class='a-size-base a-color-base']") ;

    static By firstproduct = By.cssSelector("h2[aria-label='Apple AirPods Pro 2 Kablosuz Kulaklık, Bluetooth Kulaklık, Aktif Gürültü Engelleme, İşitme Cihazı Özelliği, Şeffaf Mod, Kişiselleştirilmiş Uzamsal Ses, Yüksek Ses Kalitesi, H2 Çip, USB-C Şarj'] span") ;

    static By addcart = By.cssSelector("#add-to-cart-button");

    static By cart = By.cssSelector("div[id='nav-cart-text-container'] span[class='nav-line-1']");

    static By check =By.cssSelector("span[class='a-truncate sc-grid-item-product-title a-size-base-plus'] span[class='a-truncate-cut']");

    public  AmazonPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        elementHelper = new ElementHelper(driver);
    }

    public static void onHomePage() {}

    public static void accCookies() {

        elementHelper.click(accept);
    }
    public static void clickSearchArea() {

        elementHelper.click(search);
    }
    public static void writeProduct() {

        elementHelper.findElement(search).sendKeys("airpods");
    }
    public static void clickSearchButton() {

        elementHelper.click(searchButton);
    }
    public static void filterAmazon() {

        elementHelper.click(amazonFilter);
    }
    public static void clickFirstProduct() {

        elementHelper.click(firstproduct);
    }
    public static void addProduct() {
        elementHelper.click(addcart) ;
        elementHelper.click(cart) ;
    }
    public static void checkPage() {
        elementHelper.checVisible(check); ;

    }


}
