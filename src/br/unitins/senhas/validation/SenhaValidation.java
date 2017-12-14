package br.unitins.senhas.validation;

import java.util.ArrayList;
import java.util.List;

import br.unitins.frame.application.ValidationException;
import br.unitins.frame.validation.Validation;
import br.unitins.senhas.model.Senha;

public class SenhaValidation implements Validation<Senha>{
	
	
List<String> listMessages;
	
	@Override
	public void validate(Senha t) throws ValidationException {
		
		if (t.getArea() == null || t.getArea().getNomeArea().trim().equals(""))
			getlistMessages().add("O nome da area de atendimento deve ser informada!");
		
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
