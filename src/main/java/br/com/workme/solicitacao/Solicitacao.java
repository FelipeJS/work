package br.com.workme.solicitacao;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.workme.servico.Servico;
import br.com.workme.user.User;

@Entity
public class Solicitacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cd_solicitacao")
	private Long cdSolicitacao;

	@ManyToOne
	@JoinColumn(name = "cd_servico", referencedColumnName = "cd_servico")
	private Servico servico;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User user;

	@Column(name = "dh_solicitacao")
	private Calendar dhSolicitacao;

	private String descricao;

	private String status;

	@Column(name = "motivo_recusado")
	private String motivoRecusado;

	public Long getCdSolicitacao() {
		return cdSolicitacao;
	}

	public void setCdSolicitacao(Long cdSolicitacao) {
		this.cdSolicitacao = cdSolicitacao;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Calendar getDhSolicitacao() {
		return dhSolicitacao;
	}

	public void setDhSolicitacao(Calendar dhSolicitacao) {
		this.dhSolicitacao = dhSolicitacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMotivoRecusado() {
		return motivoRecusado;
	}

	public void setMotivoRecusado(String motivoRecusado) {
		this.motivoRecusado = motivoRecusado;
	}
}
