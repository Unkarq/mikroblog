package com.sda.gda17.demo.controller;

import com.sda.gda17.demo.model.TypWpisu;
import com.sda.gda17.demo.model.Wpis;
import com.sda.gda17.demo.model.dto.WpisDto;
import com.sda.gda17.demo.service.WpisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class WpisController {


    @Autowired
    private WpisService wpisService;

    @GetMapping("/add")
    public String getWpisForm(Model model) {
        model.addAttribute("typOpcje", TypWpisu.values());
        return "wpisForm";
    }

    @PostMapping("/addWpis")
    public String submitWpis( WpisDto wpis) {
        Optional<Wpis> wpisOptional = wpisService.addWpis(wpis);
        if (wpisOptional.isPresent()) {
            return "redirect:/add";
        }

        return "redirect:/add";
    }

    @GetMapping("/list")
    public String getWpisList(Model model) {
        model.addAttribute("wpisList", wpisService.getAll());
        return "list";
    }

    @GetMapping("/removeWpis")
    public String removeWpis(@RequestParam(name = "wpisId") Long wpisId) {
        wpisService.remove(wpisId);

        return "redirect:/list";
    }
}

