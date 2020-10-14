package de.brachwitz.leon.fred.model.domain;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Embeddable;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Embeddable
public class Primaerschluessel implements Serializable {
    private static final long serialVersionUID = 9021668319861827003L;

    @Column(columnDefinition = "VARCHAR(36)")
    @Convert(converter = UuidKonvertierer.class)
    private UUID id;

    public Primaerschluessel() {
        this(UUID.randomUUID());
    }

    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Primaerschluessel other = (Primaerschluessel) obj;
        return Objects.equal(getId(), other.getId());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", getId())
                .toString();
    }
}
