package tn.esprit.springproject.Service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Bloc;
import tn.esprit.springproject.Repository.IBlocRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class IBlocServiceImpl implements IBlocService{
    @Autowired
    private IBlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc getBlocById(long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public List<Bloc> getAllBloc() {
        Iterable<Bloc> iterable = blocRepository.findAll();
        List<Bloc> blocList = new ArrayList<>();
        iterable.forEach(blocList::add);
        return blocList;
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBlocById(long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public List<Bloc> getBlocByCapacite(long capaciteBloc,String nomBloc){
        return blocRepository.findByCapaciteBlocGreaterThanEqualAndNomBlocContainingOrderByChambresIdChambre(capaciteBloc,nomBloc);
    }
}
