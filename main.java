import java.util.Scanner;

public class main {
    private static Inventario inventario = new Inventario();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        adicionarItemsPadrao();
        exibirMenu();
    }
    
    private static void adicionarItemsPadrao() {
        System.out.println("\n🎮 Arena de Skins - Inicializando...\n");
        
        // Adiciona 3 itens pré-cadastrados
        SkinPersonagem skin1 = new SkinPersonagem("SK001", "Cyber Ninja", "Lendária", "Ninja", "Neon");
        Emote emote1 = new Emote("EM001", "Dancinha do Robô", "Rara", 3, "Dancinha do Robô");
        Spray spray1 = new Spray("SP001", "Logo Arena", "Épica", "Logo Arena Oficial", true);
        
        inventario.adicionar(skin1);
        inventario.adicionar(emote1);
        inventario.adicionar(spray1);
        
        System.out.println("\n✅ 3 itens padrão adicionados!\n");
    }
    
    private static void exibirMenu() {
        while (true) {
            System.out.println("\n========== MENU PRINCIPAL ==========");
            System.out.println("1. Adicionar Skin de Personagem");
            System.out.println("2. Adicionar Emote");
            System.out.println("3. Adicionar Spray");
            System.out.println("4. Listar Tudo");
            System.out.println("5. Listar Equipados");
            System.out.println("6. Equipar Item");
            System.out.println("7. Desequipar Item");
            System.out.println("8. Sair");
            System.out.println("====================================");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer
            
            switch (opcao) {
                case 1:
                    adicionarSkin();
                    break;
                case 2:
                    adicionarEmote();
                    break;
                case 3:
                    adicionarSpray();
                    break;
                case 4:
                    inventario.listarTudo();
                    break;
                case 5:
                    inventario.listarEquipados();
                    break;
                case 6:
                    equiparItem();
                    break;
                case 7:
                    desequiparItem();
                    break;
                case 8:
                    System.out.println("\n👋 Até logo, guerreiro!");
                    scanner.close();
                    return;
                default:
                    System.out.println("❌ Opção inválida!");
            }
        }
    }
    
    private static void adicionarSkin() {
        System.out.print("\nDigite o ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Digite o Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a Raridade (Comum/Rara/Épica/Lendária): ");
        String raridade = scanner.nextLine();
        
        System.out.print("Digite o Personagem: ");
        String personagem = scanner.nextLine();
        
        System.out.print("Digite a Cor Tema (ex: Neon, Cyber, Fogo): ");
        String corTema = scanner.nextLine();
        
        SkinPersonagem skin = new SkinPersonagem(id, nome, raridade, personagem, corTema);
        inventario.adicionar(skin);
    }
    
    private static void adicionarEmote() {
        System.out.print("\nDigite o ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Digite o Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a Raridade (Comum/Rara/Épica/Lendária): ");
        String raridade = scanner.nextLine();
        
        System.out.print("Digite a Duração (em segundos): ");
        int duracao = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Digite a Referência Meme: ");
        String memeRef = scanner.nextLine();
        
        Emote emote = new Emote(id, nome, raridade, duracao, memeRef);
        inventario.adicionar(emote);
    }
    
    private static void adicionarSpray() {
        System.out.print("\nDigite o ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Digite o Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a Raridade (Comum/Rara/Épica/Lendária): ");
        String raridade = scanner.nextLine();
        
        System.out.print("Digite a Arte: ");
        String arte = scanner.nextLine();
        
        System.out.print("É animado? (S/N): ");
        String resposta = scanner.nextLine();
        boolean animado = resposta.equalsIgnoreCase("S");
        
        Spray spray = new Spray(id, nome, raridade, arte, animado);
        inventario.adicionar(spray);
    }
    
    private static void equiparItem() {
        System.out.print("\nDigite o ID do item para equipar: ");
        String id = scanner.nextLine();
        inventario.equiparPorId(id);
    }
    
    private static void desequiparItem() {
        System.out.print("\nDigite o ID do item para desequipar: ");
        String id = scanner.nextLine();
        inventario.desequiparPorId(id);
    }
}