package com.leads.SelesSweets.services.dashboard;

import com.leads.SelesSweets.models.projection.EvaluationProjection;
import com.leads.SelesSweets.repositories.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {

    @Autowired
    private EvaluationRepository evaluationRepository;

    public List<EvaluationProjection> projectionList = this.evaluationRepository.findAllEvaluations();
}
