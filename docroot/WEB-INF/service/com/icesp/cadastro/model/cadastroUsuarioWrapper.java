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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link cadastroUsuario}.
 * </p>
 *
 * @author    ln00704
 * @see       cadastroUsuario
 * @generated
 */
public class cadastroUsuarioWrapper implements cadastroUsuario,
	ModelWrapper<cadastroUsuario> {
	public cadastroUsuarioWrapper(cadastroUsuario cadastroUsuario) {
		_cadastroUsuario = cadastroUsuario;
	}

	public Class<?> getModelClass() {
		return cadastroUsuario.class;
	}

	public String getModelClassName() {
		return cadastroUsuario.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cpf", getCpf());
		attributes.put("rg", getRg());
		attributes.put("nome", getNome());
		attributes.put("userName", getUserName());
		attributes.put("sobrenome", getSobrenome());
		attributes.put("email", getEmail());
		attributes.put("emailconfir", getEmailconfir());
		attributes.put("senha", getSenha());
		attributes.put("senhaconfir", getSenhaconfir());
		attributes.put("celular", getCelular());
		attributes.put("sexo", getSexo());
		attributes.put("date", getDate());
		attributes.put("cep", getCep());
		attributes.put("estado", getEstado());
		attributes.put("cidade", getCidade());
		attributes.put("rua", getRua());
		attributes.put("profissao", getProfissao());
		attributes.put("hospital", getHospital());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		String cpf = (String)attributes.get("cpf");

		if (cpf != null) {
			setCpf(cpf);
		}

		String rg = (String)attributes.get("rg");

		if (rg != null) {
			setRg(rg);
		}

		String nome = (String)attributes.get("nome");

		if (nome != null) {
			setNome(nome);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String sobrenome = (String)attributes.get("sobrenome");

		if (sobrenome != null) {
			setSobrenome(sobrenome);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String emailconfir = (String)attributes.get("emailconfir");

		if (emailconfir != null) {
			setEmailconfir(emailconfir);
		}

		String senha = (String)attributes.get("senha");

		if (senha != null) {
			setSenha(senha);
		}

		String senhaconfir = (String)attributes.get("senhaconfir");

		if (senhaconfir != null) {
			setSenhaconfir(senhaconfir);
		}

		String celular = (String)attributes.get("celular");

		if (celular != null) {
			setCelular(celular);
		}

		String sexo = (String)attributes.get("sexo");

		if (sexo != null) {
			setSexo(sexo);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		String cep = (String)attributes.get("cep");

		if (cep != null) {
			setCep(cep);
		}

		String estado = (String)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		String cidade = (String)attributes.get("cidade");

		if (cidade != null) {
			setCidade(cidade);
		}

		String rua = (String)attributes.get("rua");

		if (rua != null) {
			setRua(rua);
		}

		String profissao = (String)attributes.get("profissao");

		if (profissao != null) {
			setProfissao(profissao);
		}

		String hospital = (String)attributes.get("hospital");

		if (hospital != null) {
			setHospital(hospital);
		}
	}

	/**
	* Returns the primary key of this cadastro usuario.
	*
	* @return the primary key of this cadastro usuario
	*/
	public java.lang.String getPrimaryKey() {
		return _cadastroUsuario.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cadastro usuario.
	*
	* @param primaryKey the primary key of this cadastro usuario
	*/
	public void setPrimaryKey(java.lang.String primaryKey) {
		_cadastroUsuario.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cpf of this cadastro usuario.
	*
	* @return the cpf of this cadastro usuario
	*/
	public java.lang.String getCpf() {
		return _cadastroUsuario.getCpf();
	}

	/**
	* Sets the cpf of this cadastro usuario.
	*
	* @param cpf the cpf of this cadastro usuario
	*/
	public void setCpf(java.lang.String cpf) {
		_cadastroUsuario.setCpf(cpf);
	}

	/**
	* Returns the rg of this cadastro usuario.
	*
	* @return the rg of this cadastro usuario
	*/
	public java.lang.String getRg() {
		return _cadastroUsuario.getRg();
	}

	/**
	* Sets the rg of this cadastro usuario.
	*
	* @param rg the rg of this cadastro usuario
	*/
	public void setRg(java.lang.String rg) {
		_cadastroUsuario.setRg(rg);
	}

	/**
	* Returns the nome of this cadastro usuario.
	*
	* @return the nome of this cadastro usuario
	*/
	public java.lang.String getNome() {
		return _cadastroUsuario.getNome();
	}

	/**
	* Sets the nome of this cadastro usuario.
	*
	* @param nome the nome of this cadastro usuario
	*/
	public void setNome(java.lang.String nome) {
		_cadastroUsuario.setNome(nome);
	}

	/**
	* Returns the user name of this cadastro usuario.
	*
	* @return the user name of this cadastro usuario
	*/
	public java.lang.String getUserName() {
		return _cadastroUsuario.getUserName();
	}

	/**
	* Sets the user name of this cadastro usuario.
	*
	* @param userName the user name of this cadastro usuario
	*/
	public void setUserName(java.lang.String userName) {
		_cadastroUsuario.setUserName(userName);
	}

	/**
	* Returns the sobrenome of this cadastro usuario.
	*
	* @return the sobrenome of this cadastro usuario
	*/
	public java.lang.String getSobrenome() {
		return _cadastroUsuario.getSobrenome();
	}

	/**
	* Sets the sobrenome of this cadastro usuario.
	*
	* @param sobrenome the sobrenome of this cadastro usuario
	*/
	public void setSobrenome(java.lang.String sobrenome) {
		_cadastroUsuario.setSobrenome(sobrenome);
	}

	/**
	* Returns the email of this cadastro usuario.
	*
	* @return the email of this cadastro usuario
	*/
	public java.lang.String getEmail() {
		return _cadastroUsuario.getEmail();
	}

	/**
	* Sets the email of this cadastro usuario.
	*
	* @param email the email of this cadastro usuario
	*/
	public void setEmail(java.lang.String email) {
		_cadastroUsuario.setEmail(email);
	}

	/**
	* Returns the emailconfir of this cadastro usuario.
	*
	* @return the emailconfir of this cadastro usuario
	*/
	public java.lang.String getEmailconfir() {
		return _cadastroUsuario.getEmailconfir();
	}

	/**
	* Sets the emailconfir of this cadastro usuario.
	*
	* @param emailconfir the emailconfir of this cadastro usuario
	*/
	public void setEmailconfir(java.lang.String emailconfir) {
		_cadastroUsuario.setEmailconfir(emailconfir);
	}

	/**
	* Returns the senha of this cadastro usuario.
	*
	* @return the senha of this cadastro usuario
	*/
	public java.lang.String getSenha() {
		return _cadastroUsuario.getSenha();
	}

	/**
	* Sets the senha of this cadastro usuario.
	*
	* @param senha the senha of this cadastro usuario
	*/
	public void setSenha(java.lang.String senha) {
		_cadastroUsuario.setSenha(senha);
	}

	/**
	* Returns the senhaconfir of this cadastro usuario.
	*
	* @return the senhaconfir of this cadastro usuario
	*/
	public java.lang.String getSenhaconfir() {
		return _cadastroUsuario.getSenhaconfir();
	}

	/**
	* Sets the senhaconfir of this cadastro usuario.
	*
	* @param senhaconfir the senhaconfir of this cadastro usuario
	*/
	public void setSenhaconfir(java.lang.String senhaconfir) {
		_cadastroUsuario.setSenhaconfir(senhaconfir);
	}

	/**
	* Returns the celular of this cadastro usuario.
	*
	* @return the celular of this cadastro usuario
	*/
	public java.lang.String getCelular() {
		return _cadastroUsuario.getCelular();
	}

	/**
	* Sets the celular of this cadastro usuario.
	*
	* @param celular the celular of this cadastro usuario
	*/
	public void setCelular(java.lang.String celular) {
		_cadastroUsuario.setCelular(celular);
	}

	/**
	* Returns the sexo of this cadastro usuario.
	*
	* @return the sexo of this cadastro usuario
	*/
	public java.lang.String getSexo() {
		return _cadastroUsuario.getSexo();
	}

	/**
	* Sets the sexo of this cadastro usuario.
	*
	* @param sexo the sexo of this cadastro usuario
	*/
	public void setSexo(java.lang.String sexo) {
		_cadastroUsuario.setSexo(sexo);
	}

	/**
	* Returns the date of this cadastro usuario.
	*
	* @return the date of this cadastro usuario
	*/
	public java.util.Date getDate() {
		return _cadastroUsuario.getDate();
	}

	/**
	* Sets the date of this cadastro usuario.
	*
	* @param date the date of this cadastro usuario
	*/
	public void setDate(java.util.Date date) {
		_cadastroUsuario.setDate(date);
	}

	/**
	* Returns the cep of this cadastro usuario.
	*
	* @return the cep of this cadastro usuario
	*/
	public java.lang.String getCep() {
		return _cadastroUsuario.getCep();
	}

	/**
	* Sets the cep of this cadastro usuario.
	*
	* @param cep the cep of this cadastro usuario
	*/
	public void setCep(java.lang.String cep) {
		_cadastroUsuario.setCep(cep);
	}

	/**
	* Returns the estado of this cadastro usuario.
	*
	* @return the estado of this cadastro usuario
	*/
	public java.lang.String getEstado() {
		return _cadastroUsuario.getEstado();
	}

	/**
	* Sets the estado of this cadastro usuario.
	*
	* @param estado the estado of this cadastro usuario
	*/
	public void setEstado(java.lang.String estado) {
		_cadastroUsuario.setEstado(estado);
	}

	/**
	* Returns the cidade of this cadastro usuario.
	*
	* @return the cidade of this cadastro usuario
	*/
	public java.lang.String getCidade() {
		return _cadastroUsuario.getCidade();
	}

	/**
	* Sets the cidade of this cadastro usuario.
	*
	* @param cidade the cidade of this cadastro usuario
	*/
	public void setCidade(java.lang.String cidade) {
		_cadastroUsuario.setCidade(cidade);
	}

	/**
	* Returns the rua of this cadastro usuario.
	*
	* @return the rua of this cadastro usuario
	*/
	public java.lang.String getRua() {
		return _cadastroUsuario.getRua();
	}

	/**
	* Sets the rua of this cadastro usuario.
	*
	* @param rua the rua of this cadastro usuario
	*/
	public void setRua(java.lang.String rua) {
		_cadastroUsuario.setRua(rua);
	}

	/**
	* Returns the profissao of this cadastro usuario.
	*
	* @return the profissao of this cadastro usuario
	*/
	public java.lang.String getProfissao() {
		return _cadastroUsuario.getProfissao();
	}

	/**
	* Sets the profissao of this cadastro usuario.
	*
	* @param profissao the profissao of this cadastro usuario
	*/
	public void setProfissao(java.lang.String profissao) {
		_cadastroUsuario.setProfissao(profissao);
	}

	/**
	* Returns the hospital of this cadastro usuario.
	*
	* @return the hospital of this cadastro usuario
	*/
	public java.lang.String getHospital() {
		return _cadastroUsuario.getHospital();
	}

	/**
	* Sets the hospital of this cadastro usuario.
	*
	* @param hospital the hospital of this cadastro usuario
	*/
	public void setHospital(java.lang.String hospital) {
		_cadastroUsuario.setHospital(hospital);
	}

	public boolean isNew() {
		return _cadastroUsuario.isNew();
	}

	public void setNew(boolean n) {
		_cadastroUsuario.setNew(n);
	}

	public boolean isCachedModel() {
		return _cadastroUsuario.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_cadastroUsuario.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _cadastroUsuario.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _cadastroUsuario.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_cadastroUsuario.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _cadastroUsuario.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_cadastroUsuario.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new cadastroUsuarioWrapper((cadastroUsuario)_cadastroUsuario.clone());
	}

	public int compareTo(
		com.icesp.cadastro.model.cadastroUsuario cadastroUsuario) {
		return _cadastroUsuario.compareTo(cadastroUsuario);
	}

	@Override
	public int hashCode() {
		return _cadastroUsuario.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.icesp.cadastro.model.cadastroUsuario> toCacheModel() {
		return _cadastroUsuario.toCacheModel();
	}

	public com.icesp.cadastro.model.cadastroUsuario toEscapedModel() {
		return new cadastroUsuarioWrapper(_cadastroUsuario.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _cadastroUsuario.toString();
	}

	public java.lang.String toXmlString() {
		return _cadastroUsuario.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_cadastroUsuario.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public cadastroUsuario getWrappedcadastroUsuario() {
		return _cadastroUsuario;
	}

	public cadastroUsuario getWrappedModel() {
		return _cadastroUsuario;
	}

	public void resetOriginalValues() {
		_cadastroUsuario.resetOriginalValues();
	}

	private cadastroUsuario _cadastroUsuario;
}