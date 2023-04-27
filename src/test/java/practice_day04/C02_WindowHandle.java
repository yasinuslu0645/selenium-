package practice_day04;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C02_WindowHandle extends TestBase {
    // 1- https://www.amazon.com sayfasina gidelim
    // 2- url'in 'amazon' icerdigini test edelim
    // 3- yeni bir pencere acip https://www.bestbuy.com sayfasina gidelim
    // 4- title'in 'Best Buy' icerdigini test edelim
    // 5- ilk sayfaya(amazon) donup sayfada java aratalım
    // 6- arama sonuclarının 'Java' icerdigini test edelim
    // 7- ikinci sayfaya(bestbuy) donelim
    // 8- logonun gorundugunu test edelim

    @Test
    public void test01(){
        // 1- https://www.amazon.com sayfasina gidelim
        driver.get("https://www.amazon.com");
        String amazHand = driver.getWindowHandle();

        // 2- url'in 'amazon' icerdigini test edelim
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("amazon"));
        bekle(2);

        // 3- yeni bir pencere acip https://www.bestbuy.com sayfasina gidelim
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bestbuy.com");
        String bestbuyhash = driver.getWindowHandle();

        // 4- title'in 'Best Buy' icerdigini test edelim
        String bestbuy = driver.getTitle();
        Assert.assertTrue(bestbuy.contains("Best Buy"));

        // 5- ilk sayfaya(amazon) donup sayfada java aratalım
        driver.switchTo().window(amazHand);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("java"+ Keys.ENTER);


        // 6- arama sonuclarının 'Java' icerdigini test edelim
        WebElement arSo = driver.findElement(By.cssSelector("span[class='a-color-state a-text-bold']"));
        Assert.assertTrue(arSo.getText().contains("java"));

        // 7- ikinci sayfaya(bestbuy) donelim
        driver.switchTo().window(bestbuyhash);

        // 8- logonun gorundugunu test edelim
        WebElement logo = driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
        Assert.assertTrue(logo.isDisplayed());
    }

}
