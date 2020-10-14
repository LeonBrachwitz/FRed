package de.brachwitz.leon.fred.model.domain;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.UUID;

@Converter(autoApply = true)
public class UuidKonvertierer implements AttributeConverter<UUID, String>
{
    @Override
    public String convertToDatabaseColumn(final UUID uuid)
    {
        return uuid == null ? null : uuid.toString();
    }

    @Override
    public UUID convertToEntityAttribute(final String uuid)
    {
        return uuid == null ? null : UUID.fromString(uuid);
    }
}
