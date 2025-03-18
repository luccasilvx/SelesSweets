package com.leads.SelesSweets.repositories;

import com.leads.SelesSweets.models.Evaluation;
import com.leads.SelesSweets.models.projection.EvaluationProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {

    @Query("SELECT e.purchased_products AS purchased_products, e.flavor_quality AS flavor_quality, " +
            "e.product_variety AS product_variety, e.service_quality AS service_quality, " +
            "e.delivery_rating AS delivery_rating, e.favorite_aspect AS favorite_aspect, " +
            "e.improvement_suggestion AS improvement_suggestion FROM Evaluation e")
    List<EvaluationProjection> findAllEvaluations();
}
