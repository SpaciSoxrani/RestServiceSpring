package org.example.repository;

import java.io.IOException;

public interface IRepository<T> {
    public void store(T t) throws Exception;
    public T retrieve(int id);
    public T search(String name);
    public T delete(int id);
}
