package com.icesp.cadastro.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.portlet.PortletRequest;

import com.icesp.cadastro.model.Hospital;
import com.icesp.cadastro.model.ProfissaoIcesp;
import com.icesp.cadastro.model.Usuario;
import com.icesp.cadastro.model.cadastroUsuario;
import com.icesp.cadastro.service.cadastroUsuarioLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Organization;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;

import br.org.tedbrasil.service.ProfissaoLocalServiceUtil;

@ManagedBean
@ViewScoped
public class CadastroBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuario usuario = new Usuario();
	private List<Hospital> listaHospital = new ArrayList<Hospital>();
	private Hospital hospital = new Hospital();
	private List<ProfissaoIcesp> listaProfissao = new ArrayList<ProfissaoIcesp>();
	private ProfissaoIcesp profissaoIcesp = new ProfissaoIcesp();
	boolean editarCadatro;
	FacesContext context = FacesContext.getCurrentInstance();
	PortletRequest portletRequest = (PortletRequest) context.getExternalContext().getRequest();
	ThemeDisplay themeDisplay = (ThemeDisplay) portletRequest.getAttribute(WebKeys.THEME_DISPLAY);
	
	@PostConstruct
	public void init() {
		usuario = new Usuario();
		setEditarCadatro(false);
		listaHospital = new ArrayList<Hospital>();
		listaProfissao = new ArrayList<ProfissaoIcesp>();
		carregaComboOrganization();
		carregaComboProfissao();

	}

	public List<Hospital> carregaComboOrganization() {
		try {
			listaHospital = new ArrayList<Hospital>();
			List<Organization> organization = OrganizationLocalServiceUtil.getOrganizations(0, Integer.MAX_VALUE);
			for (Organization organization2 : organization) {
				hospital = new Hospital();
				hospital.setId(String.valueOf(organization2.getOrganizationId()));
				hospital.setNome(organization2.getName());
				listaHospital.add(hospital);
			}

		} catch (SystemException e) {
			e.printStackTrace();
		}
		return listaHospital;

	}

	public List<ProfissaoIcesp> carregaComboProfissao() {
		try {
			listaProfissao = new ArrayList<ProfissaoIcesp>();
			List<br.org.tedbrasil.model.Profissao> profissao = ProfissaoLocalServiceUtil.getProfissaos(0,
					Integer.MAX_VALUE);
			for (br.org.tedbrasil.model.Profissao profissao2 : profissao) {
				profissaoIcesp = new ProfissaoIcesp();
				profissaoIcesp.setId(String.valueOf(profissao2.getIdProfissao()));
				profissaoIcesp.setNome(profissao2.getNome());
				listaProfissao.add(profissaoIcesp);
			}

		} catch (SystemException e) {
			e.printStackTrace();
		}
		return listaProfissao;

	}

	public void editar() {
		try {
			cadastroUsuario editarCadastro = cadastroUsuarioLocalServiceUtil.getcadastroUsuario(themeDisplay.getUser().getScreenName());
			usuario.setCpf(editarCadastro.getCpf());
			usuario.setRg(editarCadastro.getRg());
			usuario.setNome(editarCadastro.getNome());
			usuario.setSobrenome(editarCadastro.getSobrenome());
			usuario.setEmail(editarCadastro.getEmail());
			usuario.setEmailconfir(editarCadastro.getEmailconfir());
			usuario.setSenha(editarCadastro.getSenha());
			usuario.setSenhaconfir(editarCadastro.getSenhaconfir());
			usuario.setCelular(editarCadastro.getCelular());
			usuario.setSexo(Integer.valueOf(editarCadastro.getSexo()));
			usuario.setDate(editarCadastro.getDate());
			usuario.setCep(editarCadastro.getCep());
			usuario.setEstado(editarCadastro.getEstado());
			usuario.setCidade(editarCadastro.getCidade());
			usuario.setRua(editarCadastro.getRua());
			usuario.setProfissao(editarCadastro.getProfissao());
			usuario.setHospital(editarCadastro.getHospital());
			setEditarCadatro(true);

		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void salvar() {
		try {

			if (editarCadatro) {
				cadastroUsuario editarCadastro = cadastroUsuarioLocalServiceUtil.getcadastroUsuario(usuario.getCpf());
				editarCadastro.setRg(usuario.getRg());
				editarCadastro.setNome(usuario.getNome());
				editarCadastro.setSobrenome(usuario.getSobrenome());
				editarCadastro.setEmail(usuario.getEmail());
				editarCadastro.setEmailconfir(usuario.getEmailconfir());
				editarCadastro.setSenha(usuario.getSenha());
				editarCadastro.setSenhaconfir(usuario.getSenhaconfir());
				editarCadastro.setCelular(usuario.getCelular());
				editarCadastro.setSexo(String.valueOf(usuario.getSexo()));
				editarCadastro.setDate(usuario.getDate());
				editarCadastro.setCep(usuario.getCep());
				editarCadastro.setEstado(usuario.getEstado());
				editarCadastro.setCidade(usuario.getCidade());
				editarCadastro.setRua(usuario.getRua());
				editarCadastro.setProfissao(usuario.getProfissao());
				editarCadastro.setHospital(usuario.getHospital());
				cadastroUsuarioLocalServiceUtil.updatecadastroUsuario(editarCadastro);
			} else {
				cadastroUsuario cadastro = cadastroUsuarioLocalServiceUtil.createcadastroUsuario(usuario.getCpf());
				cadastro.setRg(usuario.getRg());
				cadastro.setNome(usuario.getNome());
				cadastro.setSobrenome(usuario.getSobrenome());
				cadastro.setEmail(usuario.getEmail());
				cadastro.setEmailconfir(usuario.getEmailconfir());
				cadastro.setSenha(usuario.getSenha());
				cadastro.setSenhaconfir(usuario.getSenhaconfir());
				cadastro.setCelular(usuario.getCelular());
				cadastro.setSexo(String.valueOf(usuario.getSexo()));
				cadastro.setDate(usuario.getDate());
				cadastro.setCep(usuario.getCep());
				cadastro.setEstado(usuario.getEstado());
				cadastro.setCidade(usuario.getCidade());
				cadastro.setRua(usuario.getRua());
				cadastro.setProfissao(usuario.getProfissao());
				cadastro.setHospital(usuario.getHospital());
				cadastroUsuarioLocalServiceUtil.addcadastroUsuario(cadastro);
			}

		} catch (Exception e) {
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Hospital> getListaHospital() {
		return listaHospital;
	}

	public void setListaHospital(List<Hospital> listaHospital) {
		this.listaHospital = listaHospital;
	}

	public ProfissaoIcesp getProfissaoIcesp() {
		return profissaoIcesp;
	}

	public void setProfissaoIcesp(ProfissaoIcesp profissaoIcesp) {
		this.profissaoIcesp = profissaoIcesp;
	}

	public List<ProfissaoIcesp> getListaProfissao() {
		return listaProfissao;
	}

	public void setListaProfissao(List<ProfissaoIcesp> listaProfissao) {
		this.listaProfissao = listaProfissao;
	}

	public boolean isEditarCadatro() {
		return editarCadatro;
	}

	public void setEditarCadatro(boolean editarCadatro) {
		this.editarCadatro = editarCadatro;
	}

}
