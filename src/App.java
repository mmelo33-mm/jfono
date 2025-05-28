public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono");
        
        //criação de um objeto
        Exercicio ex1 = new Exercicio("Exercício de articulação com consoantes", "O paciente repete sequências de palavras com consoantes fortes (como 'p', 't', 'k') para melhorar a articulação e a clareza na pronúncia", 
                                        "sons/articulacao_consoantes.mp3", 4, "sem exemplo"); 


        Exercicio ex2 = new Exercicio("Exercicio de vibração labial", "Exercício de aquecimento onde o paciente faz vibração labial com diferentes intensidades e velocidades",
                                        "brbrbr"); 


        Exercicio ex3 = new Exercicio("Exercício de produção de vogais", "O paciente repete as vogais (a, e, i, o, u) de forma clara e pausada, focando na articulação e na ressonância de cada uma", 
        "'A' -pausa- 'E'..."); 
    
        System.out.println("nome: "+ex1.getNome());
        System.out.println("descrição: "+ex1.getDescricao());
        System.out.println("som: "+ex1.getSom());
        System.out.println("exemplo: "+ex1.getExemplo());


        System.out.println("nome: "+ex2.getNome());
        System.out.println("descrição: "+ex2.getDescricao());
        
        








        Paciente p1 = new Paciente();
        p1.nome = "Marcelo";
        p1.email = "marcelo@gmail.com";

        Paciente p2 = new Paciente();
        p2.nome = "Marcos";
        p2.email = "marcos@gmail.com";

        Paciente p3 = new Paciente();
        p3.nome = "Marcio";
        p3.email = "marcio@gmail.com";











        Clinica c1 = new Clinica("Clinica Fono Ceilandia", "37.369.557/0001-04", "Quadra QNN 14", "72220-140");
        Clinica c2 = new Clinica("Clinica Taguatinga", "Setor Centro Metropolitano Quadra 2 Conjunto B", "72158-220");

        System.out.println("Escolha umas das clinicas para realizar as consultas:");
        System.out.println("Clinica 1");

        System.out.println("Nome da Clinica: "+c1.getNome());
        System.out.println("CNPJ: "+c1.getCnpj());
        System.out.println("Endereço: "+c1.getEndereco());
        System.out.println("CEP: "+c1.getCep());

        System.out.println("Opção 2");
        System.out.println("Nome: "+c2.getNome());
        System.out.println("Endereço: "+c2.getEndereco());
        System.out.println("CEP: "+c2.getCep());
        
    }

    


}
