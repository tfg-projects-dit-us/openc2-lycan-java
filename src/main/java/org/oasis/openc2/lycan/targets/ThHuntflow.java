package org.oasis.openc2.lycan.targets;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Map;
/**
 * Extensión para el perfil threat hunting
 * ThHuntflow
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ThHuntflow {
    private String id;
    private String name;
    private Map<String, Object> args; // Para enviar parámetros dinámicos al flujo

    public ThHuntflow() {
    }

    public ThHuntflow(String id) {
        this.id = id;
    }

    public ThHuntflow(String id, Map<String, Object> args) {
        this.id = id;
        this.args = args;
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

    public Map<String, Object> getArgs() {
        return args;
    }

    public void setArgs(Map<String, Object> args) {
        this.args = args;
    }
}