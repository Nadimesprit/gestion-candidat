package tn.esprit.ms1gestioncandidat.services;


import tn.esprit.ms1gestioncandidat.entities.Candidat;

import java.util.List;

public interface CandidatService {
    public List<Candidat> getAll();
    public Candidat addCandidat(Candidat candidat);
}
