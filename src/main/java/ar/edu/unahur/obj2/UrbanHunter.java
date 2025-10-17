package ar.edu.unahur.obj2;

import java.util.List;

public class UrbanHunter extends Hunter{
    public UrbanHunter (Integer experience, List<Fugitive> captured) {
        super(experience, captured);
    }

    @Override
    protected Boolean specificCondition(Fugitive aFugitive) {
        return !aFugitive.isNervous();
    }

    @Override
    protected void specificIntimidation(Fugitive aFugitive) {
        aFugitive.isNervous(false);
    }
}
