package de.brachwitz.leon.fred.persistence;

import de.brachwitz.leon.fred.model.domain.Benutzer;
import de.brachwitz.leon.fred.model.persistence.BenutzerRepository;
import lombok.NoArgsConstructor;

import javax.persistence.EntityManager;

@NoArgsConstructor
public class JpaBenutzerRepository extends JpaRepository implements BenutzerRepository
{
    public JpaBenutzerRepository(final EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    @Override
    public Benutzer ermittleBenutzer()
    {
        return entityManager.createQuery("select b FROM Benutzer b", Benutzer.class).getResultList().get(0);
    }
}
