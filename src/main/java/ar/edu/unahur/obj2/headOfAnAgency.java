package ar.edu.unahur.obj2;

import java.util.List;

public class HeadOfAnAgency {
    private final List<Hunter> hunters;
    
    public HeadOfAnAgency(List<Hunter> hunters) {
        this.hunters = hunters;
    }

    public void sendHunterToZone(Hunter aHunter, Zone aZone) {
        aHunter.capture(aZone);
    }
}
