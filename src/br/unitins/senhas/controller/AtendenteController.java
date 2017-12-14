package br.unitins.senhas.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import br.unitins.frame.controller.Controller;
import br.unitins.frame.validation.Validation;
import br.unitins.senhas.model.Atendente;

@ManagedBean
@ViewScoped
public class AtendenteController extends Controller<Atendente> {

	
	
	
	
	
	
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Atendente getEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Validation<Atendente> getValidation() {
		// TODO Auto-generated method stub
		return null;
	}

}
