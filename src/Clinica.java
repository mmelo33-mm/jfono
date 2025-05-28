public class Clinica {
    
    private int id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String cep;

    

    //criando construtor
    public Clinica(String nome, String cnpj, String endereco, String cep){
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.cep = cep;
    }

    public Clinica(String nome, String endereco, String cep){
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
    }


    
    
    
    
    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }



}
