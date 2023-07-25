package tn.esprit.ms1gestioncandidat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ms1gestioncandidat.entities.Candidat;
import tn.esprit.ms1gestioncandidat.repositories.CandidatRepository;

import java.util.List;

@Service
public class CandidatServiceImp implements CandidatService {
    @Autowired
    CandidatRepository candidatRepository ;

    @Override
    public List<Candidat> getAll() {
        return candidatRepository.findAll();
    }
    @Override
    public Candidat addCandidat(Candidat candidat) {
        return candidatRepository.save(candidat);
    }
}
