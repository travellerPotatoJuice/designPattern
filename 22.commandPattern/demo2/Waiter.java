package org.example;

import java.util.ArrayList;

public class Waiter {
    private ArrayList<Command> commands = new ArrayList<>();

    public void setCommand(Command cmd){
        commands.add(cmd);
    }

    public void orderUp(){
        System.out.println("服务员说：大厨订单来了");
        for(Command command :commands){
            if(command!=null){
                command.execute();
            }
        }
    }
}
