package tn.esprit.springproject.Service;


import tn.esprit.springproject.Entity.Bloc;

import java.util.List;

public interface IBlocService  {
    public Bloc addBloc(Bloc bloc);
    public Bloc getBlocById(long idBloc);
    public List<Bloc> getAllBloc();
    public Bloc updateBloc(Bloc bloc);
    public void deleteBlocById(long idBloc);
    public List<Bloc> getBlocByCapacite(long capaciteBloc,String nomBloc);

}
