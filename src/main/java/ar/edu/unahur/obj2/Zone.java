package ar.edu.unahur.obj2;

import java.util.List;

public class Zone {
    private String name;
    private List<Fugitive> fugitives;
    private List<Hunter> hunters;

    public List<Fugitive> getFugitives() {
        return this.fugitives;
    }
}
