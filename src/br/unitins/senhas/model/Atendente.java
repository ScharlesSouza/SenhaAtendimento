package br.unitins.senhas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import br.unitins.frame.model.Model;

@Entity
public class Atendente extends Model<Atendente> {

	
	private static final long serialVersionUID = 3783747110075644588L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seqIdAtendente")
	@SequenceGenerator(name="seqIdAtendente", sequenceName="seqIdAtendente", allocationSize=1)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario", nullable = false)
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name = "idArea", nullable = true)
	private AreaAtendimento area;
	
	
	
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public AreaAtendimento getArea() {
		return area;
	}

	public void setArea(AreaAtendimento area) {
		this.area = area;
	}

}
