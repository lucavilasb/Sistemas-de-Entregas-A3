import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Entregas user1 = new Entregas(1, "Lucas", "123.984.231-54", "(71)99872-6597", "Rua General Laércio");

        Restaurantes r = new Restaurantes(1, "Barzinho de Estrada", "69.973.115/0001-69", "Rua Doutor Silvino", "(71)99265-4190");

        Pratos prat1 = new Pratos("Ravióli", "Ravióli Muçarela c Molho Pomodoro", 19.90);

        int opcao;
        int opcaoRestaurantes;
        int idUsuario = 0;
        int idRestaurante = 0;

        do {
            System.out.println("1 - Cadastrar novo usuário; ");
            System.out.println("2 - Sistemas de Restaurantes; ");
            System.out.println("3 - Realizar pedido;");
            System.out.println("0 - Sair.");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    idUsuario++;
                    user1.setIdUsuario(idUsuario);
                    System.out.print("Informe o nome do usuário: ");
                    String nome = sc.next();
                    user1.setNomeUsuario(nome);

                    System.out.print("Informe o CPF: ");
                    String cpf = sc.next();
                    user1.setCpf(cpf);

                    System.out.print("Informe o telefone: ");
                    String telefone = sc.next();
                    user1.setTelefone(telefone);

                    System.out.print("Informe o endereço: ");
                    String endereco = sc.next();
                    user1.setEndereco(endereco);
                break;

                case 2:
                    System.out.println("1 - Cadastrar novo restaurante; ");
                    System.out.println("2 - Adicionar pratos ao meu restaurante; ");
                    opcaoRestaurantes = sc.nextInt();
                    switch(opcaoRestaurantes) {
                        case 1:
                            idRestaurante++;
                            r.setIdRestaurante(idRestaurante);
                            System.out.print("Informe o nome do restaurante: ");
                            String nomeRestaurante = sc.next();
                            r.setNomeRestaurante(nomeRestaurante);

                            System.out.print("Informe o CNPJ: ");
                            String cnpj = sc.next();
                            r.setCnpj(cnpj);

                            System.out.print("Informe o endereço: ");
                            String enderecoRestaurante = sc.next();
                            r.setEnderecoRestaurante(enderecoRestaurante);

                            System.out.print("Informe o telefone: ");
                            String telefoneRestaurante = sc.next();
                            r.setTelefoneRestaurante(telefoneRestaurante);
                        break;

                        case 2:
                            System.out.print("Informe o nome do prato: ");
                            String nomePrato = sc.next();
                            prat1.setNomePrato(nomePrato);

                            System.out.print("Descrição: ");
                            String descricaoPrato = sc.next();
                            prat1.setDescricaoPrato(descricaoPrato);

                            System.out.print("Preço: ");
                            double precoPrato = sc.nextDouble();
                            prat1.setPrecoPrato(precoPrato);

                            r.adicionarPrato(prat1);

                            // Adicionar pratos e verificar codigo do restaurante
                        break;
                    }
                break;

                case 3:
                //
                break;

                case 0:
                System.out.println("Obrigado pela preferência, volte sempre!");
                break;

                default:
                System.out.println("Opção inválida!");
                break;
            }
        }
        while(opcao != 0);

        sc.close();
    }
}
