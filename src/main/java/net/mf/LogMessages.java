package net.mf;

public class LogMessages {
    public void logMethod (Object o){
        System.out.println(">>>> running: "+o.getClass().getEnclosingMethod().getName());
    }

    public void logMethod (Object o, String s){
        System.out.println(">>>> running: "+o.getClass().getEnclosingMethod().getName()+" -- "+s);
    }
}
