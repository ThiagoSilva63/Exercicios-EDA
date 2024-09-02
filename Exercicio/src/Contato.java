public class Contato {
    
    private int indice;
    private  String nome;
    private  String telefone;
    private  String email;
    
    public Contato(int indice, String nome, String telefone, String email) {
    
    this.indice = indice;
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
    }
    
    public int getIndice(){
        return indice;
    }
    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setIndice(){
        this.indice=indice;
    }
    public void setNome(){
        this.nome=nome;
    }

    public void setTelefone(){
        this.telefone=telefone;
    }
    
    public void setEmail(){
        this.email=email;
    }
    
    @Override
    public String toString(){
        return"{ "+indice+" - "+nome+" - "+telefone+" - "+email+" }";
    }
}
