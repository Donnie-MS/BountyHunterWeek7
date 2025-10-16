package ar.edu.unahur.obj2;

public abstract class Hunter {
    private Integer experience;
    public Boolean cazar() {
        return Boolean.TRUE;
    }
    public Integer poderDeCaza() {
        return 20;
    }
    public void capture(Zone aZone) {
        aZone.getFugitives().stream().forEach(f);
    }
    
    public void capture(Fugitive aFugitive) {
        if (this.experience < aFugitive.getInnocence()) {
            this.intimidate(aFugitive);
        }
        else {
            this.experience += (Mínimo valor de habilidad entre todos los intimidados ) + ( 2 * prófugos capturados)
        }
    }
    private void intimidate(Fugitive aFugitive) {
        aFugitive.setInnocence(Math.max(0, aFugitive.getInnocence() - 2));
    }

}
