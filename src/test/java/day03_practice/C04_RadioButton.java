package day03_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C04_RadioButton {
    // https://demo.guru99.com/test/radio.html adresine gidin
    // radiobutton elementlerini locate edin
    // option2'yi secin
    // option2 elementlerinin secili oldugunu Test edin
    // option1 elementlerinin secili olmadıgını test edin
    // option3 elementlerinin secili olmadıgını test edin

    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void radioButton(){

        // https://demo.guru99.com/test/radio.html adresine gidin
        driver.get("https://demo.guru99.com/test/radio.html");

        // radiobutton elementlerini locate edin
        WebElement radio1 = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
        WebElement radio2 = driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
        WebElement radio3 = driver.findElement(By.xpath("//input[@id='vfb-7-3']"));

        // option2'yi secin
        radio2.click();

        // option2 elementlerinin secili oldugunu Test edin
        Assert.assertTrue(radio2.isSelected());

        // option1 elementlerinin secili olmadıgını test edin
        Assert.assertFalse(radio1.isSelected());

        // option3 elementlerinin secili olmadıgını test edin
        Assert.assertFalse(radio3.isSelected());

    }


}
