/*
 * This file is generated by jOOQ.
 */
package com.nthalk.workflow.db.models.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkflowTransitionEvent implements Serializable {

    private static final long serialVersionUID = 195566108;

    private Integer   workflowTransitionEventId;
    private Integer   workflowTransitionId;
    private String    instanceKey;
    private Timestamp transitionedAt;
    private String    data;

    public WorkflowTransitionEvent() {}

    public WorkflowTransitionEvent(WorkflowTransitionEvent value) {
        this.workflowTransitionEventId = value.workflowTransitionEventId;
        this.workflowTransitionId = value.workflowTransitionId;
        this.instanceKey = value.instanceKey;
        this.transitionedAt = value.transitionedAt;
        this.data = value.data;
    }

    public WorkflowTransitionEvent(
        Integer   workflowTransitionEventId,
        Integer   workflowTransitionId,
        String    instanceKey,
        Timestamp transitionedAt,
        String    data
    ) {
        this.workflowTransitionEventId = workflowTransitionEventId;
        this.workflowTransitionId = workflowTransitionId;
        this.instanceKey = instanceKey;
        this.transitionedAt = transitionedAt;
        this.data = data;
    }

    public Integer getWorkflowTransitionEventId() {
        return this.workflowTransitionEventId;
    }

    public void setWorkflowTransitionEventId(Integer workflowTransitionEventId) {
        this.workflowTransitionEventId = workflowTransitionEventId;
    }

    public Integer getWorkflowTransitionId() {
        return this.workflowTransitionId;
    }

    public void setWorkflowTransitionId(Integer workflowTransitionId) {
        this.workflowTransitionId = workflowTransitionId;
    }

    public String getInstanceKey() {
        return this.instanceKey;
    }

    public void setInstanceKey(String instanceKey) {
        this.instanceKey = instanceKey;
    }

    public Timestamp getTransitionedAt() {
        return this.transitionedAt;
    }

    public void setTransitionedAt(Timestamp transitionedAt) {
        this.transitionedAt = transitionedAt;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WorkflowTransitionEvent (");

        sb.append(workflowTransitionEventId);
        sb.append(", ").append(workflowTransitionId);
        sb.append(", ").append(instanceKey);
        sb.append(", ").append(transitionedAt);
        sb.append(", ").append(data);

        sb.append(")");
        return sb.toString();
    }
}
