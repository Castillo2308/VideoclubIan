package com.example.videoclub.controller;

import com.example.videoclub.entity.Cinta;
import com.example.videoclub.entity.CintaPelicula;
import com.example.videoclub.entity.CintaPeliculaId;
import com.example.videoclub.entity.Pelicula;
import com.example.videoclub.repository.CintaPeliculaRepository;
import com.example.videoclub.repository.CintaRepository;
import com.example.videoclub.repository.PeliculaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cinta-pelicula")
public class CintaPeliculaController {

    private final CintaPeliculaRepository relationRepository;
    private final CintaRepository cintaRepository;
    private final PeliculaRepository peliculaRepository;

    public CintaPeliculaController(CintaPeliculaRepository relationRepository,
                                   CintaRepository cintaRepository,
                                   PeliculaRepository peliculaRepository) {
        this.relationRepository = relationRepository;
        this.cintaRepository = cintaRepository;
        this.peliculaRepository = peliculaRepository;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("relaciones", relationRepository.findAll());
        return "cinta_pelicula/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("cintas", cintaRepository.findAll());
        model.addAttribute("peliculas", peliculaRepository.findAll());
        return "cinta_pelicula/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@RequestParam Integer codigoCinta,
                          @RequestParam Integer codigoPelicula) {
        Cinta cinta = cintaRepository.findById(codigoCinta).orElse(null);
        Pelicula pelicula = peliculaRepository.findById(codigoPelicula).orElse(null);

        CintaPeliculaId id = new CintaPeliculaId();
        id.setCodigoCinta(codigoCinta);
        id.setCodigoPelicula(codigoPelicula);

        CintaPelicula relacion = new CintaPelicula();
        relacion.setId(id);
        relacion.setCinta(cinta);
        relacion.setPelicula(pelicula);

        relationRepository.save(relacion);
        return "redirect:/cinta-pelicula";
    }

    @GetMapping("/eliminar")
    public String eliminar(@RequestParam Integer codigoCinta,
                           @RequestParam Integer codigoPelicula) {
        CintaPeliculaId id = new CintaPeliculaId();
        id.setCodigoCinta(codigoCinta);
        id.setCodigoPelicula(codigoPelicula);
        relationRepository.deleteById(id);
        return "redirect:/cinta-pelicula";
    }
}
