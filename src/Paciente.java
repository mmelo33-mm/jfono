public class Paciente {
    
    private int id;
    private String nome;
    private String email;


    //Java-Métodos de acesso
    //Logica de Programação - procedimento - retorno vazio (void)
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }
    //Logica de Programação - função - retorno String, int, double...
    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }


    /*Diferença entre construtor e método set
     * 
     * O método  não faz tudo que o construtor faz
     * mas o construtor faz tudo que o set faz
     * 
     * metodo set - atribui valor
     * construtor - cria objeto a atribui valor
     * 
     * método get - recupera valor*/
    public Paciente(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

}
