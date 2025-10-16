package ar.edu.unahur.obj2;

public class Fugitive {
    private Integer innocenceLevel;
    private Integer skillLevel;
    private Boolean isNervous;
    private Boolean isIntimidated;

    public Integer getInnocence() {
        return this.innocenceLevel;
    }

    public Boolean isNervous() {
        return this.isNervous;
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

}
