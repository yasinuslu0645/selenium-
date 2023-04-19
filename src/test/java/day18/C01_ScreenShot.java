package day18;

import org.junit.Test;
import utilities.TestBase;

public class C01_ScreenShot extends TestBase {
    @Test
    public void screenShotTest(){
        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");


        //Sayfanın resmini alalım
        tamSayfaScreenShot();

        //Sonra amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //Amazon sayfasının ekran görüntüsünü alalım
        tamSayfaScreenShot();
    }
}
