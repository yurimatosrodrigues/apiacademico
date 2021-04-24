package br.sp.gov.etec.apiacademico.dto;

import java.io.Serializable;

public class LoginDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4529704450634753044L;

	private String username;
	private String password;
	private String tipoLogin;
	private String nome;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipoLogin() {
		return tipoLogin;
	}

	public void setTipoLogin(String tipoLogin) {
		this.tipoLogin = tipoLogin;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
