package com.code4ro.legalconsultation.document.consolidated.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
public class DocumentUserAssignmentDto {
    private Set<UUID> userIds;
}
