package de.brachwitz.leon.fred.model.persistence;

import de.brachwitz.leon.fred.model.domain.Benutzer;

import java.io.Serializable;

public interface BenutzerRepository extends Serializable
{
    Benutzer ermittleBenutzer();
}
