package com.senaSoft.SenaSoftBack.Services.Dao;

import java.util.List;

public interface Idao <T, ID> {

    public List<T> findAll();
    public T getById(ID id);
    public void save(T entity);
    public void update(T entity);
    public void delete(T entity);
    public void create(T entity);
    public void delete(Long id);



}
