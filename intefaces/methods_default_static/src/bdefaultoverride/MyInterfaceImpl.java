package bdefaultoverride;

import adefault.MyInterface;

public class MyInterfaceImpl implements MyInterface {

    @Override
    public void myAbstractMethod() {
        System.out.println("Inside the implemented abstract method.");
    }

    // sobre escribir default method de la interface
    @Override
    public void myDefaultMethod(){
        System.out.println("Inside overrided default method");
    }
}
