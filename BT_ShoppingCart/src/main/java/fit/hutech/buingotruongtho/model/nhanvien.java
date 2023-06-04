package fit.hutech.buingotruongtho.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nhanvien")
public class nhanvien {

    @Id
    @Column(nullable = false,length = 3)
    private String ma_nv;
    @Column(nullable = false,length = 100)
    private String ten_nv;
    @Column(nullable = true,length = 3)
    private String phai;
    @Column(nullable = true,length = 200)
    private String noi_sinh;
    //@Column(nullable = true,length = 2)
    //private String ma_phong;
    @Column(nullable = true)
    private int luong;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ma_phong")
    private phongban phongbans;
}