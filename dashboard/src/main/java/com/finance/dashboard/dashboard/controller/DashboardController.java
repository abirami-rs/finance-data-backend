package com.finance.dashboard.dashboard.controller;

import com.finance.dashboard.dashboard.service.DashboardService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    private final DashboardService service;

    public DashboardController(DashboardService service) {
        this.service = service;
    }
    @GetMapping
    public String home() {
        return "Backend is running ";
    }
    @GetMapping("/summary")
    public Map<String, Double> summary() {
        return service.summary();
    }
}