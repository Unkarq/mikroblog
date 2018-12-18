package com.sda.gda17.demo.service;

import com.sda.gda17.demo.mapper.WpisMapper;
import com.sda.gda17.demo.model.Wpis;
import com.sda.gda17.demo.model.dto.WpisDto;
import com.sda.gda17.demo.repository.WpisRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.stream.Collectors;
@Log
@Service
public class WpisService {
@Autowired
    private WpisRepository wpisRepository;
@Autowired
private WpisMapper wpisMapper;

    public Optional<Wpis> addWpis(WpisDto wpisDto) {
        Wpis wpis = wpisMapper.wpisDtoToWpis(wpisDto);

        try {
            return Optional.of(wpisRepository.saveAndFlush(wpis));
        } catch (Exception cvee) {
            log.log(Level.SEVERE, "Duplikat studenta.");
        }
        return Optional.empty();
    }

    public List<WpisDto> getAll() {
        return wpisRepository.findAll().stream()
                .map(wpis -> wpisMapper.wpisToWpisDto(wpis))
                .collect(Collectors.toList());
    }

    public void remove(Long studentId) {
        wpisRepository.deleteById(studentId);
    }
}



