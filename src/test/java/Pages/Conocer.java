package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Conocer extends BaseClass {
    public Conocer (WebDriver driver) {
        super(driver);
    }
    By locatorTituloCoo = By.xpath("//span[contains(text(),'Personas')]") ;

    public String obtenerLink(){
        return obtenerTexto(esperaExplicita(locatorTituloCoo));
    }
}
