package padroescomportamentais.chainofresponsability;

public class TipoContratoHistorico implements TipoContrato {

    private static TipoContratoHistorico tipoDocumentoHistorico = new TipoContratoHistorico();

    private TipoContratoHistorico() {};
    
    public static TipoContratoHistorico getTipoDocumentoHistorico() {
        return tipoDocumentoHistorico;
    }

}
