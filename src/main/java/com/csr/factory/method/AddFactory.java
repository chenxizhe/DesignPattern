package com.csr.factory.method;

import com.csr.factory.simple.Operation;
import com.csr.factory.simple.OperationAdd;

public class AddFactory implements  IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
