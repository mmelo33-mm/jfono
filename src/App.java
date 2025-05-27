public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono");
        
        //criação de um objeto
        Exercicio ex1 = new Exercicio(); 
        ex1.nome = "Exercício de articulação com consoantes";
        ex1.descricao = "O paciente repete sequências de palavras com consoantes fortes (como 'p', 't', 'k') para melhorar a articulação e a clareza na pronúncia";
        ex1.tempoMin = 4;
        ex1.som = "sons/articulacao_consoantes.mp3";


        Exercicio ex2 = new Exercicio(); 
        ex2.nome = "Exercício de vibração labial";
        ex2.descricao = "Exercício de aquecimento onde o paciente faz vibração labial com diferentes intensidades e velocidades";
        ex2.tempoMin = 4;
        ex2.som = "sons/vibracao_labial.mp3";
        ex2.exemplo = "brbrbr";

        Exercicio ex3 = new Exercicio(); 
        ex3.nome = "Exercício de produção de vogais";
        ex3.descricao = "O paciente repete as vogais (a, e, i, o, u) de forma clara e pausada, focando na articulação e na ressonância de cada uma";
        ex3.tempoMin = 6;
        ex3.som = "sons/vogais.mp3";
        ex3.exemplo = "'A' -pausa- 'E'...";



        
        
        Paciente p1 = new Paciente();
        p1.nome = "Marcelo";
        p1.email = "marcelo@gmail.com";

        Paciente p2 = new Paciente();
        p2.nome = "Marcos";
        p2.email = "marcos@gmail.com";

        Paciente p3 = new Paciente();
        p3.nome = "Marcio";
        p3.email = "marcio@gmail.com";





        Clinica c1 = new Clinica();
        c1.nome = "Clinica Fono Ceilandia";
        c1.cnpj = "37.369.557/0001-04";
        c1.cep = "72220-140";
        c1.endereco = "Quadra QNN 14";


        Clinica c2 = new Clinica();
        c2.nome = "Clinica Taguatinga";
        c2.cnpj = "05.993.191/0001-53";
        c2.cep = "72158-220";
        c2.endereco = "Setor Centro Metropolitano Quadra 2 Conjunto B";
    }
}
