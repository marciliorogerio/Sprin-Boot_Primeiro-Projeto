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
		// obterIniciais?nomeCompleto=João da Silva
	}

	@GetMapping("/dividirNome")
	public String[] dividirNome(@RequestParam("nomeCompleto") String nomeCompleto,
			@RequestParam("separador") String separador) {
		return nomeService.dividirNome(nomeCompleto, separador);
		// dividirNome?nomeCompleto=Maria,José,Ana&separador=,
	}

	@GetMapping("/removerEspacos")
	public String removerEspacos(@RequestParam("texto") String texto) {
		return nomeService.removerEspacos(texto);
		// removerEspacos?texto= Texto com espaços
	}

	@GetMapping("/obterParte")
	public String obterParte(@RequestParam("texto") String texto, @RequestParam("inicio") int inicio,
			@RequestParam("fim") int fim) {
		return nomeService.obterParte(texto, inicio, fim);
		// obterParte?texto=ExemploDeTexto&inicio=0&fim=7
	}

	@GetMapping("/converterMaiusculas")
	public String converterMaiusculas(@RequestParam("texto") String texto) {
		return nomeService.converterMaiusculas(texto);
		// converterMaiusculas?texto=texto pequeno
	}

	@GetMapping("/converterMinusculas")
	public String converterMinusculas(@RequestParam("texto") String texto) {
		return nomeService.converterMinusculas(texto);
		// converterMinusculas?texto=TEXTO GRANDE
	}

	@GetMapping("/verificarContem")
	public boolean verificarContem(@RequestParam("texto") String texto, @RequestParam("busca") String busca) {
		return nomeService.verificarContem(texto, busca);
		// verificarContem?texto=Esta é uma frase&busca=frase
	}
}
//Acho que foi!
