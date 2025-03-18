package com.leads.SelesSweets.repositories;

import com.leads.SelesSweets.models.Evaluation;
import com.leads.SelesSweets.models.projection.EvaluationProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {
    @Query("SELECT e.purchasedProducts AS purchased_products, e.flavorQuality AS flavor_quality, " +
            "e.productVariety AS product_variety, e.serviceQuality AS service_quality, " +
            "e.deliveryRating AS delivery_rating, e.favoriteAspect AS favorite_aspect, " +
            "e.improvementSuggestion AS improvement_suggestion FROM Evaluation e")
    List<EvaluationProjection> findAllEvaluations();
}
