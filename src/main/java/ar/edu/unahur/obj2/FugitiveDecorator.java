package ar.edu.unahur.obj2;

public abstract class FugitiveDecorator implements IFugitive{
    protected IFugitive fugitive;
    public FugitiveDecorator(IFugitive fugitive) {
        this.fugitive = fugitive;
    }
    
    @Override
    public Integer getInnocence() {
        return this.fugitive.getInnocence();
    }
    
    @Override
    public Boolean isNervous() {
        return this.fugitive.isNervous();
    }
    
    @Override
    public void isNervous(Boolean b) {
        this.isNervous(b);
    }
    @Override
    public Integer getSkillLevel() {
        return this.fugitive.getSkillLevel();
    }
    @Override
    
    public Boolean isIntimidated() {
        return this.fugitive.isIntimidated();
    }

    public void setInnocence(Integer newValue) {
        this.fugitive.setInnocence(newValue);
    }

    public void isIntimidated(Boolean b) {
        this.fugitive.isIntimidated(b);
    }

    public void setSkillLevel(Integer newValue) {
        this.fugitive.setSkillLevel(newValue);
    }
}
