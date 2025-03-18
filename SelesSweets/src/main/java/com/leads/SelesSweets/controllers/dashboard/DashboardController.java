package com.leads.SelesSweets.controllers.dashboard;

import com.leads.SelesSweets.models.User;
import com.leads.SelesSweets.models.projection.EvaluationProjection;
import com.leads.SelesSweets.services.dashboard.DashboardService;
import com.leads.SelesSweets.services.dashboard.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    private DashboardService dashboardServiceservice;

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public ResponseEntity<List<EvaluationProjection>> ProjectionList(){
        return ResponseEntity.ok(dashboardServiceservice.getProjectionList());
    }

    @GetMapping("/user")
    public ResponseEntity<User> finById(@PathVariable Long id){
        var user = userService.findById(id);
        return ResponseEntity.ok(user);
    }
}
