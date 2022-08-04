package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactoError extends BaseClass {

    public ContactoError (WebDriver driver) {
        super(driver);
    }

    //Centralizar los localizadores
    By locatorIncorrectoCont = By.xpath("//div[contains(text(),'Por favor, seleccione el asunto.')]");

    //Definir las acciones de la Página

   public String obtenerAsunto(){
        return obtenerTexto(esperaExplicita(locatorIncorrectoCont));
    }
}