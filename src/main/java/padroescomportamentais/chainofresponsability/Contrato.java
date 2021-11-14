package padroescomportamentais.chainofresponsability;

public class Contrato {

    private TipoContrato tipoContrato;

    public Contrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    
    public TipoContrato getTipoDocumento() {
        return tipoContrato;
    }

    public void setTipoDocumento(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    
}
