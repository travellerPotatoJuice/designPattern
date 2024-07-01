package org.example;

public class GroupLeader extends Handler{

    public GroupLeader(){
        super(0,Handler.NUM_ONE);
    }
    @Override
    public void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getLeaveDays() + "天" + leave.getContent());
        System.out.println("小组长审批：同意");
    }
}
