package br.unitins.senhas.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import br.unitins.frame.model.Model;
@Entity
public class Senha extends Model<Senha>{

	
	private static final long serialVersionUID = 5550655213510736643L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seqIdSenha")
	@SequenceGenerator(name="seqIdSenha", sequenceName="seqIdSenha", allocationSize=1)
	private Integer id;
	private Integer prioridade;
	private Integer Numero;
	
	
	@ManyToOne
	@JoinColumn(name = "idArea", nullable = false)
	private AreaAtendimento area;
	@ManyToOne
	@JoinColumn(name = "idGuiche", nullable = true)
	private Guiche guiche;

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	public AreaAtendimento getArea() {
		return this.area;
		
	}
	
	public void setArea(AreaAtendimento area) {
		this.area = area;
		
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}
	
	public Integer getNumero() {
		return Numero;
	}

	public void setNumero(Integer numero) {
		Numero = numero;
	}


}
