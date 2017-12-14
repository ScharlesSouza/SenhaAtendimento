package br.unitins.senhas.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;

import br.unitins.frame.controller.Controller;
import br.unitins.frame.validation.Validation;
import br.unitins.senhas.factory.JPAFactory;
import br.unitins.senhas.model.Usuario;
import br.unitins.senhas.repository.UsuarioRepository;
import br.unitins.senhas.validation.UsuarioValidation;

@ManagedBean
@ViewScoped
@SessionScoped
public class UsuarioController extends Controller<Usuario> {
	private String email = "";
    private String senha = "";
	private List<Usuario> listaUsuario;
	
	
	@Override
	protected EntityManager getEntityManager() {
		return JPAFactory.getEntityManager();
	}

	@Override
	public Usuario getEntity() {
		if (entity == null) {
			entity = new Usuario();
			
		}
		return entity;
	}
	
	@Override
	public Validation<Usuario> getValidation() {
		// TODO Auto-generated method stub
		return new UsuarioValidation();
	}
	
	@Override
	public void clean(ActionEvent actionEvent) {
		super.clean(actionEvent);
		setListaUsuario(null);
	}
	
	public void setListaUsuario(List<Usuario> listaServidor) {
		this.listaUsuario = listaServidor;
	}
	
	public List<Usuario> getListaUsuario() {
		if (listaUsuario == null) {
			UsuarioRepository repository = new UsuarioRepository(JPAFactory.getEntityManager());
			listaUsuario = repository.bucarTodos();
		}
		return listaUsuario;
	}
	
	public String logar(){
		for(Usuario vrUsuario : getListaUsuario())
		{
			if(this.email.equals(vrUsuario.getEmail()) && this.senha.equals(vrUsuario.getSenha())){
				
					return "cadastroUsuario.xhtml";
				
			}
		}
		
        FacesContext ctx = FacesContext.getCurrentInstance();
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário inválido", "Usuário inválido");
        ctx.addMessage(null, msg);
        return "";              
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	

}
