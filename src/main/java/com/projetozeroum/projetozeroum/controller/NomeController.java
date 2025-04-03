package com.projetozeroum.projetozeroum.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projetozeroum.projetozeroum.service.NomeService;

@RestController
public class NomeController {

	private final NomeService nomeService;

	public NomeController(NomeService nomeService) {
		this.nomeService = nomeService;
	}

	@GetMapping("/limparNome")
	public String limparNome(@RequestParam("nome") String nome) {
		return nomeService.removerCaracteresEspeciais(nome);
	}

	@GetMapping("/obterIniciais")
	public String obterIniciais(@RequestParam("nomeCompleto") String nomeCompleto) {
		return nomeService.obterIniciais(nomeCompleto);
	}

	@GetMapping("/dividirNome")
	public String[] dividirNome(@RequestParam("nomeCompleto") String nomeCompleto,
			@RequestParam("separador") String separador) {
		return nomeService.dividirNome(nomeCompleto, separador);
	}

	@GetMapping("/removerEspacos")
	public String removerEspacos(@RequestParam("texto") String texto) {
		return nomeService.removerEspacos(texto);
	}

	@GetMapping("/obterParte")
	public String obterParte(@RequestParam("texto") String texto, @RequestParam("inicio") int inicio,
			@RequestParam("fim") int fim) {
		return nomeService.obterParte(texto, inicio, fim);
	}

	@GetMapping("/converterMaiusculas")
	public String converterMaiusculas(@RequestParam("texto") String texto) {
		return nomeService.converterMaiusculas(texto);
	}

	@GetMapping("/converterMinusculas")
	public String converterMinusculas(@RequestParam("texto") String texto) {
		return nomeService.converterMinusculas(texto);
	}

	@GetMapping("/verificarContem")
	public boolean verificarContem(@RequestParam("texto") String texto, @RequestParam("busca") String busca) {
		return nomeService.verificarContem(texto, busca);
	}
}
