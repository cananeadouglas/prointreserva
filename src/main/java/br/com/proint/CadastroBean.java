package br.com.proint;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="cadastroBean")
@ViewScoped // mantem os dados em tela maneneBean fica conectados a jsf

public class CadastroBean {
	
	

	private String nomeCompleto;
	
	private Long cpf;
	
	private Long contato;
	
	private String email;
	
	

	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public Long getContato() {
		return contato;
	}
	public void setContato(Long contato) {
		this.contato = contato;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
