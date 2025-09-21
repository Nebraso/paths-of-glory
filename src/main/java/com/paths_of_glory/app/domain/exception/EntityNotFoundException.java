package com.paths_of_glory.app.domain.exception;

public class EntityNotFoundException extends RuntimeException
{
    private final long entityId;
    public EntityNotFoundException(long entityId) {
        super("Entity not found with ID: " + entityId);
        this.entityId = entityId;
    }
    long getEntityId() { return entityId; }
}