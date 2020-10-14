package de.brachwitz.leon.fred.model.service;

import de.brachwitz.leon.fred.model.persistence.BenutzerRepository;

import javax.inject.Inject;
import java.io.Serializable;

public class BenutzerService implements Serializable
{
    private static final long serialVersionUID = -4381871113091809991L;

    private BenutzerRepository benutzerRepository;

    @Inject
    public BenutzerService(final BenutzerRepository benutzerRepository)
    {
        this.benutzerRepository = benutzerRepository;
    }

    public String ermittleBenutzer()
    {
        return benutzerRepository.ermittleBenutzer().getUsername();
    }
}
