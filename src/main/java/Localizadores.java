import org.openqa.selenium.By;

public class Localizadores {
    By EncabezadoPagina = By.xpath("/html/body/app-root/nb-layout-column/app-auth/div/div/div/form/span");
    By CampoUsuario = By.name("id");
    By CampoContrasena = By.name("password");
    By BtnIngresar = By.xpath("/html/body/app-root/nb-layout-column/app-auth/div/div/div/form/div[3]/button");
    By HomePage = By.xpath("/html/body/app-root/nb-layout-column/app-home/nb-layout/div/div/nb-layout-header/nav/div/div/img");
    By MjsCredencialesIncorrectas = By.xpath("/html/body/app-root/nb-layout-column/app-auth/div/div/div/form/span[2]");
    By SeleccioneSistema = By.xpath("/html/body/app-root/nb-layout-column/app-home/nb-layout/div[1]/div/div/div/div/nb-layout-column/div/div[1]/nb-card[1]/nb-card-body/nb-select/button");
    By SistemaMovilBussines = By.xpath("//*[@id=\"nb-option-1\"]");
    By InformacionRepresentantes = By.xpath("/html/body/app-root/nb-layout-column/app-home/nb-layout/div[1]/div/div/div/div/nb-layout-column/div/div[1]/nb-card[2]/nb-card-body/div[1]/div[1]/button");
    By RepCodigoinfoRepre = By.xpath("//input[@type ='text']");
    By BtnEnviar = By.xpath("//input[@status ='success']");
    By ColumnaCargaInicial = By.xpath("//*[@id=\"cdk-overlay-1\"]/nb-dialog-container/nb-card/nb-card-body/table/thead/tr/th[3]");
    By InformacionTransacciones = By.xpath("/html/body/app-root/nb-layout-column/app-home/nb-layout/div[1]/div/div/div/div/nb-layout-column/div/div[1]/nb-card[2]/nb-card-body/div[2]/div[1]/button");
    By Secuencia = By.xpath("//input[@type='text' and @placeholder='Secuencia']");
    By NumSecuencia = By.xpath("//td[text()='401384-15']");
}
