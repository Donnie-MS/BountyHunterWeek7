package ar.edu.unahur.obj2;

import java.util.List;

public class RuralHunter extends Hunter{
    public RuralHunter(Integer experience, List<Fugitive> captured) {
        super(experience, captured);
    }

    @Override
    protected Boolean specificCondition(Fugitive aFugitive) {
        return aFugitive.isNervous(); 
    }

    @Override
    protected void specificIntimidation(Fugitive aFugitive) {
        aFugitive.isNervous(true);
    }
}
