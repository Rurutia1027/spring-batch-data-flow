package com.hql.fabric.domain.reconciliation;

import com.hql.fabric.persistence.entity.NamedArtifact;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "v2_reconciliation_result")
public class ReconciliationResult extends NamedArtifact {

    @ManyToOne
    @JoinColumn(name = "batch_id")
    private ReconciliationBatch batch;

    @Column(name = "transaction_id")
    private String transactionId;

    @ManyToOne
    @JoinColumn(name = "core_id")
    private TransactionFlowCore coreTransaction;

    @ManyToOne
    @JoinColumn(name = "clearing_id")
    private TransactionFlowClearing clearingTransaction;

    @Column(name = "match_status")
    private String matchStatus;

    private String details;

    @OneToMany(mappedBy = "result")
    private List<ReconciliationException> exceptions;
}