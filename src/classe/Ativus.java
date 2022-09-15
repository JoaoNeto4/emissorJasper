

package classe;


public class Ativus {
    private String valor;
    private String recebi;
    private String importancia;
    private String referente;
    private String localData;
    private String emitente;
    private String cpfcnpj;

    public Ativus(String valor, String recebi, String importancia, String referente, String localData, String emitente, String cpfcnpj) {
        this.valor = valor;
        this.recebi = recebi;
        this.importancia = importancia;
        this.referente = referente;
        this.localData = localData;
        this.emitente = emitente;
        this.cpfcnpj = cpfcnpj;
    }

    public Ativus() {
        
    }
    
     
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    

    public String getRecebi() {
        return recebi;
    }

    public void setRecebi(String recebi) {
        this.recebi = recebi;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }

    public String getReferente() {
        return referente;
    }

    public void setReferente(String referente) {
        this.referente = referente;
    }

    public String getLocalData() {
        return localData;
    }

    public void setLocalData(String LocalData) {
        this.localData = LocalData;
    }

    public String getEmitente() {
        return emitente;
    }

    public void setEmitente(String emitente) {
        this.emitente = emitente;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }
    
    
    
}
