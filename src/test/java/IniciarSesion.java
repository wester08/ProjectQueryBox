import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ io.qameta.allure.testng.AllureTestNG.class })
public class IniciarSesion extends Localizadores {

    private WebDriver driver;

    @BeforeClass
    public void beforeClass() throws Exception {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\wester.feliz\\Downloads\\Proyectos 02-11-2022\\QueryBox\\src\\test\\resources\\driver\\msedgedriver.exe");        driver = new EdgeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("http://10.1.0.7:9402/");

    }
    @Test
    public void Login_user() throws InterruptedException {
    Thread.sleep(1000);
        driver.findElement(EncabezadoPagina).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(CampoUsuario).sendKeys("401399");
        driver.findElement(CampoContrasena).sendKeys("401399");
        driver.findElement(BtnIngresar).click();
        Thread.sleep(6000);
        driver.findElement(HomePage).isDisplayed();





    }
    @AfterClass
    public void afterClass(){
        driver.quit();

    }
}
