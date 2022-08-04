package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pagos extends BaseClass {
    public Pagos (WebDriver driver) {
        super(driver);
    }


    //Centralizar los localizadores

    By locatortxtRutPago = By.xpath("//input[@id='rut']");
    By locatorbtnIngre = By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]");

    //Definir las acciones de la Página

    public void PagoCuota (String rut) {

        agregarTexto(esperaExplicita(locatortxtRutPago), rut);
        click(esperaExplicita(locatorbtnIngre));
    }
}
