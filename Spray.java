public class Spray extends ItemCosmetico {
    private String arte;
    private boolean animado;
    
    public Spray(String id, String nome, String raridade, String arte, boolean animado) {
        super(id, nome, raridade);
        this.arte = arte;
        this.animado = animado;
    }
    
    public String getArte() {
        return arte;
    }
    
    public boolean isAnimado() {
        return animado;
    }
    
    @Override
    public String efeito() {
        String tipo = animado ? "pichação digital animada" : "pichação digital estática";
        return "Spray de " + tipo + ": " + arte;
    }
    
    @Override
    public String detalhes() {
        String tipo = animado ? "Animado" : "Estático";
        return super.detalhes() + " | Arte: " + arte + " | Tipo: " + tipo;
    }
}
