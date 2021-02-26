package com.csr.factory.method;


import com.csr.factory.simple.Operation;

/**
 * 工厂接口
 * 
 * @author liu yuning
 *
 */
public interface IFactory {
    public Operation createOperation();
}
