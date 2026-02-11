public abstract class ItemCosmetico{
    private String id;
    private String nome;
    private String raridade;
    private boolean equipado;
    
    public ItemCosmetico(String id, String nome, String raridade){
        this.id = id;
        this.nome = nome;
        this.raridade = raridade;
        this.equipado = false;
    }
    
    public String getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getRaridade() {   
        return raridade;
    }
    
    public boolean isEquipado() {
        return equipado;
    }
    
    public void equipar() {
        if (equipado) {
            System.out.println("❌ Item já está equipado!");
        } else {
            equipado = true;
            System.out.println("✅ Item '" + nome + "' equipado com sucesso!");
        }
    }
    
    public void desequipar() {
        if (!equipado) {
            System.out.println("❌ Item já está desequipado!");
        } else {
            equipado = false;
            System.out.println("✅ Item '" + nome + "' desequipado com sucesso!");
        }
    }
    
    public abstract String efeito();
    
    public String detalhes() {
        String status = equipado ? "EQUIPADO" : "DISPONÍVEL";
        return "ID: " + id + " | Nome: " + nome + " | Raridade: " + raridade + " | Status: " + status;
    }

}