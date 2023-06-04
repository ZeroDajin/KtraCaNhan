package fit.hutech.buingotruongtho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fit.hutech.buingotruongtho.model.phongban;

@Repository
public interface PhongBanRepository extends JpaRepository<phongban, String>{
    
}
