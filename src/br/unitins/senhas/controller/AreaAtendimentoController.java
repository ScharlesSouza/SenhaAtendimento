package br.unitins.senhas.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;

import br.unitins.frame.controller.Controller;
import br.unitins.frame.validation.Validation;
import br.unitins.senhas.factory.JPAFactory;
import br.unitins.senhas.model.AreaAtendimento;
import br.unitins.senhas.repository.AreaAtendimentoRepository;
import br.unitins.senhas.validation.AreaAtendimentoValidation;

@ManagedBean
@ViewScoped
public class AreaAtendimentoController extends Controller<AreaAtendimento> {

	
	private List<AreaAtendimento> listaAreaAtendimento;
	
	
	
	
	@Override
	protected EntityManager getEntityManager() {
		return JPAFactory.getEntityManager();
	}

	@Override
	public AreaAtendimento getEntity() {
		if (entity == null) {
			entity = new AreaAtendimento();
			
		}
		return entity;
	}

	@Override
	public Validation<AreaAtendimento> getValidation() {
		// TODO Auto-generated method stub
		return new AreaAtendimentoValidation();
	}
	
	@Override
	public void clean(ActionEvent actionEvent) {
		super.clean(actionEvent);
		setListaAreaAtendimento(null);
		
	}
	
	public List<AreaAtendimento> getListaAreaAtendimento() {
		if (listaAreaAtendimento == null) {
			AreaAtendimentoRepository repository = new AreaAtendimentoRepository(JPAFactory.getEntityManager());
			listaAreaAtendimento = repository.bucarTodos();
		}
		return listaAreaAtendimento;
	}

	public void setListaAreaAtendimento(List<AreaAtendimento> listaServidor) {
		this.listaAreaAtendimento = listaServidor;
	}
	

}
