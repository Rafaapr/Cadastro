/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.icesp.cadastro.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.icesp.cadastro.service.http.cadastroUsuarioServiceSoap}.
 *
 * @author    ln00704
 * @see       com.icesp.cadastro.service.http.cadastroUsuarioServiceSoap
 * @generated
 */
public class cadastroUsuarioSoap implements Serializable {
	public static cadastroUsuarioSoap toSoapModel(cadastroUsuario model) {
		cadastroUsuarioSoap soapModel = new cadastroUsuarioSoap();

		soapModel.setCpf(model.getCpf());
		soapModel.setRg(model.getRg());
		soapModel.setNome(model.getNome());
		soapModel.setUserName(model.getUserName());
		soapModel.setSobrenome(model.getSobrenome());
		soapModel.setEmail(model.getEmail());
		soapModel.setEmailconfir(model.getEmailconfir());
		soapModel.setSenha(model.getSenha());
		soapModel.setSenhaconfir(model.getSenhaconfir());
		soapModel.setCelular(model.getCelular());
		soapModel.setSexo(model.getSexo());
		soapModel.setDate(model.getDate());
		soapModel.setCep(model.getCep());
		soapModel.setEstado(model.getEstado());
		soapModel.setCidade(model.getCidade());
		soapModel.setRua(model.getRua());
		soapModel.setProfissao(model.getProfissao());
		soapModel.setHospital(model.getHospital());

		return soapModel;
	}

	public static cadastroUsuarioSoap[] toSoapModels(cadastroUsuario[] models) {
		cadastroUsuarioSoap[] soapModels = new cadastroUsuarioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static cadastroUsuarioSoap[][] toSoapModels(
		cadastroUsuario[][] models) {
		cadastroUsuarioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new cadastroUsuarioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new cadastroUsuarioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static cadastroUsuarioSoap[] toSoapModels(
		List<cadastroUsuario> models) {
		List<cadastroUsuarioSoap> soapModels = new ArrayList<cadastroUsuarioSoap>(models.size());

		for (cadastroUsuario model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new cadastroUsuarioSoap[soapModels.size()]);
	}

	public cadastroUsuarioSoap() {
	}

	public String getPrimaryKey() {
		return _cpf;
	}

	public void setPrimaryKey(String pk) {
		setCpf(pk);
	}

	public String getCpf() {
		return _cpf;
	}

	public void setCpf(String cpf) {
		_cpf = cpf;
	}

	public String getRg() {
		return _rg;
	}

	public void setRg(String rg) {
		_rg = rg;
	}

	public String getNome() {
		return _nome;
	}

	public void setNome(String nome) {
		_nome = nome;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getSobrenome() {
		return _sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		_sobrenome = sobrenome;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getEmailconfir() {
		return _emailconfir;
	}

	public void setEmailconfir(String emailconfir) {
		_emailconfir = emailconfir;
	}

	public String getSenha() {
		return _senha;
	}

	public void setSenha(String senha) {
		_senha = senha;
	}

	public String getSenhaconfir() {
		return _senhaconfir;
	}

	public void setSenhaconfir(String senhaconfir) {
		_senhaconfir = senhaconfir;
	}

	public String getCelular() {
		return _celular;
	}

	public void setCelular(String celular) {
		_celular = celular;
	}

	public String getSexo() {
		return _sexo;
	}

	public void setSexo(String sexo) {
		_sexo = sexo;
	}

	public Date getDate() {
		return _date;
	}

	public void setDate(Date date) {
		_date = date;
	}

	public String getCep() {
		return _cep;
	}

	public void setCep(String cep) {
		_cep = cep;
	}

	public String getEstado() {
		return _estado;
	}

	public void setEstado(String estado) {
		_estado = estado;
	}

	public String getCidade() {
		return _cidade;
	}

	public void setCidade(String cidade) {
		_cidade = cidade;
	}

	public String getRua() {
		return _rua;
	}

	public void setRua(String rua) {
		_rua = rua;
	}

	public String getProfissao() {
		return _profissao;
	}

	public void setProfissao(String profissao) {
		_profissao = profissao;
	}

	public String getHospital() {
		return _hospital;
	}

	public void setHospital(String hospital) {
		_hospital = hospital;
	}

	private String _cpf;
	private String _rg;
	private String _nome;
	private String _userName;
	private String _sobrenome;
	private String _email;
	private String _emailconfir;
	private String _senha;
	private String _senhaconfir;
	private String _celular;
	private String _sexo;
	private Date _date;
	private String _cep;
	private String _estado;
	private String _cidade;
	private String _rua;
	private String _profissao;
	private String _hospital;
}