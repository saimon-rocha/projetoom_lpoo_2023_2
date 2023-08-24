package br.edu.ifsul.bcc.lpoo.om.test;

import br.edu.ifsul.bcc.lpoo.om.model.dao.PersistenciaJPA;
import org.junit.Test;

/**
 *
 * @author Saimon AS Rocha
 */
public class TestPersistenciaJPA {

    @Test 
    public void testConexaoGeracaoTabelas() {
        PersistenciaJPA persistencia = new PersistenciaJPA();
        if (persistencia.conexaoAberta()) {
            System.out.println("abriu a conexao com o BD via JPA");
            persistencia.fecharConexao();
            System.out.println("fechou a conexao com o BD via JPA");
        } else {
            System.out.println("Nao abriu a conexao com o BD via JPA");
        }
    }
}
