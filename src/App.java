public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono");

        System.out.println("Segue abaixo a lista de exercicios \n");
        
        //criação de um objeto
        Exercicio ex1 = new Exercicio("Exercício de articulação com consoantes", "O paciente repete sequências de palavras com consoantes fortes (como 'p', 't', 'k') para melhorar a articulação e a clareza na pronúncia", 
                                        "sons/articulacao_consoantes.mp3", 4, "sem exemplo \n"); 

        Exercicio ex2 = new Exercicio("EX2 - Exercicio de vibração labial", "Exercício de aquecimento onde o paciente faz vibração labial com diferentes intensidades e velocidades",
                                        "brbrbr \n"); 

        Exercicio ex3 = new Exercicio("EX3 - Exercício de produção de vogais", "O paciente repete as vogais (a, e, i, o, u) de forma clara e pausada, focando na articulação e na ressonância de cada uma", 
        "'A' -pausa- 'E'... \n"); 
    
        
        System.out.println("*EX1 \nnome: "+ex1.getNome());
        System.out.println("descrição: "+ex1.getDescricao());
        System.out.println("som: "+ex1.getSom());
        System.out.println("exemplo: "+ex1.getExemplo());

        System.out.println("*EX2 \nnome: "+ex2.getNome());
        System.out.println("descrição: "+ex2.getDescricao()+"\n");
        
        










        Paciente p1 = new Paciente("Marcelo", "marcelo@gmail.com");
    
        Paciente p2 = new Paciente("Marcos", "marcos@gmail.com");
        
        Paciente p3 = new Paciente("Marcio", "marcio@gmail.com");

        System.out.println("Nome do Paciente: "+p1.getNome());
        System.out.println("email: "+p1.getEmail()+"\n");


        








        
        Clinica c1 = new Clinica("Clinica Fono Ceilandia", "37.369.557/0001-04", "Quadra QNN 14", "72220-140");
        Clinica c2 = new Clinica("Clinica Fono Taguatinga", "Setor Centro Metropolitano Quadra 2 Conjunto B", "72158-220");
        Clinica c3 = new Clinica("Clinica Fono Setor O", "QNO 13 AE C");

        System.out.println("Escolha umas das clinicas para realizar as consultas: \n");

        System.out.println("Opção 1 \n");

        System.out.println("Nome da Clinica: "+c1.getNome());
        System.out.println("CNPJ: "+c1.getCnpj());
        System.out.println("Endereço: "+c1.getEndereco());
        System.out.println("CEP: "+c1.getCep()+"\n");

        System.out.println("Opção 2 \n");

        System.out.println("Nome: "+c2.getNome());
        System.out.println("Endereço: "+c2.getEndereco());
        System.out.println("CEP: "+c2.getCep());

        System.out.println("Opção 3 \n");

        System.out.println("Nome: "+c3.getNome());
        System.out.println("Endereço: "+c3.getEndereco());
        
    }

    


}
