package ar.edu.unahur.obj2;

import java.util.List;

public abstract class Hunter {
    private Integer experience;
    private final List<Fugitive> captured;

    public Hunter(Integer experience, List<Fugitive> captured) {
        this.experience = experience;
        this.captured = captured;
    }

    public Integer huntingPower() {
        return 20;
    }
    public void capture(Zone aZone) {
        aZone.getFugitives().stream().forEach(fugitive -> {
            this.capture(aZone, fugitive);}
        );
    }
    
    public void capture(Zone aZone, Fugitive aFugitive) {
        if (this.experience < aFugitive.getInnocence()) {
            this.intimidate(aFugitive);
        }
        else {
            aZone.removeFugitive(aFugitive);

            this.experience += aZone.getMinimumSkillOfIntimidated() + 2 * this.captured.size();
        }
    }
    private void intimidate(Fugitive aFugitive) {
        aFugitive.setInnocence(Math.max(0, aFugitive.getInnocence() - 2));
        aFugitive.isIntimidated();
    }

}
