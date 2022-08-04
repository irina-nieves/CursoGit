package Tests;

import Pages.*;
import Utils.DataDriven;
import Utils.PropertiesDriven;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.nio.file.Paths;
import java.util.ArrayList;

public class Tests {
    //Atributos

    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private ClaveInvalida claveInvalida;
    private String url;
    private Contacto contacto;
    private ContactoError contactoError;

    private BasesLegales basesLegales;

    private Socio socio;
    private FinalSocio finalSocio;
    private Pagos pagos;
    private CambioClave cambioClave;
    private SerieIncorrecta serieIncorrecta;

    private Conocer conocer;
    private ArrayList <String> dataCP;
    private String browser;
    private String propertyDriver;
    private String rutaDriver;


  //  private DescargaLegal descargaLegal;
    //Metodos

    @BeforeTest

    public void preparacion(){
        homePage = new HomePage(driver);
        browser = PropertiesDriven.getProperty("browser");
        propertyDriver = PropertiesDriven.getProperty("propertyDriver");
        rutaDriver = Paths.get(System.getProperty("user.dir"),PropertiesDriven.getProperty("rutaDriver")).toString();
        homePage.conexionDriver(browser,rutaDriver,propertyDriver);
        loginPage = new LoginPage(homePage.getDriver());
        claveInvalida = new ClaveInvalida(loginPage.getDriver());
        contacto  = new Contacto(loginPage.getDriver());
        contactoError  = new ContactoError(loginPage.getDriver());
        basesLegales  = new BasesLegales(loginPage.getDriver());
        socio  = new Socio (loginPage.getDriver());
        finalSocio = new FinalSocio(loginPage.getDriver());
        pagos = new Pagos(loginPage.getDriver());
        cambioClave = new CambioClave (loginPage.getDriver());
        serieIncorrecta = new SerieIncorrecta(loginPage.getDriver());
        conocer = new Conocer(loginPage.getDriver());
        dataCP = new ArrayList<>();

    }

    @BeforeMethod

    public void preTests(){
        //url = "https://www.coopeuch.cl/";
        url = PropertiesDriven.getProperty("url");
        homePage.cargarSitio(url);
        homePage.maximizarBrowser();
    }

    @Test
    public void CP0001_Login_Fallido(){
        dataCP = DataDriven.getData("CP0001_Login_Fallido");
        homePage.irAlogin();
        loginPage.esperarXSegundos(2000);
        loginPage.login(dataCP.get(1),dataCP.get(2));
        claveInvalida.esperarXSegundos(1000);

        Assert.assertEquals(claveInvalida.obtenerLogin(),dataCP.get(3));
    }
    @Test (enabled = false)
    public void CP002_Contactos (){
        dataCP = DataDriven.getData("CP002_Contactos");
        homePage.irAContact();
        contacto.esperarXSegundos(3000);
        contacto.contactar(dataCP.get(1), dataCP.get(2), dataCP.get(3), dataCP.get(4), dataCP.get(5));
        cambioClave.esperarXSegundos(5000);

        Assert.assertEquals(contactoError.obtenerAsunto(),dataCP.get(6));
    }

    @Test (enabled = false)
    public void CP003_Legales (){
        dataCP = DataDriven.getData("CP003_Legales");
        homePage.irAbase();
        basesLegales.esperarXSegundos(3000);
        basesLegales.Legales();

        Assert.assertEquals(basesLegales.obtenerUrlPagina(),dataCP.get(1));
    }
    @Test (enabled = false)
    public void CP004_Socios (){
        dataCP = DataDriven.getData("CP004_Socios");
        homePage.irSocio();
        finalSocio.esperarXSegundos(5000);
        finalSocio.SocioContacto1();
        socio.esperarXSegundos(3000);
        socio.SocioContacto(dataCP.get(1), dataCP.get(2), dataCP.get(3), dataCP.get(4), dataCP.get(5));


        Assert.assertEquals(socio.obtenerTituloPagina(),dataCP.get(6));

    }
    @Test (enabled = false)
    public void CP005_Pagos (){
        dataCP = DataDriven.getData("CP005_Pagos");
        homePage.IrPagos();
        pagos.esperarXSegundos(5000);
        pagos.PagoCuota(dataCP.get(1));

        Assert.assertEquals(socio.obtenerTituloPagina(),dataCP.get(2));

    }

    @Test (enabled = false)
    public void CP006_Beneficios (){
        dataCP = DataDriven.getData("CP006_Beneficios");
        homePage.IrBeneficio();
        Assert.assertEquals(homePage.obtenerUrlPagina(),dataCP.get(1));

    }
    @Test (enabled = false)
    public void CP007_Clave () {
        dataCP = DataDriven.getData("CP007_Clave");
        homePage.irAlogin();
        loginPage.esperarXSegundos(2000);
        loginPage.obtenerClaves();
        cambioClave.esperarXSegundos(1000);
        cambioClave.obtenerDatos(dataCP.get(1), dataCP.get(2));

        Assert.assertEquals(serieIncorrecta.obtenerMensajeSerie(),dataCP.get(3));

    }

    @Test (enabled = false)
    public void CP009_Mas () {
        dataCP = DataDriven.getData("CP009_Mas");
        homePage.irConoce();


        Assert.assertEquals(homePage.obtenerUrlPagina(),dataCP.get(1));

    }


    @Test (enabled = false)
    public void CP008_Seguridad () {
        dataCP = DataDriven.getData("CP008_Seguridad");
        homePage.IrSeguridad();


        Assert.assertEquals(homePage.obtenerUrlPagina(), dataCP.get(1));

    }



    @AfterMethod
    public void postTests() {
        claveInvalida.cerrarBrowser();
    }
}



