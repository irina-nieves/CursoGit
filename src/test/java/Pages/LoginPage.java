package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Centralizar los localizadores
    By locatorTxtRut = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]");
    By locatorTxtClave = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]");
    By locatorBtnIniciar = By.xpath("//button[contains(text(),'Ingresar')]");

    //Definir las acciones de la Página
    public void login(String user, String pass) {
        agregarTexto(esperaExplicita(locatorTxtRut), user);
        agregarTexto(esperaExplicita(locatorTxtClave),pass);
        click(esperaExplicita(locatorBtnIniciar));

    }

    By locatortextClave = By.xpath("//a[contains(text(),'¿Necesitas crear o recuperar tu clave?')]");
    public void obtenerClaves() {
        click(esperaExplicita(locatortextClave));
    }
}
