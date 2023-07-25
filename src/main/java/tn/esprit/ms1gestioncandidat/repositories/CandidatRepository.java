package tn.esprit.ms1gestioncandidat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ms1gestioncandidat.entities.Candidat;

@Repository
public interface CandidatRepository extends JpaRepository<Candidat, Integer> {
}
