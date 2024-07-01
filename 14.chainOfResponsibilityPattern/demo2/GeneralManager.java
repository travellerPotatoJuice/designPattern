package org.example;

public class GeneralManager extends Handler{
    public GeneralManager(){
        super(0,Handler.NUM_SEVEN);
    }
    @Override
    public void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getLeaveDays() + "天" + leave.getContent());
        System.out.println("总经理审批：同意");
    }

}
