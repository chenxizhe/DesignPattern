package com.csr.factory.method;

import com.csr.factory.simple.Operation;
import com.csr.factory.simple.OperationMul;

public class MulFactory implements  IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
