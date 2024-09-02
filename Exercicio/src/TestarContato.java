public class TestarContato {
    public static void main(String[] args){
        
        Vetor vetor =new Vetor(5);
        //System.out.println(vetor);
        Contato contato1 = new Contato(1,"Nome1","(11)1111-1111","emailcont1@gmail.com");
        Contato contato2 = new Contato(2,"Nome2","(22)2222-2222","emailcont2@gmail.com");
        Contato contato3 = new Contato(3,"Nome3","(33)3333-3333","emailcont3@gmail.com");
        Contato contato4 = new Contato(4,"Nome4","(44)4444-4444","emailcont4@gmail.com");
        //System.out.println(vetor.tamanho());
        vetor.adiciona(contato3);
        vetor.adiciona(contato1);
        vetor.adiciona(contato2);
        vetor.aumentaCapacidade();
        vetor.adiciona(1, contato4);
        System.out.println(vetor);
        System.out.println(vetor.tamanho());
        System.out.println(vetor.busca(1)); 
        System.out.println(vetor.busca(contato2));
        System.out.println(contato4);
        System.out.println(vetor);
        //vetor.remove(0);
        //System.out.println(vetor);
        
        /*Busca por nome */
        String nomeBuscado = "Nome2";
        Contato contatoEncontrado = vetor.buscarPorNome(nomeBuscado);

        if (contatoEncontrado != null) {
            System.out.println(contatoEncontrado);
        } else {
            System.out.println("contato não encontrado");
        }
        
        /*Busca por email*/
        String emailBuscado = "emailcont3@gmail.com";
        Contato emailEncontrado = vetor.buscarPorEmail(emailBuscado);

        if (contatoEncontrado != null) {
            System.out.println(emailEncontrado);
        } else {
            System.out.println("contato não encontrado");
        }

        /*Bubble Sort*/ 
        vetor.ordenação();
        System.out.println(vetor);
        
    }

}
