package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;

import java.util.Arrays;
import java.util.List;

public class FreeRangeSteps {
    SoftAssert soft = new SoftAssert();

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();
    PaginaRegistro registro = new PaginaRegistro();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToFreeRangeTesters();
        }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section){
        landingPage.clickOnSectionNavigationBar(section);
        }

    @When("^(?:I|The user|The client) (?:select|selects) Elegir Plan$")
    public void selectElegirPlan() {
        landingPage.clickOnElegirPlanButton();
    }

    @And("^((?:I|The user|The client)) ((?:select|selects)) Introduccion al Testing$")
    public void navigateToIntro(String actor, String verb) {
        cursosPage.clickFundamentosTestingLink();
        fundamentosPage.clickIntroduccionTestingLink();
    }

    @Then("^(?:I|The user|The client) can validate the options in the checkout page$")
    public void validateCheckoutPlans() {
        List<String> lista = registro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList(
                "Academia: $16.99 / mes • 13 productos",
                "Academia: $176 / año • 14 productos",
                "Free: Gratis • 3 productos");

        Assert.assertEquals(listaEsperada, lista);
    }

    public void ejemplulis(){
        String palabraEsperada = "Pepe";
        String palabraEncontrada = "Papa";
        int numeroLoco = 1;
        int numeroLoco2 = 2;

        //Verificar que dos valores no son iguales
        Assert.assertEquals(palabraEsperada, palabraEncontrada);

        //Verificar que dos valores no son iguales
        Assert.assertEquals(palabraEsperada, palabraEncontrada);

        //Verificar que una condición es verdadera
        Assert.assertTrue(palabraEncontrada.contains(palabraEsperada));

        //Verificar que una condición es falsa
        Assert.assertFalse(palabraEncontrada.contains(palabraEsperada));

        //sSoft Assertions: No detienen la ejecución al fallar. Ideal para verificar muchas cosas pequeñas a la vez
        soft.assertEquals(palabraEsperada, palabraEncontrada);
        soft.assertTrue(palabraEncontrada.contains(palabraEsperada));
        soft.assertFalse(palabraEncontrada.contains(palabraEsperada));

        soft.assertAll();
    }
}


