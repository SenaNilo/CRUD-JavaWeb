package com.projetoP2.NiloInvestimentos.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projetoP2.NiloInvestimentos.model.Ativo;
import com.projetoP2.NiloInvestimentos.model.AtivoTpoAtivoDTO;
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
    public String carteiraVirtual(Model model){
        AtivoService as = context.getBean(AtivoService.class);
        List<Map<String,Object>> ls = as.obterListaAtivosValores();
        List<AtivoTpoAtivoDTO> lsAtivos = new ArrayList<>();

        for(Map<String,Object> registro : ls){
            
            String tpAtivo = (String) registro.get("tp_ativo");
            String nmAtivo = (String) registro.get("nm_ativo");
            BigDecimal vlAtivos = (BigDecimal) registro.get("vl_ativos");
            BigDecimal vlReal = (BigDecimal) registro.get("vl_real");
            int idAtivo = ((Number) registro.get("id_ativo")).intValue();
            
            lsAtivos.add(new AtivoTpoAtivoDTO(tpAtivo, nmAtivo, vlAtivos, vlReal, idAtivo));

        }

    
        model.addAttribute("ativos", lsAtivos);
        return "carteira-virtual";
    }

    @GetMapping("/adicionar")
    public String adicionarAtivo(Model model){
        model.addAttribute("ativo", new Ativo(0, new BigDecimal(0), new BigDecimal(0)));
        
        return "adicionar-ativo";
    }

    @PostMapping("/adicionar")
    public String cadastrar(@RequestParam("id_tpAtivo") int id_tpAtivo,
                        @RequestParam("vl_ativos") BigDecimal vl_ativos,
                        @RequestParam("vl_real") BigDecimal vl_real, Model model){

        Ativo atv = new Ativo(id_tpAtivo, vl_ativos, vl_real);
        AtivoService as = context.getBean(AtivoService.class);
        as.inserir(atv);
        
        return "redirect:/carteira";
    }

    @GetMapping("/atualizar/{idAtivo}")
    public String atualizar(Model model, @PathVariable int idAtivo){
        AtivoService as = context.getBean(AtivoService.class);
        Ativo atv = as.obterAtivo(idAtivo);
        // System.out.println("ID COMO PARAMTERO: " + idAtivo);

        model.addAttribute("idAtivo", idAtivo);
        model.addAttribute("ativo", atv);

        return "atualizar";
    }

    @PostMapping("/atualizar/{idAtivo}")
    public String atualizar(@PathVariable int idAtivo, @ModelAttribute Ativo atv){
        AtivoService as = context.getBean(AtivoService.class);
        as.atualizarAtivo(idAtivo, atv);
        return "redirect:/carteira";
    }

    @PostMapping("/deletar/{idAtivo}")
    public String deletar(@PathVariable int idAtivo){
        AtivoService as = context.getBean(AtivoService.class);
        as.deletarAtivo(idAtivo);

        return "redirect:/carteira";
    }
}
