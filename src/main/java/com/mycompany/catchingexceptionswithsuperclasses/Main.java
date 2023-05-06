
package com.mycompany.catchingexceptionswithsuperclasses;

public class Main {
    public static void methodC() throws ExceptionC {
        System.out.println("inside the methodc...");
        throw new ExceptionC("my ExceptionC is thrown");
    }
}


    public static void methodB() throws ExceptionB {
        System.out.println("inside the methodB...");
        throw new ExceptionB("my ExceptionB is thrown");
    }
}
public static void main(String[] args){
System.out.println("first line...before try");
try {
        System.out.println("second line...top of try");
        methodC();
        System.out.println("third line... bottm of try");
}catch (ExceptionA ea) {
    System.out.println("...inside ExceptionC catch");
}
catch (ExceptionA ea) {
    System.out.println("fourth line...inside catch");
}
finally {
    System.out.println("fifth line...inside finally");
}
System.out.println("sixth line../. last line of main");
        }
}
}
