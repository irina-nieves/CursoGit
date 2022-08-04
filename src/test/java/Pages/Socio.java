package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Socio extends BaseClass {

    public Socio (WebDriver driver){
        super(driver);
    }
    //Centralizar los localizadores

     By locatortxtNombre = By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]");
    By locatortxtApellido1 = By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/input[1]");
    By locatortxtRutCont1 = By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]");
    By locatortxtCel1 = By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/input[2]");
    By locatortxtEmail1 = By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[5]/input[1]");
    By locatorbtnEnviar1 = By.xpath ("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]");

    //Definir las acciones de la Página

    public void SocioContacto (String nombre, String apellido, String rut, String cel, String mail ) {

        agregarTexto(esperaExplicita(locatortxtNombre), nombre);
        agregarTexto(esperaExplicita(locatortxtApellido1), apellido);
        agregarTexto(esperaExplicita(locatortxtRutCont1),rut);
        agregarTexto(esperaExplicita(locatortxtCel1),cel);
        agregarTexto(esperaExplicita(locatortxtEmail1),mail);
        click(esperaExplicita(locatorbtnEnviar1));
    }


}
