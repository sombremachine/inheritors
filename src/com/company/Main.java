package com.company;

import com.company.BaseClass.BaseClass;
import com.company.BaseClass.InheritorB;
import com.company.Inheritors.InheritorA;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseClass a = new InheritorA("InheritorA");
        BaseClass b = new InheritorB("InheritorB");

        a.whoAmI();
        b.whoAmI();
    }
}
