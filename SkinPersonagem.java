public class SkinPersonagem extends ItemCosmetico {
    private String personagem;
    private String corTema;
    
    public SkinPersonagem(String id, String nome, String raridade, String personagem, String corTema) {
        super(id, nome, raridade);
        this.personagem = personagem;
        this.corTema = corTema;
    }
    
    public String getPersonagem() {
        return personagem;
    }
    
    public String getCorTema() {
        return corTema;
    }
    
    @Override
    public String efeito() {
        return "Brilho " + corTema + " + trilha sonora temática";
    }
    
    @Override
    public String detalhes() {
        return super.detalhes() + " | Personagem: " + personagem + " | Cor Tema: " + corTema;
    }
}