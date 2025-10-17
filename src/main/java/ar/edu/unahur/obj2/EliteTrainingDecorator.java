package ar.edu.unahur.obj2;

public class EliteTrainingDecorator extends FugitiveDecorator{
    public EliteTrainingDecorator(IFugitive fugitive) {
        super(fugitive);
    }
    @Override
    public Boolean isNervous() {
        return false;
    }

}
