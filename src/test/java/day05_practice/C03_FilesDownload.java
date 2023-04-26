package day05_practice;

import org.junit.Test;
import utilities.TestBase;

public class C03_FilesDownload extends TestBase {
    // 'https://the-internet.herokuapp.com/download' adresine gidiniz
    // some-file.txt dosyasini indirelim
    // dosyanin bilgisayarınızda Downloads(indirilenler)'a basariyla indirilip indirilmedigini test ediniz

    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/download");


    }

}
