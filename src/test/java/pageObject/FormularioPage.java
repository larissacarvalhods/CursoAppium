package pageObject;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import utils.BaseTestes;

import static utils.DriverFactory.getDriver;

 public class FormularioPage extends BaseTestes {

 public void clicarFormulario(){

  getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"Formulário\"]")).click();

  }

  public  void inserirNome(String name){

  getDriver().findElement(MobileBy.AccessibilityId("nome")).sendKeys(name);

 }

}
