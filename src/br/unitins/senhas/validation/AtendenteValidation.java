package br.unitins.senhas.validation;

import java.util.ArrayList;
import java.util.List;

import br.unitins.frame.application.ValidationException;
import br.unitins.frame.validation.Validation;
import br.unitins.senhas.model.Atendente;

public class AtendenteValidation implements Validation<Atendente>{
	
List<String> listMessages;
	
	@Override
	public void validate(Atendente t) throws ValidationException {
		
		if (t.getUsuario() == null || t.getUsuario().getNome().trim().equals(""))
			getlistMessages().add("O nome do atendente deve ser informada!");
		
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
