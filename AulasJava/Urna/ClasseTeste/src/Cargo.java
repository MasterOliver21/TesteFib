public enum Cargo {
    Presidente("Presidente"),
    Senador("Senador"),
    Deputado("Deputado");

    private String descricao;

    Cargo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
    
}
