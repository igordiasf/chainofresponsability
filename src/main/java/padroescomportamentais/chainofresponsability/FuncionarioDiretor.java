package padroescomportamentais.chainofresponsability;

public class FuncionarioDiretor extends Funcionario {

    public FuncionarioDiretor(Funcionario superior) {
        listaDocumentos.add(TipoContratoEmprestimoconsignado.getTipoDocumentoCertificado());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Diretor";
    }

}
