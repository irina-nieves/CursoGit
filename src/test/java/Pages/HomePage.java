package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseClass {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    //Centralizar los localizadores
    By locatorBtnLogin = By.xpath("//header/div[2]/div[3]/div[2]/button[1]");
    By locatorBtnContact = By.xpath("//body/div[3]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[5]/span[1]/a[1]");
    By locatorBtnBases = By.xpath("//span[contains(text(),'Bases Concursos')]");
    By locatorBtnQuieroSocio = By.xpath("/html[1]/body[1]/div[3]/main[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[4]/div[2]/a[1]");
    By locatorbtnPago = By.xpath("//header/div[2]/div[3]/div[3]/a[1]");
    By locatorbtnBeneficio = By.xpath("//span[contains(text(),'Conoce todos los beneficios')]");
    By locatorbtnConoce = By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/a[1]");
    By locatorbtnPolitica = By.xpath("//a[contains(text(),'Ciberseguridad')]");

    public void irAlogin () {
        click(esperaExplicita(locatorBtnLogin));
    }

    public void irAContact () {
        click(esperaExplicita(locatorBtnContact));
    }
    public void irAbase () {
        click(esperaExplicita(locatorBtnBases));
    }

    public void irSocio () {
        click(esperaExplicita(locatorBtnQuieroSocio));
    }

    public void IrPagos () {
        click(esperaExplicita(locatorbtnPago));
    }

    public void IrBeneficio() {
        click(esperaExplicita(locatorbtnBeneficio));
    }

    public void irConoce() {
        click(esperaExplicita(locatorbtnConoce));
    }

    public void IrSeguridad() {
        click(esperaExplicita(locatorbtnPolitica));
    }


}
