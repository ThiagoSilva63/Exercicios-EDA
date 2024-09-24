import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayList2 {

    /*Criando array list e contatos */
    private ArrayList<Contato> contatos = new ArrayList<>();

    public ArrayList2(){
        Contato contato1 = new Contato("contato1", "1111-1111", "emailcont1@gmail.com");
        Contato contato2 = new Contato("contato2", "2222-2222", "emailcont2@gmail.com");
        Contato contato3 = new Contato("contato3", "3333-3333", "emailcont3@gmail.com");
        Contato contato4 = new Contato("contato4", "4444-4444", "emailcont4@gmail.com");
    
        /*adicionar elementos ja existentes */
        contatos.add(contato4);
        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
    }

    /*metodo adicionar contatos */
    public void adicionarContato(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        Contato novoContato = new Contato(nome, telefone, email);
        contatos.add(novoContato);

        System.out.println("Contato adicionado");
    }

    /*Verificar quantidade de contatos*/
    public void quantidadeContatos(){
        int tamanho = contatos.size();
        System.out.println("Quantidade de contatos: "+tamanho);
    }

    /*Imprimir contatos*/
    public void imprimirContatos(){
        System.out.println(contatos);
    }

    /*Obter elemento de uma posição do vetor*/
    public Object obterContato(int pocicao){
        Contato elemento = contatos.get(pocicao);
        System.out.println("Elemento referente a posicao: "+elemento);
        return elemento;

    }

    /*Verificar se elemento existe no vetor*/
    public void verificarContato(){
        Scanner scanner = new Scanner(System.in);
        boolean nome = false;
        System.out.print("Digite o nome do contato que voce deseja verificar: ");
        String cont = scanner.nextLine();
        for (Contato contato : contatos) {
            if (contato.getNome().equals(cont)) {
                System.out.println("Esse contato existe na lista");
                nome=true;
            }
        }
        if (!nome) {
            System.out.println("Esse contato não foi encontrado");
        }
    }

    /*Adicionar contato em qualquer pocisao*/
    public void adicionarPosicao(int posicao){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        Contato novoContato = new Contato(nome, telefone, email);
        contatos.add(posicao, novoContato);
        System.out.println("Contato adicionado.");
    }

    /*Remover contato */
    public void removerContato(int posicao){
        contatos.remove(posicao);
    }

    /*Buscar contato por nome */
    public void buscarNome(){
        Scanner scanner = new Scanner(System.in);
        boolean nome = false;
        System.out.print("Digite o nome do contato que voce deseja pesquisar: ");
        String cont = scanner.nextLine();
        for (Contato contato : contatos) {
            if (contato.getNome().equals(cont)) {
                System.out.println("Esse e o contato que voce pesquisou: "+ contato.getNome() +", "+ contato.getTelefone()+", "+ contato.getEmail());
                nome=true;
            }
        }
        if (!nome) {
            System.out.println("Esse contato não foi encontrado");
        }
    }

    /*Buscar contato por e-mail */
    public void buscarEmail(){
        Scanner scanner = new Scanner(System.in);
        boolean email=false;
        System.out.print("Digite o email do contato que voce deseja pesquisar: ");
        String cont = scanner.nextLine();
        for (Contato contato : contatos) {
            if (contato.getEmail().equals(cont)) {
                System.out.println("Esse e o contato que voce pesquisou: "+ contato.getNome() +", "+ contato.getTelefone()+", "+ contato.getEmail());
                email=true;
            }
        }
        if (!email) {
            System.out.println("Esse contato não foi encontrado");
        }
    }

    /*Buscar contato por telefone */
    public void buscarTelefone(){
        Scanner scanner = new Scanner(System.in);
        boolean telefone =false;
        System.out.print("Digite o telefone do contato que voce deseja pesquisar: ");
        String cont = scanner.nextLine();
        for (Contato contato : contatos) {
            if (contato.getTelefone().equals(cont)) {
                System.out.println("Esse e o contato que voce pesquisou: "+ contato.getNome() +", "+ contato.getTelefone()+", "+ contato.getEmail());
                telefone=true;
            }
        }
        if (!telefone) {
            System.out.println("Esse contato nao foi encontrado");
        }
    }

    /*ordenar por nome */
    public void ordenarContatosPorNome() {
        Collections.sort(contatos);
    }

    /*ordenar por e-mail */
    public void ordenarContatosPorEmail(){
        contatos.sort(Comparator.comparing(Contato::getEmail));
    }
    /*ordenar por telefone */
    public void ordenarContatosPorTelefone(){
        contatos.sort(Comparator.comparing(Contato::getTelefone));
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList2 contatos = new ArrayList2();

        int opcao; // variavel que representa a escolha do usuario

        /*loop da interação do usuario */
        do {
            System.out.println("Menu:");
            System.out.println("1.  Adicionar elemento ao final do Array");
            System.out.println("2.  Verificar quantidade de contatos");
            System.out.println("3.  Imprimir Array");
            System.out.println("4.  Obter contato de uma posição específica");
            System.out.println("5.  Verificar se existe o contato");
            System.out.println("6.  Adcionar contato em qualquer posicao");
            System.out.println("8.  Remover contato");
            System.out.println("9.  Pesquisar por nome");
            System.out.println("10. Pesquisar por email");
            System.out.println("11. Pesquisar por telefone");
            System.out.println("12. Ordenar por nome");
            System.out.println("13. Ordenar por email");
            System.out.println("14. Ordenar por telefone");
            System.out.println("0. Sair");

            System.out.print("Digite a opção:");
            opcao= scanner.nextInt();

            switch (opcao) {

                /*Adicionar contatos ao final */
                case 1:
                    contatos.adicionarContato();
                    break;
                /*Verificar quantidade de contatos */
                case 2:
                    contatos.quantidadeContatos();
                    break;
                /*Imprimir contatos */
                case 3:
                    contatos.imprimirContatos();
                    break;
                /*Obter contato de uma posição específica */
                case 4:
                    System.out.print("Digite a pocisao: ");
                    int indice = scanner.nextInt();
                    contatos.obterContato(indice);
                    break;
                /*Verificar se elemento existe no vetor */
                case 5:
                    contatos.verificarContato();
                    break;
                /*Adicionar contato em qualquer posicao */
                case 6:
                    System.out.println("Digite a pocisao que deseja adcionar o contato: ");
                    int posicao = scanner.nextInt();
                    contatos.adicionarPosicao(posicao);
                    break;
                /*Remover contato */
                case 8:
                    System.out.println("Digite a pocisao do contato que voce que deseja remover: ");
                    int n = scanner.nextInt();
                    contatos.removerContato(n);
                    break;
                /*Pesquisar por nome */
                case 9:
                    contatos.buscarNome();
                    break;
                /*Pesquisar por e-mail */
                case 10:
                    contatos.buscarEmail();
                    break;
                /*Pesquisar por telefone */
                case 11:
                    contatos.buscarTelefone();
                    break;
                /*Ordenar por nome*/
                case 12:
                    contatos.ordenarContatosPorNome();
                    break;
                /*Ordenar por e-mail*/
                case 13:
                    contatos.ordenarContatosPorEmail();
                    break;
                /*Ordenar por telefone*/
                case 14:
                    contatos.ordenarContatosPorTelefone();
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao!=0);
    }
}
