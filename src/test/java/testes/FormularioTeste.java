package testes;

import org.junit.Test;
import pageObject.FormularioPage;

import java.io.IOException;

public class FormularioTeste {

   private FormularioPage formularioTeste = new FormularioPage();

   @Test
    public void AcessarFormulario () throws InterruptedException, IOException {

        formularioTeste.clicarFormulario();
    }

@Test
    public void InserirNome  ()throws InterruptedException, IOException {

       formularioTeste.clicarFormulario();
       formularioTeste.inserirNome("testando");
}



}
