package it.univr.repository;

import it.univr.model.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PatientRepository extends CrudRepository<Patient, Long> {

    List<Patient> findByLastName(String lastName);
    Patient findPatientById(Long id);
}
