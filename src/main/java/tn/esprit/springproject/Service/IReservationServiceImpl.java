package tn.esprit.springproject.Service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Reservation;
import tn.esprit.springproject.Repository.IReservationRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class IReservationServiceImpl implements IReservationService{
    @Autowired
    private IReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservationById(String idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public List<Reservation> getAllReservation() {
        Iterable<Reservation> iterable = reservationRepository.findAll();
        List<Reservation> reservationList = new ArrayList<>();
        iterable.forEach(reservationList::add);
        return reservationList;
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }


    @Override
    public void deleteReservationById(String idReservation) {reservationRepository.deleteById(idReservation);}

    @Override
    public List<Reservation> getReservationValide() {
        return reservationRepository.findByEstValideTrueOrderByEtudiantsCin();
    }
}
