package com.projetoP2.NiloInvestimentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projetoP2.NiloInvestimentos.model.Ativo;
import com.projetoP2.NiloInvestimentos.model.Service.AtivoService;

@Controller
public class CadastroController {

    @Autowired
    private ApplicationContext context;
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/carteira")
    public String carteiraVirtual(){
        return "carteira-virtual";
    }

    @GetMapping("/adicionar")
    public String adicionarAtivo(Model model){
        model.addAttribute("ativo", new Ativo(0, 0, 0));
        
        return "adicionar-ativo";
    }

    @PostMapping("/adicionar")
    public String cadastrar(@RequestParam("id_tpAtivo") int id_tpAtivo,
                        @RequestParam("vl_ativos") double vl_ativos,
                        @RequestParam("vl_real") double vl_real, Model model){
    Ativo atv = new Ativo(id_tpAtivo, vl_ativos, vl_real);
        System.out.println("Aqui foi ne"); //Para ver se foi
        AtivoService as = context.getBean(AtivoService.class);
        as.inserir(atv);
        
        return "carteira-virtual";
    }
}
