package day14;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;

public class C04_FileDownloadTest extends TestBase {
    /*
     "https://testcenter.techproeducation.com/index.php?page=file-download"   adresine gidin
     "b10 all test cases" dosyasını indirin
      Dosyanın başarıyla indirilip indirilmediğini test edin.
     */

    @Test
    public void fileDownload(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");
        driver.findElement(By.linkText("b10 all test cases, code.docx")).click();
        bekle(2);

        boolean isExist = Files.exists(Path.of(System.getProperty("user.home")+"/Downloads/b10 all test cases, code.docx"));
        Assert.assertTrue(isExist);
    }

}
