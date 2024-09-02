public class Vetor {
    private   Contato[] elementos;
    private   int tamanho;
    
    public Vetor(int capacidade){
        this.elementos= new Contato[capacidade];
        this.tamanho=0;
    }
    /* */
    public Contato[] getElementos(){
        return elementos;
    }

    public boolean adiciona(Contato elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    
    public void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            Contato[] elementosNovos = new
            Contato[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    public int tamanho(){
        return this.tamanho;
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");
        return s.toString();
    }
    
    public Contato busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new
    IllegalArgumentException("Posição inválida");
    }
        return this.elementos[posicao];
    }
    
    public int busca(Contato elemento){
        for (int i=0; i<this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    
    public boolean adiciona(int posicao, Contato elemento){
        if (!(posicao >= 0 && posicao <= tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();
        //mover todos os elementos
        for (int i=this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }
    
    public void remove(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i=posicao; i<this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    /*Busca por nome */
    public Contato buscarPorNome(String nomeBuscado) {
        for (Contato contato : elementos) {
            if (contato.getNome().equalsIgnoreCase(nomeBuscado)) {
                return contato;
            }
        }
        return null;
    }

    /*Busca por email */
    public Contato buscarPorEmail(String emailBuscado) {
        for (Contato contato : elementos) {
            if (contato.getEmail().equalsIgnoreCase(emailBuscado)) {
                return contato;
            }
        }
        return null;
    }
    
    /*bubble sort */
    public void ordenação(){

        for (int i = 0; i < tamanho-1; i++) {
            for (int j = i+1; j < tamanho; j++) {
                if (elementos[i].getIndice()>(elementos[j].getIndice())) {
                    Contato aux=elementos[i];
                    elementos[i]=elementos[j];
                    elementos[j]= aux;
                }
            }
        }

    }

}
