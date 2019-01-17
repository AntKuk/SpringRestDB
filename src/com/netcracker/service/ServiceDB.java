package com.netcracker.service;

import java.math.BigInteger;
import java.util.List;

public interface ServiceDB<T> {
    List<T> getAll();
    T getById(BigInteger id);
    String getEntityName();
}
