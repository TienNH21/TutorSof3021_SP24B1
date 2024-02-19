package com.example.demo.controllers;

import com.example.demo.entities.GiangVien;
import com.example.demo.repositories.GiangVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class GiangVienController {
    @Autowired
    private GiangVienRepository gvRepo;

    @GetMapping("/giang-vien/index")
    public String index(Model model)
    {
        List<GiangVien> ds = gvRepo.findAll();
        model.addAttribute("data", ds);
        return "giang_vien/index";
    }

    /**
     *
     * @return Trả về giao diện Thêm mới
     */
    @GetMapping("/giang-vien/create")
    public String create()
    {
        return "giang_vien/create";
    }

    @PostMapping("/giang-vien/store")
    public String store(
        GiangVien gv
    ) {
        this.gvRepo.save(gv);
        return "redirect:/giang-vien/index";
    }

    @GetMapping("/giang-vien/delete/{id}")
    public String delete(
        @PathVariable(name="id") int id
    ) {
        this.gvRepo.deleteById(id);
        return "redirect:/giang-vien/index";
    }

    @GetMapping("/giang-vien/edit/{id}")
    public String edit(
        @PathVariable("id") GiangVien gv,
        Model model
    ) {
        model.addAttribute("gv", gv);
        return "giang_vien/edit";
    }

    @PostMapping("/giang-vien/update/{id}")
    public String update(
        @PathVariable("id") int id,
        GiangVien newValue
    ) {
        newValue.setId(id);
        this.gvRepo.save(newValue);
        return "redirect:/giang-vien/index";
    }
}
