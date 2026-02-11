public class Emote extends ItemCosmetico {
    private int duracaoSegundos;
    private String memeRef;
    
    public Emote(String id, String nome, String raridade, int duracaoSegundos, String memeRef) {
        super(id, nome, raridade);
        this.duracaoSegundos = duracaoSegundos;
        this.memeRef = memeRef;
    }
    
    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }
    
    public String getMemeRef() {
        return memeRef;
    }
    
    @Override
    public String efeito() {
        return "Animação: " + memeRef + " com som temático por " + duracaoSegundos + "s";
    }
    
    @Override
    public String detalhes() {
        return super.detalhes() + " | Duração: " + duracaoSegundos + "s | Referência: " + memeRef;
    }
}
