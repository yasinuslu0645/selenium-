package HomeWork;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class C08_Task04 extends TestBase {

    //Amazon sayfasına gidelim
    //Dropdown menuyu yazdıralım
    //Dropdown menuden sırasıyla ilk 5 başlığı (Arts&Crafts ile başlayıp Books'a kadar Books dahil) seçip
    //başlık altındakileri aratalım. Her aramada sayfa başlığını yazdıralım
    //Not: Select Class'ı kullanalım


    @Test
    public void test01() throws InterruptedException {
        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //Dropdown menuyu yazdıralım
        WebElement dropMenu = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select ddmenu = new Select(dropMenu);

            for (WebElement w : ddmenu.getOptions()){
                System.out.println(w.getText());
            }

        //Dropdown menuden sırasıyla ilk 5 başlığı (Arts&Crafts ile başlayıp Books'a kadar Books dahil) seçip
        //başlık altındakileri aratalım. Her aramada sayfa başlığını yazdıralım
        System.out.println("**************************************************************************");
        int sayac=1;
        for (WebElement w : ddmenu.getOptions()) {
            Select option = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
            option.selectByIndex(sayac);
            driver.findElement(By.xpath("//*[@type='submit']")).click();
            System.out.println(driver.getTitle());
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            sayac++;
            if (sayac>=6){
                break;
            }
        }
    }
}
