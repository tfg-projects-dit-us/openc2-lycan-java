package org.oasis.openc2.lycan.targets;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * Extensión para el perfil threat hunting
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ThHunt {
    private String id;
    private String name;
    private String description;

    public ThHunt() {
    }

    public ThHunt(String id) {
        this.id = id;
    }

    public ThHunt(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}