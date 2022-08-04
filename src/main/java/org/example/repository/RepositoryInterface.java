package org.example.repository;

public interface RepositoryInterface<T> {
    public void store(T t);

    public T retrieve(int id);

    public T search(String name);

    public T delete(int id);
}
