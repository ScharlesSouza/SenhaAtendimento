package br.unitins.senhas.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.frame.repository.Repository;
import br.unitins.senhas.model.Atendente;

public class AtendenteRepository extends Repository<Atendente>{

	@Override
	protected Class<Atendente> getModelClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public  AtendenteRepository (EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<Atendente> bucarTodos() {
		
		 Query query= geEntityManager().createQuery("Select a From Aluno a Order by a.id Desc");
		List<Atendente> lista = query.getResultList();
		
		if (lista == null)
			lista = new ArrayList <Atendente>();
		
		return lista;

	}

}
