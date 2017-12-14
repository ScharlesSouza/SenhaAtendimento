package br.unitins.senhas.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import br.unitins.frame.controller.Controller;
import br.unitins.frame.validation.Validation;
import br.unitins.senhas.model.Avaliacao;


@ManagedBean
@ViewScoped
public class AvaliacaoController extends Controller<Avaliacao> {

	
	
	
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Avaliacao getEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Validation<Avaliacao> getValidation() {
		// TODO Auto-generated method stub
		return null;
	}

}
