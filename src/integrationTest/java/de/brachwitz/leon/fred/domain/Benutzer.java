package de.brachwitz.leon.fred.domain;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Data
@Entity
public class Benutzer implements Serializable
{
    private static final long serialVersionUID = -4264995861374731836L;

    @EmbeddedId
    private Primaerschluessel id;
    private String name;
}
