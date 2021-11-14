package padroescomportamentais.chainofresponsability;

public class TipoContratoEmprestimoinss implements TipoContrato {

    private static TipoContratoEmprestimoinss tipoDocumentoBoleto = new TipoContratoEmprestimoinss();

    private TipoContratoEmprestimoinss() {};
    
    public static TipoContratoEmprestimoinss getTipoDocumentoBoleto() {
        return tipoDocumentoBoleto;
    }
}
