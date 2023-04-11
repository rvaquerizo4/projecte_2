package empresas.repositoris;

import org.springframework.data.jpa.repository.JpaRepository;

import empresas.entitats.Alumnes;

public interface AlumnesRepo extends JpaRepository<Alumnes, Long> {
	
}
