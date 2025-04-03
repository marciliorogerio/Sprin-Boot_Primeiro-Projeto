package com.projetozeroum.projetozeroum.service;

import org.springframework.stereotype.Service;

@Service
public class NomeService {

	public String removerCaracteresEspeciais(String nome) {
		return nome.replaceAll("[^a-zA-Z0-9]", "");
	}

	public String obterIniciais(String nomeCompleto) {
		String[] nomes = nomeCompleto.split(" ");
		StringBuilder iniciais = new StringBuilder();
		for (String nome : nomes) {
			iniciais.append(nome.charAt(0));
		}
		return iniciais.toString();
	}

	public String[] dividirNome(String nomeCompleto, String separador) {
		return nomeCompleto.split(separador);
	}

	public String removerEspacos(String texto) {
		return texto.trim();
	}

	public String obterParte(String texto, int inicio, int fim) {
		return texto.substring(inicio, fim);
	}

	public String converterMaiusculas(String texto) {
		return texto.toUpperCase();
	}

	public String converterMinusculas(String texto) {
		return texto.toLowerCase();
	}

	public boolean verificarContem(String texto, String busca) {
		return texto.contains(busca);
	}
}
