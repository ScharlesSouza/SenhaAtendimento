package br.unitins.senhas.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.frame.repository.Repository;
import br.unitins.senhas.model.Usuario;

public class UsuarioRepository extends Repository<Usuario>{

	@Override
	protected Class<Usuario> getModelClass() {
		return Usuario.class;
	}

	
	public UsuarioRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> bucarTodos() {
		
		Query query= geEntityManager().createQuery("Select a From Usuario a Order by a.id Desc");
		List<Usuario> lista = query.getResultList();
		
		if (lista == null)
			lista = new ArrayList<Usuario>();
		
		return lista;

	}
}
