package practica5.adapter;

public class AdaptadorArtefactosGrandes implements ArtefactosElectronicosPequenos{

    private ArtefactosElectronicosGrandes artefacto;

    public ArtefactosElectronicosGrandes getArtefacto() {
        return artefacto;
    }

    public void setArtefacto(ArtefactosElectronicosGrandes artefacto) {
        this.artefacto = artefacto;
    }

    @Override
    public int precio() {
        return artefacto.costo();
    }

    @Override
    public int tiempoDeVida() {
        return artefacto.tiempoGarantia();
    }
}
