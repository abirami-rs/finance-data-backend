package com.finance.dashboard.finance.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.finance.dashboard.finance.entity.FinancialRecord;
import com.finance.dashboard.finance.service.FinancialService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/records")
public class FinancialController {

    private final FinancialService service;

    public FinancialController(FinancialService service) {
        this.service = service;
    }

    @PostMapping
    public FinancialRecord create(@RequestBody FinancialRecord r) {
        return service.create(r);
    }

    @GetMapping
    public List<FinancialRecord> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

