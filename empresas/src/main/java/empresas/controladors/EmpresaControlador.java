package empresas.controladors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import empresas.entitats.*;
import empresas.repositoris.EmpresasRepo;

@Controller
@RequestMapping("/api/empresas")
public class EmpresaControlador {


	    @Autowired
	    private EmpresasRepo empresaRepository;	 
	    


    @GetMapping("/empresas")
    public String llistarEmpreses(Model model) {
        model.addAttribute("empresas", empresaRepository.findAll());
        return "empresas";
    }

    @GetMapping("/nova_empresa")
    public String formNovaEmpresa(Model model) {
        model.addAttribute("empresa", new Empresa());
        return "nou_empresa";
    }

    @PostMapping("/nova_empresa_add")
    public String crearNovaEmpresa(@ModelAttribute("empresa") Empresa empresa) {
        empresaRepository.save(empresa);
        return "redirect:/api/empresas/empresas";
    }
}
