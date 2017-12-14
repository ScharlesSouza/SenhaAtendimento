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
public class Avaliacao extends Model<Avaliacao>{

	
	private static final long serialVersionUID = 5105722837254718465L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seqIdAvaliacao")
	@SequenceGenerator(name="seqIdAvaliacao", sequenceName="seqIdAvaliacao", allocationSize=1)
	private Integer id;
	private float nota=0;
	
	@ManyToOne
	@JoinColumn(name = "idSenha", nullable = false)
	private Senha senha;

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	
	
	

}
