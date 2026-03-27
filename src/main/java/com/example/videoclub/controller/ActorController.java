package com.example.videoclub.controller;

import com.example.videoclub.entity.Actor;
import com.example.videoclub.service.ActorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/actores")
public class ActorController {

    private final ActorService service;

    public ActorController(ActorService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("actores", service.listar());
        return "actores/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("actor", new Actor());
        return "actores/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Actor actor) {
        service.guardar(actor);
        return "redirect:/actores";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        model.addAttribute("actor", service.obtener(id));
        return "actores/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        service.eliminar(id);
        return "redirect:/actores";
    }
}
