package ar.edu.unahur.obj2;

import java.util.List;

public class StealthyHunter extends Hunter{
    public StealthyHunter(Integer experience, List<Fugitive> captured) {
        super(experience, captured);
    }

    @Override
    protected Boolean specificCondition(Fugitive aFugitive) {
        return aFugitive.getSkillLevel() < 50;
    }

    @Override
    protected void specificIntimidation(Fugitive aFugitive) {
        aFugitive.setSkillLevel(aFugitive.getSkillLevel() - 5);
    }
}
