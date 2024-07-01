package org.example;

public class LeaveRequest {

    private String name;
    private int leaveDays;

    private String content;
    public LeaveRequest(String name,int leaveDays,String content){
        this.name = name;
        this.leaveDays = leaveDays;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
