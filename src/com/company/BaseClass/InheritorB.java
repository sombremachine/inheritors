package com.company.BaseClass;

public class InheritorB extends BaseClass {
    public InheritorB(String name) {
        super(name);
    }

    @Override
    public void whoAmI() {
        somePrint("Print name form same package " + name);
    }
}
