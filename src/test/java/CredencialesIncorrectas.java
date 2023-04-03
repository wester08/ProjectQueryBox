import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CredencialesIncorrectas extends Localizadores{
    private WebDriver driver;

    @BeforeClass
    public void beforeClass() throws Exception {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\wester.feliz\\Downloads\\Proyectos 02-11-2022\\QueryBox\\src\\test\\resources\\driver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("http://10.1.0.7:9402/");

    }
    @AfterClass
    public void afterClass() {
        driver.quit();

    }

    @Test
    public void Login() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(EncabezadoPagina).isDisplayed();
        driver.findElement(CampoUsuario).sendKeys("401399");
        driver.findElement(CampoContrasena).sendKeys("401399--");
        driver.findElement(BtnIngresar).click();
        Thread.sleep(1000);
        driver.findElement(MjsCredencialesIncorrectas).isDisplayed();


    }


}