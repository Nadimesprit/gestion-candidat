package tn.esprit.ms1gestioncandidat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ms1gestioncandidat.entities.Candidat;
import tn.esprit.ms1gestioncandidat.services.CandidatService;

import java.util.List;

@RequestMapping(value = "/API1/GestionCandidat")
@RestController
public class CandidatController {
    @Autowired
    CandidatService candidatService ;

    @GetMapping("/getAll")
    public List<Candidat> getAll (){
        return candidatService.getAll() ;
    }

    @PostMapping("/add")
    public Candidat addCandidat(@RequestBody Candidat candidat) {
        return candidatService.addCandidat(candidat);
    }
}
