package ar.edu.unahur.obj2;

public class LegalProtectionDecorator extends FugitiveDecorator{
    public LegalProtectionDecorator(IFugitive fugitive) {
        super(fugitive);
    }

    @Override
    public Integer getInnocence() {
        return Math.min(40, this.fugitive.getInnocence());
    }
}
