package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class C07_YoutubeAssertion {

        //https://www.youtube.com adresine gidin
        //Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin
        //Sayfa başlığının “YouTube” oldugunu test edin
        //YouTube resminin görüntülendiğini (isDisplayed()) test edin
        //Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        //wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin


    static WebDriver driver;

    @BeforeClass
    public static void beforeClass(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Before
    public void setUp(){

        driver.get("https://www.youtube.com");
    }
    @AfterClass
    public static void afterclass(){
        driver.close();
    }

    @Test
    public void test01(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "YouTube";
        boolean dogrumu = actualTitle.equals(expectedTitle);
        assertTrue(dogrumu);
    }
    @Test
    public void test02(){
        WebElement logo = driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        assertTrue(logo.isDisplayed());
    }

    @Test
    public void test03(){
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
        assertTrue(searchBox.isEnabled());
    }

    @Test
    public void test04(){
        String actualTitle = driver.getTitle();
        Assert.assertFalse(actualTitle.equals("youtube"));
    }







}
