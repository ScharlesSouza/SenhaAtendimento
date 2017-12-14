package br.unitins.senhas.validation;

import java.util.ArrayList;
import java.util.List;

import br.unitins.frame.application.ValidationException;
import br.unitins.frame.validation.Validation;
import br.unitins.senhas.model.AreaAtendimento;

public class AreaAtendimentoValidation implements Validation<AreaAtendimento>{

	
	
List<String> listMessages;
	
	@Override
	public void validate(AreaAtendimento t) throws ValidationException {
		
		if (t.getNomeArea() == null || t.getNomeArea().trim().equals(""))
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
