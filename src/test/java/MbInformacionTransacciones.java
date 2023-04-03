import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MbInformacionTransacciones extends Localizadores {

    private WebDriver driver;

    @BeforeClass
    public void beforeClass() throws Exception {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\wester.feliz\\Downloads\\Proyectos 02-11-2022\\QueryBox\\src\\test\\resources\\driver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("http://10.1.0.7:9402/");

    }

    @Test
    public void InfoRep() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(EncabezadoPagina).isDisplayed();
        driver.findElement(CampoUsuario).sendKeys("401399");
        driver.findElement(CampoContrasena).sendKeys("401399");
        driver.findElement(BtnIngresar).click();
        Thread.sleep(3000);
        driver.findElement(HomePage).isDisplayed();
        driver.findElement(SeleccioneSistema).click();
        driver.findElement(SistemaMovilBussines).click();
        Thread.sleep(1000);
        driver.findElement(InformacionTransacciones).click();
        Thread.sleep(1000);
        driver.findElement(RepCodigoinfoRepre).sendKeys("401384");
        Thread.sleep(2000);
        driver.findElement(Secuencia).sendKeys("15");
        driver.findElement(BtnEnviar).click();
        Thread.sleep(2000);
        driver.findElement(NumSecuencia).isDisplayed();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();

    }
}