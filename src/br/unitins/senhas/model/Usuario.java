package br.unitins.senhas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


import br.unitins.frame.model.Model;

@Entity
public class Usuario extends Model<Usuario> {

	
	private static final long serialVersionUID = 7038783432201354845L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seqidusuario")
	@SequenceGenerator(name="seqidusuario", sequenceName="seqidusuario", allocationSize=1)
	private Integer id;
	
	private Integer cpf;
	private String nome, senha, email;

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
		
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
