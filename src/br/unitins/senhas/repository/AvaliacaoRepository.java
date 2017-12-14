package br.unitins.senhas.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.frame.repository.Repository;
import br.unitins.senhas.model.Avaliacao;

public class AvaliacaoRepository extends Repository<Avaliacao> {

	@Override
	protected Class<Avaliacao> getModelClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public AvaliacaoRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<Avaliacao> bucarTodos() {
		
		 Query query= geEntityManager().createQuery("Select a From Aluno a Order by a.id Desc");
		List<Avaliacao> lista = query.getResultList();
		
		if (lista == null)
			lista = new ArrayList <Avaliacao>();
		
		return lista;

	}

}
