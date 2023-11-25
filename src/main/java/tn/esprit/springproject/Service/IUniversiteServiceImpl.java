package tn.esprit.springproject.Service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Universite;
import tn.esprit.springproject.Repository.IUniversiteRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class IUniversiteServiceImpl implements IUniversiteService {
    @Autowired
    private IUniversiteRepository universiteRepository;

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite getUniversiteById(long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public List<Universite> getAllUniversite() {
        Iterable<Universite> iterable = universiteRepository.findAll();
        List<Universite> universiteList = new ArrayList<>();
        iterable.forEach(universiteList::add);
        return universiteList;
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversiteById(long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite getByNomUniversite(String nomUniversite) {
        return universiteRepository.findByNomUniversite(nomUniversite);
    }

    @Override
    public Universite getByIdBloc(long idBloc) {
        return universiteRepository.findByidBloc(idBloc);
    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        return null;
    }
}
