package com.csr.factory.method;

import com.csr.factory.simple.Operation;
import com.csr.factory.simple.OperationSub;

public class SubFactory implements  IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
