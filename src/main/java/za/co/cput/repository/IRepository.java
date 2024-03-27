package za.co.cput.repository;

/*
IRepository.java
IRepository class
Author: Anathi Mhlom (220006695)
Date: 24 March 2024
*/
public interface IRepository<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}