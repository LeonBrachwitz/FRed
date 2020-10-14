package de.brachwitz.leon.fred.view;

import de.brachwitz.leon.fred.model.service.BenutzerService;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class BenutzerController implements Serializable
{
    private static final long serialVersionUID = 7252273564369709128L;
    private BenutzerService benutzerService;

    @Inject
    public BenutzerController(final BenutzerService benutzerService)
    {
        this.benutzerService = benutzerService;
    }

    public String ermittleUser()
    {
        return benutzerService.ermittleBenutzer();
    }
}
