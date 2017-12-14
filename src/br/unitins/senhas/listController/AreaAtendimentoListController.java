package br.unitins.senhas.listController;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.unitins.frame.listController.ListController;
import br.unitins.senhas.factory.JPAFactory;
import br.unitins.senhas.model.AreaAtendimento;
import br.unitins.senhas.repository.AreaAtendimentoRepository;



@ManagedBean
@ViewScoped
public class AreaAtendimentoListController extends ListController<AreaAtendimento> {

	private static final long serialVersionUID = 5816342500278252412L;

	public AreaAtendimentoListController() {
		super(new AreaAtendimentoRepository(JPAFactory.getEntityManager()), true, false, false, 450, 650, "/listings/listagemAreaAtendimento");
		getEntity().setNomeArea("");
	}

	@Override
	public AreaAtendimento getEntity() {
		if (entity == null)
			entity = new AreaAtendimento();
		return entity;
	}

	public List<AreaAtendimento> getListEntity() {
		if (listEntity == null) {
			listEntity = new ArrayList<AreaAtendimento>();
			AreaAtendimentoRepository repository = new AreaAtendimentoRepository(JPAFactory.getEntityManager());
			try {
				listEntity = repository.buscarAreas(getEntity().getNomeArea());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return listEntity;
	}

}
