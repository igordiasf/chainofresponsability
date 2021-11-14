package padroescomportamentais.chainofresponsability;

public class TipoContratoEmprestimoconsignado implements TipoContrato {

    private static TipoContratoEmprestimoconsignado tipoDocumentoCertificado = new TipoContratoEmprestimoconsignado();

    private TipoContratoEmprestimoconsignado() {};

    public static TipoContratoEmprestimoconsignado getTipoDocumentoCertificado() {
        return tipoDocumentoCertificado;
    }
}
