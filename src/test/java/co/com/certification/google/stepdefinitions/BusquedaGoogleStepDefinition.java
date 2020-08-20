package co.com.certification.google.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import co.com.certification.google.excepciones.TiposOpcionesExcepcion;
import co.com.certification.google.questions.LasOpciones;
import co.com.certification.google.tasks.Buscar;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;

public class BusquedaGoogleStepDefinition {
	@Managed(driver = "chrome")
	private WebDriver hisDriver;

	@Before
	public void setUp() {
		OnStage.setTheStage(Cast.ofStandardActors());
	}

	@Given("^que (.*) esta en google$")
	public void queNombreEstaEnGoogle(String name) {
		OnStage.theActorCalled(name).can(BrowseTheWeb.with(hisDriver));
		theActorInTheSpotlight().wasAbleTo(Open.url("http://www.google.com"));
	}

	@When("^el busca (.*)$")
	public void elBuscaTexto(String texto) {
		theActorInTheSpotlight().attemptsTo(Buscar.elTexto(texto));
	}

	@Then("^el vera los tipos de opciones para buscar$")
	public void elVeraLosTiposDeOpcionesParaBuscar(List<String> lasOpcionesEsperadas) {
		//System.out.println(theActorInTheSpotlight().asksFor(LasOpciones.obtenidas()));
		
		List<String> miLista = theActorInTheSpotlight().asksFor(LasOpciones.obtenidas());
		for (String string : miLista) {
			System.out.println(string);
		}
		
		
		theActorInTheSpotlight().should(seeThat(LasOpciones.obtenidas(), 
				Matchers.containsInAnyOrder(lasOpcionesEsperadas.toArray())).
				orComplainWith(TiposOpcionesExcepcion.class, "Este mensaje aparecera en el error"));
	}

}
