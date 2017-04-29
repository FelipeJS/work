package br.com.workme.trabalhapara;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.workme.user.User;

@Entity
public class TrabalhaPara {

	@Id
	@Column(name = "cd_trabalha_para")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cdTrabalhaPara;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "user_id_funcionario", referencedColumnName = "user_id")
	private User userFuncionario;

	public Long getCdTrabalhaPara() {
		return cdTrabalhaPara;
	}

	public void setCdTrabalhaPara(Long cdTrabalhaPara) {
		this.cdTrabalhaPara = cdTrabalhaPara;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUserFuncionario() {
		return userFuncionario;
	}

	public void setUserFuncionario(User userFuncionario) {
		this.userFuncionario = userFuncionario;
	}
}
