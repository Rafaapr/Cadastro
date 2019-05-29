package com.icesp.cadastro.model;

import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String cpf;
	public String rg;
	public String nome;
	public String sobrenome;
	public String email;
	public String emailconfir;
	public String senha;
	public String senhaconfir;
	public String celular;
	public int sexo;
	public Date date;
	public String cep;
	public String estado;
	public String cidade;
	public String rua;
	public String profissao;
	public String hospital;
	
	public Usuario() {
		super();
	}
	public Usuario(String cpf, String rg, String nome, String sobrenome, String email, String emailconfir, String senha,
			String senhaconfir, String celular, int sexo, Date date, String cep, String estado, String cidade,
			String rua, String profissao, String hospital) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.emailconfir = emailconfir;
		this.senha = senha;
		this.senhaconfir = senhaconfir;
		this.celular = celular;
		this.sexo = sexo;
		this.date = date;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
		this.profissao = profissao;
		this.hospital = hospital;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailconfir() {
		return emailconfir;
	}
	public void setEmailconfir(String emailconfir) {
		this.emailconfir = emailconfir;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenhaconfir() {
		return senhaconfir;
	}
	public void setSenhaconfir(String senhaconfir) {
		this.senhaconfir = senhaconfir;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

}
