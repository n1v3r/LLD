package model;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Ticket {

    String id;

    String desc;

    String userId;

    Boolean ticketStatus;

    String resolverId;

    Boolean machineVerified;

    String assigneeId;

    public Ticket(String id, String desc, String userId, Boolean ticketStatus, String resolverId, Boolean machineVerified, String assigneeId) {
        this.id = id;
        this.desc = desc;
        this.userId = userId;
        this.ticketStatus = ticketStatus;
        this.resolverId = resolverId;
        this.machineVerified = machineVerified;
        this.assigneeId = assigneeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(Boolean ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getResolverId() {
        return resolverId;
    }

    public void setResolverId(String resolverId) {
        this.resolverId = resolverId;
    }

    public Boolean getMachineVerified() {
        return machineVerified;
    }

    public void setMachineVerified(Boolean machineVerified) {
        this.machineVerified = machineVerified;
    }

    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
    }


}
