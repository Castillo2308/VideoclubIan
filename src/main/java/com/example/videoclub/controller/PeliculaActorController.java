package com.example.videoclub.controller;

import com.example.videoclub.entity.Actor;
import com.example.videoclub.entity.Pelicula;
import com.example.videoclub.entity.PeliculaActor;
import com.example.videoclub.entity.PeliculaActorId;
import com.example.videoclub.repository.ActorRepository;
import com.example.videoclub.repository.PeliculaActorRepository;
import com.example.videoclub.repository.PeliculaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pelicula-actor")
public class PeliculaActorController {

    private final PeliculaActorRepository relationRepository;
    private final PeliculaRepository peliculaRepository;
    private final ActorRepository actorRepository;

    public PeliculaActorController(PeliculaActorRepository relationRepository,
                                   PeliculaRepository peliculaRepository,
                                   ActorRepository actorRepository) {
        this.relationRepository = relationRepository;
        this.peliculaRepository = peliculaRepository;
        this.actorRepository = actorRepository;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("relaciones", relationRepository.findAll());
        return "pelicula_actor/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("peliculas", peliculaRepository.findAll());
        model.addAttribute("actores", actorRepository.findAll());
        return "pelicula_actor/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@RequestParam Integer codigoPelicula,
                          @RequestParam Integer codigoActor) {
        Pelicula pelicula = peliculaRepository.findById(codigoPelicula).orElse(null);
        Actor actor = actorRepository.findById(codigoActor).orElse(null);

        PeliculaActorId id = new PeliculaActorId();
        id.setCodigoPelicula(codigoPelicula);
        id.setCodigoActor(codigoActor);

        PeliculaActor relacion = new PeliculaActor();
        relacion.setId(id);
        relacion.setPelicula(pelicula);
        relacion.setActor(actor);

        relationRepository.save(relacion);
        return "redirect:/pelicula-actor";
    }

    @GetMapping("/eliminar")
    public String eliminar(@RequestParam Integer codigoPelicula,
                           @RequestParam Integer codigoActor) {
        PeliculaActorId id = new PeliculaActorId();
        id.setCodigoPelicula(codigoPelicula);
        id.setCodigoActor(codigoActor);
        relationRepository.deleteById(id);
        return "redirect:/pelicula-actor";
    }
}
