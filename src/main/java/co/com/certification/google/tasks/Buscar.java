package co.com.certification.google.tasks;

import static co.com.certification.google.userinterfaces.BusquedaPage.BUSQUEDA;

import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class Buscar{
	
	public static Performable elTexto(String texto) {
		return Task.where("{0} busca la palabra #text",
				Enter.theValue(texto).into(BUSQUEDA).thenHit(Keys.ENTER));
	}

}
