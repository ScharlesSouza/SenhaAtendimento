package br.unitins.senhas.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.unitins.frame.application.ApplicationException;
import br.unitins.senhas.factory.JPAFactory;
import br.unitins.senhas.model.AreaAtendimento;
import br.unitins.senhas.repository.AreaAtendimentoRepository;

@FacesConverter(value = "areaAtendimentoConverter", forClass = AreaAtendimento.class)
public class AreaAtendimentoConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		AreaAtendimentoRepository repository = new AreaAtendimentoRepository(JPAFactory.getEntityManager());
		try {
			AreaAtendimento c = ((AreaAtendimento)repository.find(Integer.parseInt(arg2)));  
			return c;
		} catch (NumberFormatException | ApplicationException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if(arg2 != null) {
			return ((AreaAtendimento) arg2).getId() == null ? "":((AreaAtendimento) arg2).getId().toString();
		}
		return "";
	}
}