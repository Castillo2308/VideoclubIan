package com.example.videoclub.controller;



import com.example.videoclub.entity.Cinta;
import com.example.videoclub.service.CintaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cintas")
public class CintaController {

    private final CintaService service;

    public CintaController(CintaService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("cintas", service.listar());
        return "cintas/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("cinta", new Cinta());
        return "cintas/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Cinta cinta) {
        service.guardar(cinta);
        return "redirect:/cintas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        model.addAttribute("cinta", service.obtener(id));
        return "cintas/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        service.eliminar(id);
        return "redirect:/cintas";
    }
}