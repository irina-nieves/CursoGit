package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CambioClave extends BaseClass {
    public CambioClave(WebDriver driver) {
        super(driver);
    }

    //Centralizar los localizadores


    By locatortxtRutPago = By.xpath("//input[@id='rut']");
    By locatortxtSerie = By.xpath("//input[@id='serieNumber']");
    By locatorBtnContinuar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/form[1]/div[5]/div[1]/div[3]/button[1]");


    public void obtenerDatos(String rut, String serie) {

        agregarTexto(esperaExplicita(locatortxtRutPago), rut);
        agregarTexto(esperaExplicita(locatortxtSerie), serie);
        click(esperaExplicita(locatorBtnContinuar));
    }


}

