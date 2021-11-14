package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContratoTest {

    FuncionarioEscriturario supervisor;
    FuncionarioDiretor diretor;

    @BeforeEach
    void setUp() {
        supervisor = new FuncionarioEscriturario(null);
        diretor = new FuncionarioDiretor(supervisor);
    }

    @Test
    void deveRetornarSupervisorParaAssinaturaHistorico() {
        assertEquals("Sem assinatura", diretor.assinarDocumento(new Contrato(TipoContratoHistorico.getTipoDocumentoHistorico())));
    }


    @Test
    void deveRetornarDiretorParaAssinaturaEmprestimoinss() {
        assertEquals("Diretor", diretor.assinarDocumento(new Contrato(TipoContratoEmprestimoconsignado.getTipoDocumentoCertificado())));
    }

    @Test
    void deveRetornarSupervisorParaAssinaturaDiploma() {
        assertEquals("Supervisor", diretor.assinarDocumento(new Contrato(TipoContratoEmprestimopessoal.getTipoDocumentoDiploma())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaContrato() {
        assertEquals("Sem assinatura", diretor.getFuncionarioSuperior().assinarDocumento(new Contrato(TipoContratoEmprestimoinss.getTipoDocumentoBoleto())));
    }

}