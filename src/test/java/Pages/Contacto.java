package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Contacto extends BaseClass {

    public Contacto (WebDriver driver) {
        super(driver);
    }
    //Centralizar los localizadores

    By locatortxtNombre = By.xpath("//input[@id='cf-name']");
    By locatortxtRutCont = By.xpath("//input[@id='cf-rut']");
    By locatortxtCel = By.xpath("//input[@id='cf-phone']");
    By locatortxtEmail = By.xpath("//input[@id='cf-email']");
    By locatortxtMsj = By.xpath("//textarea[@id='cf-message']");
    By locatorbtnEnviar = By.xpath ("//button[@id='submit-form-btn']");

    //Definir las acciones de la Página

    public void contactar (String nombre, String rut, String cel, String mail, String texto) {

        agregarTexto(esperaExplicita(locatortxtNombre), nombre);
        agregarTexto(esperaExplicita(locatortxtRutCont),rut);
        agregarTexto(esperaExplicita(locatortxtCel),cel);
        agregarTexto(esperaExplicita(locatortxtEmail),mail);
        agregarTexto(esperaExplicita(locatortxtMsj),texto);
        click(esperaExplicita(locatorbtnEnviar));
    }







}
