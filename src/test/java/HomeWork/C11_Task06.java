package HomeWork;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C11_Task06 extends TestBase {
        // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
        // ikinci emojiye tıklayın
        // tüm ikinci emoji öğelerini tıklayın
        // parent iframe e geri donun
        // formu doldurun,(Formu istediğiniz metinlerle doldurun)
        // apply button a basiniz

    @Test
    public void test01(){
        // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        // ikinci emojiye tıklayın
        WebElement iframe = driver.findElement(By.xpath("//*[@id='emoojis']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("(//*[@data-upgraded=',MaterialRipple'])[2]")).click();

        // tüm ikinci emoji öğelerini tıklayın
        List<WebElement> emojiler = driver.findElements(By.xpath("//*[@id='nature']//div"));
        for (WebElement w:emojiler){
            System.out.println(w.getText());
        }

        // parent iframe e geri donun
        driver.switchTo().defaultContent();

        // formu doldurun,(Formu istediğiniz metinlerle doldurun)
        List<String> veriler = new ArrayList<>(Arrays.asList(
                "Kemal","Sunal","selenium","lambda","java","sql","gitgithub","fsd","dfasf","lkjl","asdasd","asd","sda"));


        // apply button a basiniz

    }

}

