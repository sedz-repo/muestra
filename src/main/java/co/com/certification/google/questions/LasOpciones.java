package co.com.certification.google.questions;


import java.util.List;

import co.com.certification.google.userinterfaces.ResultadosPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LasOpciones implements Question<List<String>>{

	@Override
	public List<String> answeredBy(Actor actor) {

		return Text.of(ResultadosPage.TABS).viewedBy(actor).asList();
	}
	
	public static LasOpciones obtenidas() {
		return new LasOpciones();
	}


}
