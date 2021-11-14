package padroescomportamentais.chainofresponsability;

public class FuncionarioSupervisor extends Funcionario {
    
    public FuncionarioSupervisor(Funcionario superior) {
        listaDocumentos.add(TipoContratoHistorico.getTipoDocumentoHistorico());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Sem assinatura";
    }

}
