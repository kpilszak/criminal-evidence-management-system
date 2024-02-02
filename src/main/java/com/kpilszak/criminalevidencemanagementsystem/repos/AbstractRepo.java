package com.kpilszak.criminalevidencemanagementsystem.repos;

import com.kpilszak.criminalevidencemanagementsystem.dao.AbstractEntity;

public interface AbstractRepo <T extends AbstractEntity> {

    void save(T entity);

    void delete(T entity);

    int deleteById(Long entityId);

    T findById(Long entityId);

}
