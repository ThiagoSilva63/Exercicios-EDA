import java.util.Stack;

public class TestaPilha {
    public static void main(String[] args) throws Exception {
        Stack<Integer> pilha= new Stack<>();

        //Empilhando elementos
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        //verificando o tamanho da pilha
        System.out.println("Tamanho da pilha: "+ pilha.size());

        System.out.println("Elementos da pilha");
        while(!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }
        
        //imprimindo elementos
        pilha.push(10);
        pilha.push(20);

        //Topo da pilha
        System.out.println("Topo da pilha: "+pilha.peek());

        //verificando se elemento existe na pilha
        if (pilha.contains(20)) {
            System.out.println("o elemento 20 existe na pilha");
        }else{
            System.out.println("o elemento 20 não existe na pilha");
        }

        //desempilhando um elemento
        pilha.pop();
        System.out.println("elemento removido");
    }
}
