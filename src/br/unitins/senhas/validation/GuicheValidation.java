package br.unitins.senhas.validation;

import java.util.ArrayList;
import java.util.List;

import br.unitins.frame.application.ValidationException;
import br.unitins.frame.validation.Validation;
import br.unitins.senhas.model.Guiche;

public class GuicheValidation implements Validation<Guiche> {
	
List<String> listMessages;
	
	@Override
	public void validate(Guiche t) throws ValidationException {
		
		if (t.getNumGuiche() == null || t.getNumGuiche()==0)
			getlistMessages().add("O numero do guiche deve ser informada!");
		
		if (getlistMessages().size() > 0)
			throw new ValidationException(getlistMessages());
	}

	public List<String> getlistMessages() {
		if (listMessages == null)
			listMessages = new ArrayList<String>();
		return listMessages;
	}

	public void setlistMessages(List<String> listMessages) {
		this.listMessages = listMessages;
	}

}
