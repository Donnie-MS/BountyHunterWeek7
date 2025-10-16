package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zone {
    private String name;
    private final List<Fugitive> fugitives;
    private final List<Hunter> hunters;

    public Zone(String name, List<Fugitive> fugitives, List<Hunter> hunters) {
        this.name = name;
        this.fugitives = new ArrayList<>(fugitives);
        this.hunters = new ArrayList<>(hunters);
    }

    public List<Fugitive> getFugitives() {
        return Collections.unmodifiableList(this.fugitives);
    }
    public List<Fugitive> getFugitivesIntimidated() {
        return this.fugitives.stream()
                .filter(Fugitive::isIntimidated)
                .toList();
    }
    public void removeFugitive(Fugitive aFugitive) {   
        fugitives.remove(aFugitive);
    }

    public Integer getMinimumSkillOfIntimidated() {
        return this.getFugitivesIntimidated().stream()
                .mapToInt(Fugitive::getSkillLevel).min()
                .orElse(0);
    }

}
