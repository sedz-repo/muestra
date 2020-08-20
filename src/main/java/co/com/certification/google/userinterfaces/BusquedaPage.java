package co.com.certification.google.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BusquedaPage {
	public static final Target BUSQUEDA = Target.the("Caja de busqueda").located(By.name("q"));
	
}
