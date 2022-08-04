package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasesLegales extends BaseClass {

    public BasesLegales (WebDriver driver) {
        super(driver);
    }

    //Centralizar los localizadores

    By locatorbtnDescarga = By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]");

    //Definir las acciones de la Página

    public void Legales () {

        click(esperaExplicita(locatorbtnDescarga));
    }
}
