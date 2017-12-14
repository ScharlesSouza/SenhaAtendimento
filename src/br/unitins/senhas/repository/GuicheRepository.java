package br.unitins.senhas.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.frame.repository.Repository;
import br.unitins.senhas.model.Guiche;

public class GuicheRepository extends Repository<Guiche>{

	@Override
	protected Class<Guiche> getModelClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public GuicheRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<Guiche> bucarTodos() {
		
		 Query query= geEntityManager().createQuery("Select a From Aluno a Order by a.id Desc");
		List<Guiche> lista = query.getResultList();
		
		if (lista == null)
			lista = new ArrayList <Guiche>();
		
		return lista;

	}

}
