package ar.edu.unahur.obj2;



public class AdvancedMartialArtsDecorator extends FugitiveDecorator{
    public AdvancedMartialArtsDecorator(IFugitive fugitive) {
        super(fugitive);
    }

    public Integer getSkillLevel() {
        return Math.min(100, fugitive.getSkillLevel() * 2);
    }
}
