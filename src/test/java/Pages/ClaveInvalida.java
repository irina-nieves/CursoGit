package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaveInvalida extends BaseClass {
    public ClaveInvalida(WebDriver driver) {
        super(driver);
    }
    //Centralizar los localizadores
    By locatorIncorrectoLogin = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]");

    //Definir las acciones de la Página

    public String obtenerLogin(){
        return obtenerTexto(esperaExplicita(locatorIncorrectoLogin));
    }


}
