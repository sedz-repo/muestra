package co.com.certification.google.runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/busqueda_google.feature",
		snippets = CucumberOptions.SnippetType.CAMELCASE,
		glue = "co.com.certification.google.stepdefinitions")
public class BusquedaGoogle {
}
