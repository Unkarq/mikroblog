package com.sda.gda17.demo.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Wpis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tekst;
    private boolean status;
    @Enumerated(value = EnumType.STRING)
    private TypWpisu typWpisu;
    @CreationTimestamp
    private LocalDateTime dataWpisu;
}
