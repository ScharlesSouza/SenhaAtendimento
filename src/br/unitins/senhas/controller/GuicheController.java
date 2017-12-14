package br.unitins.senhas.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import br.unitins.frame.controller.Controller;
import br.unitins.frame.validation.Validation;
import br.unitins.senhas.model.Guiche;


@ManagedBean
@ViewScoped
public class GuicheController extends Controller<Guiche> {

	
	
	
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Guiche getEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Validation<Guiche> getValidation() {
		// TODO Auto-generated method stub
		return null;
	}

}
