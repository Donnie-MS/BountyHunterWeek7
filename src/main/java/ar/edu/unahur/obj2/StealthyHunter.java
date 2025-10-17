package ar.edu.unahur.obj2;

import java.util.List;

public class StealthyHunter extends Hunter{
    public StealthyHunter(Integer experience, List<CommonFugitive> captured) {
        super(experience, captured);
    }

    @Override
    protected Boolean specificCondition(CommonFugitive aFugitive) {
        return aFugitive.getSkillLevel() < 50;
    }

    @Override
    protected void specificIntimidation(CommonFugitive aFugitive) {
        aFugitive.setSkillLevel(aFugitive.getSkillLevel() - 5);
    }
}
