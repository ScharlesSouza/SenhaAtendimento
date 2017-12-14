/**
 * 
 */
package br.unitins.senhas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import br.unitins.frame.model.Model;

/**
 * @author SCHARLES
 *
 */
@Entity
public class AreaAtendimento extends Model<AreaAtendimento>{

	private static final long serialVersionUID = 5340998728426485061L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqIdArea")
	@SequenceGenerator(name = "seqIdArea", sequenceName = "seqIdArea", allocationSize = 1)
	private Integer id;
	private String siglaArea;
	private String nomeArea;
	private String descricao;
	

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public String getSiglaArea() {
		return siglaArea;
	}

	
	public void setSiglaArea(String siglaArea) {
		this.siglaArea = siglaArea;
	}

	public String getNomeArea() {
		return nomeArea;
	}

	public void setNomeArea(String nomeArea) {
		this.nomeArea = nomeArea;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
}
