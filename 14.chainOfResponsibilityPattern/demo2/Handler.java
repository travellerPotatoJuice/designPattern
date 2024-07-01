package org.example;

/**
 * 抽象处理者
 */
public abstract class Handler {

    //请假天数
    protected final static int NUM_ONE =1;
    protected final static int NUM_THREE =3;
    protected final static int NUM_SEVEN =7;

    //可以批准的天数
    private int numStart;

    private int numEnd;

    private Handler nextHandler;

    public Handler(int numStart){
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd){
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler handler){
        nextHandler = handler;
    }

    //final防止被子类重写
    public final void submit(LeaveRequest leave){
        this.handlerLeave(leave);
        if(this.nextHandler!=null&&leave.getLeaveDays()>this.numEnd){
            this.nextHandler.submit(leave);
        }else{
            System.out.println("流程结束");
        }
    }

    public abstract void handlerLeave(LeaveRequest leave);





}
