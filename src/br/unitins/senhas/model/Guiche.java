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
public class Guiche extends Model<Guiche> {

	
	private static final long serialVersionUID = 9127084249928501255L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seqIdGuiche")
	@SequenceGenerator(name="seqIdGuiche", sequenceName="seqIdGuiche", allocationSize=1)
	private Integer id;
	private Integer numGuiche;
	private String tipoGuiche;
	private String observacao;
	
	@ManyToOne
	@JoinColumn(name = "idAtendente", nullable = false)
	private Atendente atendente;
	

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public Integer getNumGuiche() {
		return numGuiche;
	}

	public void setNumGuiche(Integer numGuiche) {
		this.numGuiche = numGuiche;
	}

	public String getTipoGuiche() {
		return tipoGuiche;
	}

	public void setTipoGuiche(String tipoGuiche) {
		this.tipoGuiche = tipoGuiche;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}
	
	

}
