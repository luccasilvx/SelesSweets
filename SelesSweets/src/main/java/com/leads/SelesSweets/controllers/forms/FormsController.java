package com.leads.SelesSweets.controllers.forms;

import com.leads.SelesSweets.models.DTO.FormsDTO;
import com.leads.SelesSweets.models.Evaluation;
import com.leads.SelesSweets.services.forms.FormsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FormsController {

    private FormsService service;

    @PostMapping
    public ResponseEntity<Evaluation> saveForms(@RequestBody FormsDTO dto){
        Evaluation newEvaluation = service.saveForms(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newEvaluation);
    }
}
