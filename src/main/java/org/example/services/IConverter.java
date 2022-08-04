package org.example.services;

public interface IConverter<T> {
    String ConvertToString(T obj);
}
