package br.unitins.senhas.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import br.unitins.frame.controller.Controller;
import br.unitins.frame.validation.Validation;
import br.unitins.senhas.model.Perfil;


@ManagedBean
@ViewScoped
public class PerfilController extends Controller<Perfil>{

	
	
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perfil getEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Validation<Perfil> getValidation() {
		// TODO Auto-generated method stub
		return null;
	}

}
