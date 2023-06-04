package fit.hutech.buingotruongtho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fit.hutech.buingotruongtho.model.nhanvien;

@Repository
public interface NhanVienRepository extends JpaRepository<nhanvien, String>{
}
