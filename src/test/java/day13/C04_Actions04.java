package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C04_Actions04 extends TestBase {
            /*
        https://jqueryui.com/droppable/ adresine gidin
        "Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
        */
    @Test
    public void action04(){
//        https://jqueryui.com/droppable/ adresine gidin
        driver.get("https://jqueryui.com/droppable");

//        "Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
//        Sayfada iFrame olduğu için "switch" yapıyoruz.
        driver.switchTo().frame(0);

//        kaynak ve hedef web elementlerini locate ediyoruz:
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        new Actions(driver).dragAndDrop(source,target).perform();//dragAndDrop() methodu kaynak elemanı hedef eleman üzerine bırakır.

    }
            //2. YOL
    @Test
    public void action04_2(){
//        https://jqueryui.com/droppable/ adresine gidin
        driver.get("https://jqueryui.com/droppable");

//        "Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
//        Sayfada iFrame olduğu için "switch" yapıyoruz.
        driver.switchTo().frame(0);

//        kaynak ve hedef web elementlerini locate ediyoruz:
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        bekle(2);

        new Actions(driver).
                clickAndHold(source). //clickAndHold web elementi tıklar ve tutar
                moveToElement(target). //moveToElement mouse'u bir element üzerine taşır
                release(). //release methodu tiklanip tutulan mouse'u bırakır.
                perform();
        //Burada dragAndDrop'tan farklı olarak işlemleri kendimiz sırayla belirttik.

    }
}
