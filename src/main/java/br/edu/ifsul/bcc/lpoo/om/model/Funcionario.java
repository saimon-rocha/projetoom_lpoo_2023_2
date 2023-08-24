
package br.edu.ifsul.bcc.lpoo.om.model;

import java.util.Calendar;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Saimon AS Rocha
 */
@Entity
@DiscriminatorValue("F")
@Table(name = "tb_funcionario")
public class Funcionario extends Pessoa {
    
    private String numero_ctps;
    private Calendar data_admissao;
    private Calendar data_demissao;

    public Funcionario() {
    }

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public Calendar getData_admmissao() {
        return data_admissao;
    }

    public void setData_admmissao(Calendar data_admmissao) {
        this.data_admissao = data_admmissao;
    }

    public Calendar getData_demissao() {
        return data_demissao;
    }

    public void setData_demissao(Calendar data_demissao) {
        this.data_demissao = data_demissao;
    }
}
