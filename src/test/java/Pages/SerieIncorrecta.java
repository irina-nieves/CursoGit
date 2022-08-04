package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SerieIncorrecta extends BaseClass {
    public SerieIncorrecta (WebDriver driver) {
        super(driver);
    }

    By locatorIncorrectoSerie = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]");

    public String obtenerMensajeSerie(){
        return obtenerTexto(esperaExplicita(locatorIncorrectoSerie));
    }
}
