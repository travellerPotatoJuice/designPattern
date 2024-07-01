package org.example;


import com.sun.deploy.util.Waiter;
import sun.plugin2.os.windows.Windows;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        LeaveRequest leaveRequest = new LeaveRequest("小明",1,"生病");
        LeaveRequest leaveRequest1 = new LeaveRequest("小红",2,"生病");
        LeaveRequest leaveRequest2 = new LeaveRequest("小蓝",5,"生病");
        //创建角色与责任链
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        //进入审批流程
        groupLeader.submit(leaveRequest);
        System.out.println("==========");
        groupLeader.submit(leaveRequest1);
        System.out.println("==========");
        groupLeader.submit(leaveRequest2);
    }



}



