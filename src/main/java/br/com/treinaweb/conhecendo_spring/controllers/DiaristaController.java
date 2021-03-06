package br.com.treinaweb.conhecendo_spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.conhecendo_spring.repositories.DiaristaRepository;

@Controller
@RequestMapping("/diaristas")
public class DiaristaController {
    
    @Autowired
    private DiaristaRepository repository;

    @GetMapping
    public ModelAndView buscarTodos() {
        var modelAndView = new ModelAndView("listar_diaristas");

        modelAndView.addObject("diaristas", repository.findAll());

        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView buscarById(@PathVariable Long id) {
        var modelAndView = new ModelAndView("detalhes");
        modelAndView.addObject("diarista", repository.getById(id));
        return modelAndView;

    }
}
