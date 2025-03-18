package com.leads.SelesSweets.services.forms;

import com.leads.SelesSweets.models.DTO.FormsDTO;
import com.leads.SelesSweets.models.Evaluation;
import com.leads.SelesSweets.repositories.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormsService {

    @Autowired
    private EvaluationRepository repository;

    public Evaluation saveForms(FormsDTO dto){

        Evaluation evaluation = new Evaluation();
        evaluation.setName(dto.getName());
        evaluation.setAge(dto.getAge());
        evaluation.setEmail(dto.getEmail());
        evaluation.setPhone(dto.getPhone());
        evaluation.setPurchased_products(dto.getPurchased_products());
        evaluation.setFlavor_quality(dto.getFlavor_quality());
        evaluation.setProduct_variety(dto.getProduct_variety());
        evaluation.setService_quality(dto.getService_quality());
        evaluation.setDelivery_rating(dto.getDelivery_rating());
        evaluation.setFavorite_aspect(dto.getFavorite_aspect());
        evaluation.setImprovement_suggestion(dto.getImprovement_suggestion());

        return repository.save(evaluation);
    }
}
