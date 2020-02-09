package com.apress.cems.scopes;

public interface ISalary {

    Integer getAmount();

    default Integer defaultMethod() {
        System.out.println("Called from here ->" + this.hashCode() );
        return 0;
    }
}
