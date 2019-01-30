package com.company.Inheritors;

import com.company.BaseClass.BaseClass;


public class InheritorA extends BaseClass {
    public InheritorA(String name) {
        super(name);
    }

    @Override
    public void whoAmI() {
        somePrint("Print name form other package" + name);
    }
}
