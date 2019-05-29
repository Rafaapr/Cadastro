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

package com.icesp.cadastro.model.impl;

import com.icesp.cadastro.model.cadastroUsuario;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing cadastroUsuario in entity cache.
 *
 * @author ln00704
 * @see cadastroUsuario
 * @generated
 */
public class cadastroUsuarioCacheModel implements CacheModel<cadastroUsuario>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{cpf=");
		sb.append(cpf);
		sb.append(", rg=");
		sb.append(rg);
		sb.append(", nome=");
		sb.append(nome);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", sobrenome=");
		sb.append(sobrenome);
		sb.append(", email=");
		sb.append(email);
		sb.append(", emailconfir=");
		sb.append(emailconfir);
		sb.append(", senha=");
		sb.append(senha);
		sb.append(", senhaconfir=");
		sb.append(senhaconfir);
		sb.append(", celular=");
		sb.append(celular);
		sb.append(", sexo=");
		sb.append(sexo);
		sb.append(", date=");
		sb.append(date);
		sb.append(", cep=");
		sb.append(cep);
		sb.append(", estado=");
		sb.append(estado);
		sb.append(", cidade=");
		sb.append(cidade);
		sb.append(", rua=");
		sb.append(rua);
		sb.append(", profissao=");
		sb.append(profissao);
		sb.append(", hospital=");
		sb.append(hospital);
		sb.append("}");

		return sb.toString();
	}

	public cadastroUsuario toEntityModel() {
		cadastroUsuarioImpl cadastroUsuarioImpl = new cadastroUsuarioImpl();

		if (cpf == null) {
			cadastroUsuarioImpl.setCpf(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setCpf(cpf);
		}

		if (rg == null) {
			cadastroUsuarioImpl.setRg(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setRg(rg);
		}

		if (nome == null) {
			cadastroUsuarioImpl.setNome(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setNome(nome);
		}

		if (userName == null) {
			cadastroUsuarioImpl.setUserName(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setUserName(userName);
		}

		if (sobrenome == null) {
			cadastroUsuarioImpl.setSobrenome(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setSobrenome(sobrenome);
		}

		if (email == null) {
			cadastroUsuarioImpl.setEmail(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setEmail(email);
		}

		if (emailconfir == null) {
			cadastroUsuarioImpl.setEmailconfir(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setEmailconfir(emailconfir);
		}

		if (senha == null) {
			cadastroUsuarioImpl.setSenha(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setSenha(senha);
		}

		if (senhaconfir == null) {
			cadastroUsuarioImpl.setSenhaconfir(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setSenhaconfir(senhaconfir);
		}

		if (celular == null) {
			cadastroUsuarioImpl.setCelular(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setCelular(celular);
		}

		if (sexo == null) {
			cadastroUsuarioImpl.setSexo(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setSexo(sexo);
		}

		if (date == Long.MIN_VALUE) {
			cadastroUsuarioImpl.setDate(null);
		}
		else {
			cadastroUsuarioImpl.setDate(new Date(date));
		}

		if (cep == null) {
			cadastroUsuarioImpl.setCep(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setCep(cep);
		}

		if (estado == null) {
			cadastroUsuarioImpl.setEstado(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setEstado(estado);
		}

		if (cidade == null) {
			cadastroUsuarioImpl.setCidade(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setCidade(cidade);
		}

		if (rua == null) {
			cadastroUsuarioImpl.setRua(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setRua(rua);
		}

		if (profissao == null) {
			cadastroUsuarioImpl.setProfissao(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setProfissao(profissao);
		}

		if (hospital == null) {
			cadastroUsuarioImpl.setHospital(StringPool.BLANK);
		}
		else {
			cadastroUsuarioImpl.setHospital(hospital);
		}

		cadastroUsuarioImpl.resetOriginalValues();

		return cadastroUsuarioImpl;
	}

	public String cpf;
	public String rg;
	public String nome;
	public String userName;
	public String sobrenome;
	public String email;
	public String emailconfir;
	public String senha;
	public String senhaconfir;
	public String celular;
	public String sexo;
	public long date;
	public String cep;
	public String estado;
	public String cidade;
	public String rua;
	public String profissao;
	public String hospital;
}