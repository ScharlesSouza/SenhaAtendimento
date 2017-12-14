package br.unitins.senhas.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PaginasController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/faces/pages/login")
    public String login() {
        return "login";
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/faces/pages/")
    public String inicio() {
        return "login";
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/faces/pages/atendimento")
    public String atendimento() {
        return "atendimento";
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/faces/pages/cadastroUsuario")
    public String cadastroUsuario() {
        return "cadastroUsuario";
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/faces/pages/chamarSenha")
    public String chamarSenha() {
        return "chamarSenha";
    }
	@RequestMapping(method = RequestMethod.GET, path = "/faces/pages/guiche")
    public String guiche() {
        return "guiche";
    }
	@RequestMapping(method = RequestMethod.GET, path = "/faces/pages/PainelSenha")
    public String painelSenha() {
        return "PainelSenha";
    }
	@RequestMapping(method = RequestMethod.GET, path = "/faces/pages/senha")
    public String gerarSenha() {
        return "senha";
    }
}
