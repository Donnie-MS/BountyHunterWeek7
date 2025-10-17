package ar.edu.unahur.obj2;

public class Fugitive {
    private Integer innocenceLevel;
    private Integer skillLevel;
    private Boolean isNervous;
    private Boolean isIntimidated;

    public Fugitive(Integer innocenceLevel, Integer skillLevel, Boolean isNervous, Boolean isIntimidated) {
        this.innocenceLevel = innocenceLevel;
        this.skillLevel = skillLevel;
        this.isNervous = isNervous;
        this.isIntimidated = isIntimidated;
    }

    public Integer getInnocence() {
        return this.innocenceLevel;
    }

    public Boolean isNervous() {
        return this.isNervous;
    }
    public void isNervous(Boolean b) {
        this.isNervous = b;
    }

    public Integer getSkillLevel() {
        return this.skillLevel;
    }

    public Boolean isIntimidated() {
        return this.isIntimidated;
    }

    public void setInnocence(Integer newValue) {
        innocenceLevel = newValue;
    }

    public void isIntimidated(Boolean b) {
        this.isIntimidated = b;
    }

    public void setSkillLevel(Integer newValue) {
        this.skillLevel = Math.max(0, newValue);
    }

}
