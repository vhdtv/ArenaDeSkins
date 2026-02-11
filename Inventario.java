import java.util.ArrayList;

public class Inventario {
    private ArrayList<ItemCosmetico> itens;
    
    public Inventario() {
        this.itens = new ArrayList<>();
    }
    
    public void adicionar(ItemCosmetico item) {
        // Verifica se já existe um item com o mesmo ID
        if (buscarPorId(item.getId()) != null) {
            System.out.println("❌ Erro: Já existe um item com ID '" + item.getId() + "'");
            return;
        }
        itens.add(item);
        System.out.println("✅ Item '" + item.getNome() + "' adicionado ao inventário!");
    }
    
    public ItemCosmetico buscarPorId(String id) {
        for (ItemCosmetico item : itens) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
    
    public void listarTudo() {
        if (itens.isEmpty()) {
            System.out.println("\n❌ Inventário vazio!\n");
            return;
        }
        
        System.out.println("\n========== INVENTÁRIO COMPLETO ==========");
        for (ItemCosmetico item : itens) {
            System.out.println("\n" + item.detalhes());
            System.out.println("Efeito: " + item.efeito());
        }
        System.out.println("\n========================================\n");
    }
    
    public void listarEquipados() {
        ArrayList<ItemCosmetico> equipados = new ArrayList<>();
        for (ItemCosmetico item : itens) {
            if (item.isEquipado()) {
                equipados.add(item);
            }
        }
        
        if (equipados.isEmpty()) {
            System.out.println("\n❌ Nenhum item equipado!\n");
            return;
        }
        
        System.out.println("\n========== ITENS EQUIPADOS ==========");
        for (ItemCosmetico item : equipados) {
            System.out.println("\n" + item.detalhes());
            System.out.println("Efeito: " + item.efeito());
        }
        System.out.println("\n=====================================\n");
    }
    
    public void equiparPorId(String id) {
        ItemCosmetico item = buscarPorId(id);
        if (item == null) {
            System.out.println("❌ Item com ID '" + id + "' não encontrado!");
            return;
        }
        item.equipar();
    }
    
    public void desequiparPorId(String id) {
        ItemCosmetico item = buscarPorId(id);
        if (item == null) {
            System.out.println("❌ Item com ID '" + id + "' não encontrado!");
            return;
        }
        item.desequipar();
    }
    
    public int getTotalItens() {
        return itens.size();
    }
}
