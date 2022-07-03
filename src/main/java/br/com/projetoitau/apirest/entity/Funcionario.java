package br.com.projetoitau.apirest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Table(name = "tb_funcionario")
@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min = 3, message = "Nome deve conter no mínimo 3 letras")
	@Size(max = 50, message = "Nome deve conter no máximo 50 letras")
	private String nome;
	
	@NotBlank
	@Size(max = 11, message = "Nome máximo 11 números")
	@Size(min = 11, message = "Nome mínimo 11 números")
	@Column(unique = true)
	private String cpf;
	
	@NotBlank
	@Email
	@Column(unique = true)
	private String email;
	
	@NotBlank
	@Column(unique = true)
	private String senha;
}
