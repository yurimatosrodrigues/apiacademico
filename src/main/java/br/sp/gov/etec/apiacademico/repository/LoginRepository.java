package br.sp.gov.etec.apiacademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.sp.gov.etec.apiacademico.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Long>{

}
