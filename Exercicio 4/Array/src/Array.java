import java.util.ArrayList;

public class Array {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Contato> contatos = new ArrayList<>();

        Contato contato1 = new Contato("contato1", "1111-1111", "emailcont1@gmail.com");
        Contato contato2 = new Contato("contato2", "2222-2222", "emailcont2@gmail.com");
        Contato contato3 = new Contato("contato3", "3333-3333", "emailcont3@gmail.com");
        Contato contato4 = new Contato("contato4", "4444-4444", "emailcont4@gmail.com");

        /*adicionar elemento ao final*/
        contatos.add(contato1);
        contatos.add(contato2);

        /*verificar quantidade de elementos*/
        int tamanho = contatos.size();
        System.out.println(tamanho);

        /*imprimir elementos do vetor*/
        System.out.println(contatos);

        /*obter elemento de uma posição do vetor*/
        Contato elemento = contatos.get(1);
        System.out.println(elemento);

        /*verificar se elemento existe no vetor*/
        if(contatos.contains(contato3)){
            System.out.println("elemento existe no vetor");
        } else {
            System.out.println("elemento nao existe no vetor");
        }
        
        /*adicionar elemento em qualquer posição do vetor*/
        contatos.add(2, contato3);
        System.out.println(contatos);

        /*duplicar o tamanho do vetor*/
        ArrayList<Contato> novoArrayList = new ArrayList<>(contatos.size()*2);
        novoArrayList.addAll(contatos);
        contatos = novoArrayList;
        contatos.add(contato4);
        System.out.println(contatos);

        /*remover elemento do vetor*/
        contatos.remove(2);
        contatos.remove(contato4);
        System.out.println(contatos);

        /*pesquisar por nome*/
        boolean nome = false;
        for (Contato contato : contatos) {
            if (contato.getNome().equals("contato2")) {
                System.out.println("Esse e o contato que voce pesquisou: "+ contato.getNome() +", "+ contato.getTelefone()+", "+ contato.getEmail());
                nome=true;
            }
        }
        if (!nome) {
            System.out.println("Esse contato não foi encontrado");
        }
       
        /*pesquisar por e-mail*/
        boolean email=false;
        for (Contato contato : contatos) {
            if (contato.getTelefone().equals("1111-1111")) {
                System.out.println("Esse e o contato que voce pesquisou: "+ contato.getNome() +", "+ contato.getTelefone()+", "+ contato.getEmail());
                email=true;
            }
        }
        if (!email) {
            System.out.println("Esse contato não foi encontrado");
        }
        
        /*pesquisar por telefone*/
        boolean telefone =false;
        for (Contato contato : contatos) {
            if (contato.getEmail().equals("emailcont3@gmail.com")) {
                System.out.println("Esse e o contato que voce pesquisou: "+ contato.getNome() +", "+ contato.getTelefone()+", "+ contato.getEmail());
                telefone=true;
            }
        }
        if (!telefone) {
            System.out.println("Esse contato nao foi encontrado");
        }
    }
}
