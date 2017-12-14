package br.unitins.senhas.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.frame.repository.Repository;
import br.unitins.senhas.model.Perfil;

public class PerfilRepository extends Repository<Perfil>{

	@Override
	protected Class<Perfil> getModelClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public PerfilRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<Perfil> bucarTodos() {
		
		 Query query= geEntityManager().createQuery("Select a From Aluno a Order by a.id Desc");
		List<Perfil> lista = query.getResultList();
		
		if (lista == null)
			lista = new ArrayList <Perfil>();
		
		return lista;

	}

}
