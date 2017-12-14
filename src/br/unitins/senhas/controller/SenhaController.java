package br.unitins.senhas.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;

import br.unitins.frame.application.SelectionListener;
import br.unitins.frame.controller.Controller;
import br.unitins.frame.validation.Validation;
import br.unitins.senhas.factory.JPAFactory;
import br.unitins.senhas.listController.AreaAtendimentoListController;
import br.unitins.senhas.model.AreaAtendimento;
import br.unitins.senhas.model.Senha;
import br.unitins.senhas.repository.AreaAtendimentoRepository;
import br.unitins.senhas.repository.SenhaRepository;
import br.unitins.senhas.validation.SenhaValidation;


@ManagedBean
@ViewScoped
public class SenhaController extends Controller<Senha> {

	private List<AreaAtendimento> listaAreaAtendimento;
	private List<Senha> listaSenha;
	
	
	@Override
	protected EntityManager getEntityManager() {
		return JPAFactory.getEntityManager();
	}

	@Override
	public Senha getEntity() {
		if (entity == null) {
			entity = new Senha();
			entity.setArea(new AreaAtendimento());
		}
		return entity;
	}
	
	@Override
	public void clean(ActionEvent actionEvent) {
		super.clean(actionEvent);
		setListaSenha(null);
		setListaAreaAtendimento(null);
	}

	@Override
	public Validation<Senha> getValidation() {
		// TODO Auto-generated method stub
		return new SenhaValidation();
	}
	
	public List<Senha> getListaSenha() {
		if (listaSenha == null) {
			SenhaRepository repository = new SenhaRepository(JPAFactory.getEntityManager());
			listaSenha = repository.bucarTodos();
		}
		return listaSenha;
	}

	public void setListaSenha(List<Senha> listasenha) {
		this.listaSenha = listasenha;
	
	}
	
	public List<AreaAtendimento> getListaAreaAtendimento() {
		if (listaAreaAtendimento == null) {
			AreaAtendimentoRepository repository = new AreaAtendimentoRepository(JPAFactory.getEntityManager());
			listaAreaAtendimento = repository.bucarTodos();
		}
		return listaAreaAtendimento;
	}

	public void setListaAreaAtendimento(List<AreaAtendimento> listaarea) {
		this.listaAreaAtendimento = listaarea;
	}
	

	public void abrirListAreaAtendimento(ActionEvent actionEvent) {
		AreaAtendimentoListController list = new AreaAtendimentoListController();
		list.openList(new SelectionListener<AreaAtendimento>() {
			@Override
			public void select(AreaAtendimento entity) {
				getEntity().setArea(entity);
			}
		});
	}

}
