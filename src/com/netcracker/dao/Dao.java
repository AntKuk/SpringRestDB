package com.netcracker.dao;

import java.math.BigInteger;
import java.util.List;

public interface Dao<T> {
    List<T> getAllObjects();
    T getObject(BigInteger id);
    String getEntityName();
    void add(T entity);
    int deleteById(int id);
}
