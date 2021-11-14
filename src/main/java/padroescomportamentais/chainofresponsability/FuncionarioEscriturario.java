package padroescomportamentais.chainofresponsability;

public class FuncionarioEscriturario extends Funcionario {

    public FuncionarioEscriturario(Funcionario superior) {
        listaDocumentos.add(TipoContratoEmprestimopessoal.getTipoDocumentoDiploma());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Supervisor";
    }

}
