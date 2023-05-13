package org.example;

public class Singleton {
    private Singleton() {}
    //问题1：解释为什么要加 volatile?
    private volatile static Singleton INSTANCE=null;

    //问题2：对比在方法上加入synchronized的实现，说出这样做的意义
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                //问题3：为什么还要在这里加为空判断，之前不是判断过了吗
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}