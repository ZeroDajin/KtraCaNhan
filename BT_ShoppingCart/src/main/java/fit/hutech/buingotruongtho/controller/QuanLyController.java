package fit.hutech.buingotruongtho.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fit.hutech.buingotruongtho.model.nhanvien;
import fit.hutech.buingotruongtho.model.phongban;
import fit.hutech.buingotruongtho.repository.NhanVienRepository;
import fit.hutech.buingotruongtho.repository.PhongBanRepository;

@Controller
@RequestMapping("nhanvien")
public class QuanLyController {
    @Autowired
    private NhanVienRepository nhanVienRepository;
    @Autowired
    private PhongBanRepository phongBanRepository;
    @GetMapping("view")
    public String index(Model model){
        List<nhanvien> listNhanvien = nhanVienRepository.findAll();
        for(nhanvien i:listNhanvien)
        {
            phongban PhongBan = phongBanRepository.findById(i.getPhongbans().getMa_phong()).orElse(null);
            if(PhongBan!=null)
                i.setPhongbans(PhongBan);
        }
        model.addAttribute("listNhanVien",listNhanvien);
        return "view_productlist";
    }
    @GetMapping("addnew")
    public String showNewProductForm(Model model){
        nhanvien product = new nhanvien();
        model.addAttribute("product",product);
        return "new_product";
    }
    @PostMapping("save")
    public String saveProduct(@ModelAttribute("nhanvien") nhanvien product)
    {
        nhanVienRepository.save(product);
        return "redirect:/nhanvien/view";
    }
    @GetMapping("remove/{id}")
    public String removeItem(@PathVariable("id") String ma_nv){
        nhanVienRepository.deleteById(ma_nv);
        return "redirect:/nhanvien/view";
    }
    @GetMapping("update/{id}")
    public String updateNV(@PathVariable("id") String ma_nv,Model model)
    {
        nhanvien find = nhanVienRepository.getById(ma_nv);
        model.addAttribute("nhanvien", find);
        return "update_nhanvien";
    }
    @PostMapping("update")
    public String updateNV(nhanvien nhanviend,Model model){
        nhanVienRepository.save(nhanviend);
        return "redirect:/nhanvien/view";
    }
}
