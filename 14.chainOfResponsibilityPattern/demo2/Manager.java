package org.example;

public class Manager extends Handler{
    public Manager(){
        super(0,Handler.NUM_THREE);
    }
    @Override
    public void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getLeaveDays() + "天" + leave.getContent());
        System.out.println("部门经理审批：同意");
    }
}
