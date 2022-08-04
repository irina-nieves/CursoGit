package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinalSocio extends BaseClass {

    public FinalSocio(WebDriver driver) {
        super(driver);
    }

    //Centralizar los localizadores

    By locatorbtnSoloSocio = By.xpath("/html[1]/body[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/a[1]/button[1]");

    public void SocioContacto1() {
        click(esperaExplicita(locatorbtnSoloSocio));
    }
}