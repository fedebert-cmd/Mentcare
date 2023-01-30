package it.univr.repository;

import it.univr.model.Patient;
import it.univr.model.Prescription;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrescriptionRepository extends CrudRepository<Prescription, Long> {

    List<Prescription> findByPatient(Patient patient);
    Prescription findPrescriptionById(long id);
}
