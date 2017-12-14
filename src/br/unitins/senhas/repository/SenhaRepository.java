package br.unitins.senhas.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.frame.repository.Repository;
import br.unitins.senhas.model.Senha;

public class SenhaRepository extends Repository<Senha> {

	@Override
	protected Class<Senha> getModelClass() {
		// TODO Auto-generated method stub
		return Senha.class;
	}
	
	
	public SenhaRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<Senha> bucarTodos() {
		
		 Query query= geEntityManager().createQuery("Select a From Senha a Order by a.id Desc");
		List<Senha> lista = query.getResultList();
		
		if (lista == null)
			lista = new ArrayList <Senha>();
		
		return lista;

	}
	
	

}
