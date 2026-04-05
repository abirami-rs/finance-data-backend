package com.finance.dashboard.finance.repository;
import com.finance.dashboard.finance.entity.FinancialRecord;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import com.finance.dashboard.finance.entity.RecordType;

public interface FinancialRepository extends JpaRepository<FinancialRecord, Long> {

    @Query("SELECT SUM(f.amount) FROM FinancialRecord f WHERE f.type = :type")
    Double sumByType(@Param("type") RecordType type);
}