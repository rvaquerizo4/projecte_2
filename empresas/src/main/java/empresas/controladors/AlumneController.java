package empresas.controladors;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import empresas.entitats.Alumnes;
import empresas.repositoris.AlumnesRepo;
import empresas.repositoris.EmpresasRepo;

@Controller
@RequestMapping("/api")
public class AlumneController {
	 @Autowired
	    private AlumnesRepo alumneRepository;

	    @Autowired
	    private EmpresasRepo empresaRepository;

	    @GetMapping("/alumnes")
	    public String llistarAlumnes(Model model) {
	        model.addAttribute("alumnes", alumneRepository.findAll());
	        return "alumnes";
	    }

	    @GetMapping("/nou_alumne")
	    public String formNouAlumne(Model model) {
	        model.addAttribute("alumne", new Alumnes());
	        model.addAttribute("empreses", empresaRepository.findAll());
	        return "nou_alumne";
	    }

	    @PostMapping("/nou_alumne_add")
	    public String crearNouAlumne(@ModelAttribute("alumne") Alumnes alumne) {
	        alumneRepository.save(alumne);
	        return "redirect:/api/alumnes";
	    }


    @DeleteMapping("/alumnes/{id}")
    public void deleteAlumne(@PathVariable Long id) {
        alumneRepository.deleteById(id);
    }
}
