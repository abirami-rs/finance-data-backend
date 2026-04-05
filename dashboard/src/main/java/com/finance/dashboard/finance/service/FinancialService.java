package com.finance.dashboard.finance.service;

import com.finance.dashboard.finance.entity.FinancialRecord;
import com.finance.dashboard.finance.repository.FinancialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialService {

    private final FinancialRepository repo;

    public FinancialService(FinancialRepository repo) {
        this.repo = repo;
    }


    public FinancialRecord create(FinancialRecord r) {
        return repo.save(r);
    }

    public List<FinancialRecord> getAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}