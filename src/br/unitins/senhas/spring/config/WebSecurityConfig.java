package br.unitins.senhas.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//import com.algaworks.gp.security.GpUserDetailsService;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	//private GpUserDetailsService userDetailsService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.
			authorizeRequests()
				.antMatchers("/faces/pages/atendimento").hasAnyRole("SA_ATENDIMENTO")
				.antMatchers("/faces/pages/cadastroUsuario").hasAnyRole("SA_CADASTRO_USUARIO")
				.antMatchers("/faces/pages/chamarSenha").hasAnyRole("SA_CHAMAR_SENHA")
				.anyRequest()
				.authenticated()
			.and()
			.formLogin()
				.loginPage("/faces/pages/login")
				.permitAll()
			.and()
			.logout()
				.logoutSuccessUrl("/faces/pages/login?logout")
				.permitAll()
			.and()
			.rememberMe();
				//.userDetailsService(userDetailsService);
	}

}
