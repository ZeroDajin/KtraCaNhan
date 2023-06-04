package fit.hutech.buingotruongtho.model;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "phongban")
public class phongban {

    @Id
    @Column(nullable = false,length = 2)
    private String ma_phong;
    @Column(nullable = false,length = 30)
    private String ten_phong;

    @OneToMany(mappedBy = "phongbans",fetch=FetchType.LAZY)
    private List<nhanvien> listnhanviens;
}