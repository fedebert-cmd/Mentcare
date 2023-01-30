package it.univr.repository;

import it.univr.model.Doctor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {

    List<Doctor> findByEmail(String email);
    Doctor findById(long id);
}
