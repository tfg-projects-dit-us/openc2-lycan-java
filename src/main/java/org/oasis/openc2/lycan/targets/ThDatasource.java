package org.oasis.openc2.lycan.targets;
/**
 * Extensión para el perfil threat hunting
 * 
 */
public class ThDatasource {
    private String name;

    public ThDatasource() {}
    public ThDatasource(String name) { this.name = name; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}