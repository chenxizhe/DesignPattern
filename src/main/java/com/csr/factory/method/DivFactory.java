package com.csr.factory.method;

import com.csr.factory.simple.Operation;
import com.csr.factory.simple.OperationDiv;

public class DivFactory implements  IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
