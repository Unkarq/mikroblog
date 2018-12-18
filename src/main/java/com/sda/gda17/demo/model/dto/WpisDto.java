package com.sda.gda17.demo.model.dto;

import com.sda.gda17.demo.model.TypWpisu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WpisDto {

        private Long wpisId;
        private String wpisTekst;
        private TypWpisu wpisTypWpisu;
        private boolean wpisStatus;

}
