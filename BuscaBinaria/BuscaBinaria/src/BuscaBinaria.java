public class BuscaBinaria {

    public static int buscaBinaria(int[] arr, int elemento) {
        int inicio = 0;
        int fim = arr.length - 1;
        int comparacoes = 0;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            comparacoes++;

            if (arr[meio] == elemento) {
                return comparacoes;
            }
            if (arr[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return comparacoes;
    }

    public static void main(String[] args) {
        int[] tamanhos = {10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};
        int elementoNaoExistente = -1;

        for (int tamanho : tamanhos) {
            int[] lista = new int[tamanho];
            for (int i = 0; i < tamanho; i++) {
                lista[i] = i;
            }

            int comparacoes = buscaBinaria(lista, elementoNaoExistente);
            System.out.println("Tamanho da lista: " + tamanho + ", Comparacoes: " + comparacoes);
        }
    }
}