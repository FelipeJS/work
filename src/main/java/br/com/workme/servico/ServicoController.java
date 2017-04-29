package br.com.workme.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.workme.user.User;
import br.com.workme.user.UserService;

@CrossOrigin
@RestController
@RequestMapping("servico")
public class ServicoController {

	@Autowired
	private ServicoRepository servicoRepository;

	@Autowired
	private UserService userService;

	@RequestMapping("/listar")
	public Servico listar() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		return servicoRepository.findByUser(user);
	}
}
