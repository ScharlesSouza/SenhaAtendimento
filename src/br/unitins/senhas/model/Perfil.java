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
public class Perfil extends Model<Perfil> {

	
	private static final long serialVersionUID = 3029517845027828296L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seqIdPerfil")
	@SequenceGenerator(name="seqIdPerfil", sequenceName="seqIdPerfil", allocationSize=1)
	private Integer id;
	private Integer perfil;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario", nullable = true)
	private Usuario usuario;
	

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

	public Integer getPerfil() {
		return perfil;
	}

	public void setPerfil(Integer perfil) {
		this.perfil = perfil;
	}
	
	

}
