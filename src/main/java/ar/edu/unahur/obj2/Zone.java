package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zone {
    private String name;
    private final List<CommonFugitive> fugitives;
    private final List<Hunter> hunters;

    public Zone(String name, List<CommonFugitive> fugitives, List<Hunter> hunters) {
        this.name = name;
        this.fugitives = new ArrayList<>(fugitives);
        this.hunters = new ArrayList<>(hunters);
    }

    public List<CommonFugitive> getFugitives() {
        return Collections.unmodifiableList(this.fugitives);
    }
    public List<CommonFugitive> getFugitivesIntimidated() {
        return this.fugitives.stream()
                .filter(CommonFugitive::isIntimidated)
                .toList();
    }
    public void removeFugitive(CommonFugitive aFugitive) {   
        fugitives.remove(aFugitive);
    }

    public Integer getMinimumSkillOfIntimidated() {
        return this.getFugitivesIntimidated().stream()
                .mapToInt(CommonFugitive::getSkillLevel).min()
                .orElse(0);
    }

}
