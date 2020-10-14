package de.brachwitz.leon.fred.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;

public abstract class JpaRepository
{
    @PersistenceContext
    protected EntityManager entityManager;

    public CriteriaBuilder createCriteriaBuilder()
    {
        return entityManager.getCriteriaBuilder();
    }
}
