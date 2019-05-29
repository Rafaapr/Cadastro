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

import com.icesp.cadastro.service.cadastroUsuarioLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ln00704
 */
public class cadastroUsuarioClp extends BaseModelImpl<cadastroUsuario>
	implements cadastroUsuario {
	public cadastroUsuarioClp() {
	}

	public Class<?> getModelClass() {
		return cadastroUsuario.class;
	}

	public String getModelClassName() {
		return cadastroUsuario.class.getName();
	}

	public String getPrimaryKey() {
		return _cpf;
	}

	public void setPrimaryKey(String primaryKey) {
		setCpf(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return _cpf;
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
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

	@Override
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

	public BaseModel<?> getcadastroUsuarioRemoteModel() {
		return _cadastroUsuarioRemoteModel;
	}

	public void setcadastroUsuarioRemoteModel(
		BaseModel<?> cadastroUsuarioRemoteModel) {
		_cadastroUsuarioRemoteModel = cadastroUsuarioRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			cadastroUsuarioLocalServiceUtil.addcadastroUsuario(this);
		}
		else {
			cadastroUsuarioLocalServiceUtil.updatecadastroUsuario(this);
		}
	}

	@Override
	public cadastroUsuario toEscapedModel() {
		return (cadastroUsuario)Proxy.newProxyInstance(cadastroUsuario.class.getClassLoader(),
			new Class[] { cadastroUsuario.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		cadastroUsuarioClp clone = new cadastroUsuarioClp();

		clone.setCpf(getCpf());
		clone.setRg(getRg());
		clone.setNome(getNome());
		clone.setUserName(getUserName());
		clone.setSobrenome(getSobrenome());
		clone.setEmail(getEmail());
		clone.setEmailconfir(getEmailconfir());
		clone.setSenha(getSenha());
		clone.setSenhaconfir(getSenhaconfir());
		clone.setCelular(getCelular());
		clone.setSexo(getSexo());
		clone.setDate(getDate());
		clone.setCep(getCep());
		clone.setEstado(getEstado());
		clone.setCidade(getCidade());
		clone.setRua(getRua());
		clone.setProfissao(getProfissao());
		clone.setHospital(getHospital());

		return clone;
	}

	public int compareTo(cadastroUsuario cadastroUsuario) {
		int value = 0;

		value = getNome().compareTo(cadastroUsuario.getNome());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		cadastroUsuarioClp cadastroUsuario = null;

		try {
			cadastroUsuario = (cadastroUsuarioClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String primaryKey = cadastroUsuario.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{cpf=");
		sb.append(getCpf());
		sb.append(", rg=");
		sb.append(getRg());
		sb.append(", nome=");
		sb.append(getNome());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", sobrenome=");
		sb.append(getSobrenome());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", emailconfir=");
		sb.append(getEmailconfir());
		sb.append(", senha=");
		sb.append(getSenha());
		sb.append(", senhaconfir=");
		sb.append(getSenhaconfir());
		sb.append(", celular=");
		sb.append(getCelular());
		sb.append(", sexo=");
		sb.append(getSexo());
		sb.append(", date=");
		sb.append(getDate());
		sb.append(", cep=");
		sb.append(getCep());
		sb.append(", estado=");
		sb.append(getEstado());
		sb.append(", cidade=");
		sb.append(getCidade());
		sb.append(", rua=");
		sb.append(getRua());
		sb.append(", profissao=");
		sb.append(getProfissao());
		sb.append(", hospital=");
		sb.append(getHospital());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("com.icesp.cadastro.model.cadastroUsuario");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cpf</column-name><column-value><![CDATA[");
		sb.append(getCpf());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rg</column-name><column-value><![CDATA[");
		sb.append(getRg());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nome</column-name><column-value><![CDATA[");
		sb.append(getNome());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sobrenome</column-name><column-value><![CDATA[");
		sb.append(getSobrenome());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailconfir</column-name><column-value><![CDATA[");
		sb.append(getEmailconfir());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senha</column-name><column-value><![CDATA[");
		sb.append(getSenha());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senhaconfir</column-name><column-value><![CDATA[");
		sb.append(getSenhaconfir());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>celular</column-name><column-value><![CDATA[");
		sb.append(getCelular());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sexo</column-name><column-value><![CDATA[");
		sb.append(getSexo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date</column-name><column-value><![CDATA[");
		sb.append(getDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cep</column-name><column-value><![CDATA[");
		sb.append(getCep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estado</column-name><column-value><![CDATA[");
		sb.append(getEstado());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cidade</column-name><column-value><![CDATA[");
		sb.append(getCidade());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rua</column-name><column-value><![CDATA[");
		sb.append(getRua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>profissao</column-name><column-value><![CDATA[");
		sb.append(getProfissao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hospital</column-name><column-value><![CDATA[");
		sb.append(getHospital());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _cadastroUsuarioRemoteModel;
}