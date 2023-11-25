package tn.esprit.springproject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entity.Chambre;


import java.util.List;

@Repository
public interface IChambreRepository extends CrudRepository<Chambre, Long> {
    List<Chambre> findByNumeroChambreAndBlocNomBlocContainingOrderByNumeroChambre(long numeroChambre,String nomBloc);
}
