package com.itb.tcc.cafeteria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.tcc.cafeteria.model.Produto;

@Controller
@RequestMapping("/cafeteria/produto")

public class LojaController {
	
	List<Produto> listaDeProdutos = new ArrayList<Produto>();

	@GetMapping ("/listar")
	public String listarprodutos() {
		
		Produto p1 = new Produto();
		p1.setId(20l);
		p1.setNome("Akechi");
		p1.setDescricao("amargo");
		p1.setCodigoBarras("02061998");
		p1.setPreco(12.50);
		
		Produto p2 = new Produto();
		p2.setId(2l);
		p2.setNome("leite");
		p2.setDescricao("doce");
		p2.setCodigoBarras("15062023");
		p2.setPreco(2.50);
		
		//Adicionando os produtos à lista
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		return "produtos";
	}
}

