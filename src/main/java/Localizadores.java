import org.openqa.selenium.By;

public class Localizadores {
    By EncabezadoPagina = By.xpath("/html/body/app-root/nb-layout-column/app-auth/div/div/div/form/span");
    By CampoUsuario = By.name("userName");
    By CampoContrasena = By.name("password");
    By BtnIngresar = By.xpath("/html/body/app-root/nb-layout-column/app-auth/div/div/div/form/div[3]/button");
    By HomePage = By.xpath("/html/body/app-root/nb-layout-column/app-home/nb-layout/div/div/nb-layout-header/nav/div/div/img");
    By MjsCredencialesIncorrectas = By.xpath("/html/body/app-root/nb-layout-column/app-auth/div/div/div/form/span[2]");
}
