package it.univr.controller;

import it.univr.model.Doctor;
import it.univr.model.Drug;
import it.univr.model.Patient;
import it.univr.model.Prescription;
import it.univr.repository.DoctorRepository;
import it.univr.repository.DrugRepository;
import it.univr.repository.PatientRepository;
import it.univr.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Controller
public class MentcareController {

    private Doctor doctor;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private DrugRepository drugRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PrescriptionRepository prescriptionRepository;

    @Component
    private class InitRepository {
        InitRepository(DoctorRepository doctorRepository, DrugRepository drugRepository, PatientRepository patientRepository, PrescriptionRepository prescriptionRepository) throws ParseException {
            doctor = new Doctor("Mario", "Rossi", "rossi.mario@doc.it", "password");
            doctorRepository.save(doctor);
            Patient patient = new Patient("Luca", "Verdi", "luca.verdi@patient.it", 64, "Verona", "Italia");
            patientRepository.save(patient);
            Drug drug1 = new Drug("drug1");
            drugRepository.save(drug1);
            Drug drug2 = new Drug("drug2");
            drugRepository.save(drug2);
            Prescription prescription = new Prescription(doctor.getEmail(), drug1.getName(), patient.getEmail(), "50mg");
            prescriptionRepository.save(prescription);
        }
    }

    @RequestMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("doctor", doctor);
        return "index";
    }

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("doctor", doctor);
        return "index";
    }

    @RequestMapping("/list")
    public String getList(Model model) {
        List<Patient> listPatient = new LinkedList<>();
        for (Patient patient : patientRepository.findAll())
            listPatient.add(patient);
        model.addAttribute("patient", listPatient);
        return "list";
    }

    @RequestMapping("/input")
    public String input(){
        return "input";
    }

    @RequestMapping("/create")
    public String create(@RequestParam(name="firstname", required = true) String firstname,
                         @RequestParam(name="lastname", required = true) String lastname,
                         @RequestParam(name="email", required = true) String email,
                         @RequestParam(name="age", required = true) int age,
                         @RequestParam(name="birthplace", required = true) String birthplace,
                         @RequestParam(name="nationality", required = true) String nationality) {
        patientRepository.save(new Patient(firstname, lastname, email, age, birthplace, nationality));
        return "redirect:/list";
    }

    @RequestMapping("/edit")
    public String edit(@RequestParam(name="id", required = true) Long id,
                       Model model) {
        Optional<Patient> result = patientRepository.findById(id);
        Patient patient = result.get();
        model.addAttribute("patient", patient);
        return "edit";
    }

    @RequestMapping("/update")
    public String update(@RequestParam(name="id", required = true) Long id,
                         @RequestParam(name="firstname", required = true) String firstname,
                         @RequestParam(name="lastname", required = true) String lastname,
                         @RequestParam(name="email", required = true) String email,
                         @RequestParam(name="age", required = true) int age,
                         @RequestParam(name="birthplace", required = true) String birthplace,
                         @RequestParam(name="nationality", required = true) String nationality,
                         Model model) {
        Optional<Patient> result = patientRepository.findById(id);
        patientRepository.delete(result.get());
        Patient patient = new Patient(firstname, lastname, email, age, birthplace, nationality);
        patientRepository.save(patient);
        return "redirect:/list";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam(name="id", required = true) Long id,
                         Model model) {
        Optional<Patient> result = patientRepository.findById(id);
        patientRepository.delete(result.get());
        return "redirect:/list";
    }

    @RequestMapping("/prescription")
    public String prescription(Model model){
        List<Prescription> listPrescription = new LinkedList<>();
        for (Prescription prescription : prescriptionRepository.findAll())
            listPrescription.add(prescription);
        model.addAttribute("prescription", listPrescription);
        return "prescription";
    }

}
