package co.com.certification.google.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import co.com.certification.google.excepciones.TiposOpcionesExcepcion;
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



}
