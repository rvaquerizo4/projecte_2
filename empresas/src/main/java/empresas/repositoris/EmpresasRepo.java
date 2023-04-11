package empresas.repositoris;

import org.springframework.data.jpa.repository.JpaRepository;

import empresas.entitats.*;

public interface EmpresasRepo extends JpaRepository<Empresa, String> {}

