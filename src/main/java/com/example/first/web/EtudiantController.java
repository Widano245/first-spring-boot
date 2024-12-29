package com.example.first.web;

import com.example.first.entities.Etudiant;
import com.example.first.repositories.EtudiantRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EtudiantController {

    public EtudiantController(EtudiantRepository etudiantRepository){
        this.etudiantRepository = etudiantRepository;
    }
    EtudiantRepository etudiantRepository;

    @GetMapping("/etudiants")
    public List<Etudiant> allEtudiant(){ return etudiantRepository.findAll(); }

    @GetMapping("/etudiants/{id}")
    public Etudiant unEtudiant(@PathVariable Long id){
        return etudiantRepository.findById(id).get();
    }

    @PostMapping("/etudiants")
    public void creeEtudiant(@RequestBody Etudiant e){
        etudiantRepository.save(e);
    }
}
