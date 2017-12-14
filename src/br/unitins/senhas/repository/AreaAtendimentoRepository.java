package br.unitins.senhas.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.frame.repository.Repository;
import br.unitins.senhas.model.AreaAtendimento;

public class AreaAtendimentoRepository extends Repository<AreaAtendimento> {

	@Override
	protected Class<AreaAtendimento> getModelClass() {
		// TODO Auto-generated method stub
		return AreaAtendimento.class;
	}
	
	
	public AreaAtendimentoRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<AreaAtendimento> bucarTodos() {
		
		 Query query= geEntityManager().createQuery("Select a From AreaAtendimento a Order by a.id Desc");
		List<AreaAtendimento> lista = query.getResultList();
		
		if (lista == null)
			lista = new ArrayList <AreaAtendimento>();
		
		return lista;

	}
	
public List<AreaAtendimento> buscarAreas(String nome) {
		
		Query query = geEntityManager().createQuery("SELECT c FROM AreaAtendimento c WHERE c.nome LIKE ?1 ORDER BY c.nome");
		query.setParameter(1, "%"+nome+"%");
		List<AreaAtendimento> lista = query.getResultList();
		
		if (lista == null)
			lista = new ArrayList<AreaAtendimento>();
		
		return lista;
	}

}
