package com.finance.dashboard.dashboard.service;

import com.finance.dashboard.finance.entity.RecordType;
import com.finance.dashboard.finance.repository.FinancialRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DashboardService {

    private final FinancialRepository repo;

    public DashboardService(FinancialRepository repo) {
        this.repo = repo;
    }

    public Map<String, Double> summary() {

        Double income = repo.sumByType(RecordType.INCOME);
        Double expense = repo.sumByType(RecordType.EXPENSE);

        if (income == null) income = 0.0;
        if (expense == null) expense = 0.0;

        Map<String, Double> map = new HashMap<>();
        map.put("income", income);
        map.put("expense", expense);
        map.put("balance", income - expense);

        return map;
    }
}