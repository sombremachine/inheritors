package com.company.BaseClass;

public abstract class BaseClass {
    protected String name;

    public BaseClass(String name) {
        this.name = name;
    }

    public abstract void whoAmI();

    protected void somePrint(String s){
        System.out.println(s);
    }
}
