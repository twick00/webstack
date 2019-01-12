/*
 * This file is generated by jOOQ.
 */
package com.nthalk.workflow.db.models.tables.pojos;


import java.io.Serializable;

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
public class WorkflowState implements Serializable {

    private static final long serialVersionUID = 1414349053;

    private Integer workflowStateId;
    private Integer workflowId;
    private String  name;

    public WorkflowState() {}

    public WorkflowState(WorkflowState value) {
        this.workflowStateId = value.workflowStateId;
        this.workflowId = value.workflowId;
        this.name = value.name;
    }

    public WorkflowState(
        Integer workflowStateId,
        Integer workflowId,
        String  name
    ) {
        this.workflowStateId = workflowStateId;
        this.workflowId = workflowId;
        this.name = name;
    }

    public Integer getWorkflowStateId() {
        return this.workflowStateId;
    }

    public void setWorkflowStateId(Integer workflowStateId) {
        this.workflowStateId = workflowStateId;
    }

    public Integer getWorkflowId() {
        return this.workflowId;
    }

    public void setWorkflowId(Integer workflowId) {
        this.workflowId = workflowId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WorkflowState (");

        sb.append(workflowStateId);
        sb.append(", ").append(workflowId);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }
}
