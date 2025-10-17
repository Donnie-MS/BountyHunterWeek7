package ar.edu.unahur.obj2;

import java.util.List;

public abstract class Hunter {
    private Integer experience;
    private final List<CommonFugitive> captured;

    public Hunter(Integer experience, List<CommonFugitive> captured) {
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
    
    protected Boolean generalCondition(CommonFugitive aFugitive) {
        return this.experience < aFugitive.getInnocence();
    }

    protected abstract Boolean specificCondition(CommonFugitive aFugitive); 

    protected abstract void specificIntimidation(CommonFugitive aFugitive); 

    public void capture(Zone aZone, CommonFugitive aFugitive) {
        if (this.generalCondition(aFugitive) && this.specificCondition(aFugitive)) {
            this.intimidate(aFugitive);
        }
        else {
            aZone.removeFugitive(aFugitive);
            this.captured.add(aFugitive);

            this.experience += aZone.getMinimumSkillOfIntimidated() + 2 * this.captured.size();
        }
    }
    private void intimidate(CommonFugitive aFugitive) {
        aFugitive.setInnocence(Math.max(0, aFugitive.getInnocence() - 2));
        aFugitive.isIntimidated(true);
        this.specificIntimidation(aFugitive);

    }

}
