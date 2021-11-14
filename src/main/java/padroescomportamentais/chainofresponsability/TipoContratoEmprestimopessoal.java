package padroescomportamentais.chainofresponsability;

public class TipoContratoEmprestimopessoal implements TipoContrato {

    private static TipoContratoEmprestimopessoal tipoDocumentoDiploma = new TipoContratoEmprestimopessoal();

    private TipoContratoEmprestimopessoal() {};

    public static TipoContratoEmprestimopessoal getTipoDocumentoDiploma() {
        return tipoDocumentoDiploma;
    }
}
