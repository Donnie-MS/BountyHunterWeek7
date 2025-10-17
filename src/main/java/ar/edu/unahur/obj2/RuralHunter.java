package ar.edu.unahur.obj2;

import java.util.List;

public class RuralHunter extends Hunter{
    public RuralHunter(Integer experience, List<CommonFugitive> captured) {
        super(experience, captured);
    }

    @Override
    protected Boolean specificCondition(CommonFugitive aFugitive) {
        return aFugitive.isNervous(); 
    }

    @Override
    protected void specificIntimidation(CommonFugitive aFugitive) {
        aFugitive.isNervous(true);
    }
}
