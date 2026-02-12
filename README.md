# 🎮 Arena de Skins - Inventário de Jogo

Um mini-sistema de inventário inspirado em jogos, onde o jogador pode guardar e gerenciar itens cosméticos, equipando-os conforme desejado.

## 📋 Requisitos

- Java 8 ou superior
- JDK instalado

## 🚀 Como Executar

```bash
# Compilar todos os arquivos
javac *.java

# Executar o programa
java main
```

## 🎯 Funcionalidades

### Menu Principal

1. **Adicionar Skin de Personagem** - Crie skins com tema e cor personalizados
2. **Adicionar Emote** - Adicione emotes com duração e referência meme
3. **Adicionar Spray** - Crie sprays com arte, animados ou estáticos
4. **Listar Tudo** - Veja todos os itens com detalhes e efeitos
5. **Listar Equipados** - Veja apenas os itens que estão equipados
6. **Equipar Item** - Equipe um item pelo ID
7. **Desequipar Item** - Desequipe um item pelo ID
8. **Sair** - Saia do programa

## 📦 Estrutura do Projeto

### Classes Principais

#### `ItemCosmetico.java` (Classe Abstrata)
Base para todos os itens do inventário.

**Atributos:**
- `String id` - Identificador único do item (ex: "SK001")
- `String nome` - Nome do item
- `String raridade` - Nível de raridade (Comum, Rara, Épica, Lendária)
- `boolean equipado` - Status de equipamento

**Métodos:**
- `getId()` - Retorna o ID
- `getNome()` - Retorna o nome
- `getRaridade()` - Retorna a raridade
- `isEquipado()` - Retorna se está equipado
- `equipar()` - Marca como equipado
- `desequipar()` - Marca como desequipado
- `String efeito()` - Descreve o efeito (abstrato)
- `String detalhes()` - Retorna detalhes do item

#### `SkinPersonagem.java`
Representa uma skin de personagem com tema visual.

**Atributos Extras:**
- `String personagem` - Nome do personagem
- `String corTema` - Cor ou tema da skin (Neon, Cyber, Fogo, etc.)

**Exemplo:**
```
ID: SK001
Nome: Cyber Ninja
Raridade: Lendária
Personagem: Ninja
Cor Tema: Neon
Efeito: Brilho Neon + trilha sonora temática
```

#### `Emote.java`
Representa um emote (animação com som).

**Atributos Extras:**
- `int duracaoSegundos` - Duração da animação em segundos
- `String memeRef` - Referência à cultura meme (ex: "Dancinha do Robô")

**Exemplo:**
```
ID: EM001
Nome: Dancinha do Robô
Raridade: Rara
Duração: 3s
Referência: Dancinha do Robô
Efeito: Animação: Dancinha do Robô com som temático por 3s
```

#### `Spray.java`
Representa um spray para pichação digital.

**Atributos Extras:**
- `String arte` - Descrição da arte/design
- `boolean animado` - Se a pichação é animada ou estática

**Exemplo:**
```
ID: SP001
Nome: Logo Arena
Raridade: Épica
Arte: Logo Arena Oficial
Tipo: Animado
Efeito: Spray de pichação digital animada: Logo Arena Oficial
```

#### `Inventario.java`
Gerencia a coleção de itens usando `ArrayList`.

**Métodos:**
- `adicionar(ItemCosmetico item)` - Adiciona item (valida ID único)
- `buscarPorId(String id)` - Busca item pelo ID
- `listarTudo()` - Lista todos os itens com efeitos
- `listarEquipados()` - Lista apenas itens equipados
- `equiparPorId(String id)` - Equipa item por ID
- `desequiparPorId(String id)` - Desequipa item por ID

#### `main.java`
Programa principal com menu interativo.

## 🎮 Items Pré-Cadastrados

Ao iniciar, o programa carrega automaticamente 3 items:

1. **Cyber Ninja** (SK001) - SkinPersonagem, Lendária
2. **Dancinha do Robô** (EM001) - Emote, Rara
3. **Logo Arena** (SP001) - Spray, Épica

## ✨ Características Especiais

✅ **Proteção contra IDs duplicados** - Não permite adicionar items com ID já existente

✅ **Polimorfismo** - Cada tipo de item tem seu próprio efeito

✅ **ArrayList** - Armazenamento dinâmico de items

✅ **Herança** - Todas as subclasses herdam de ItemCosmetico

✅ **Validações** - Avisos ao tentar equipar/desequipar items já nesse estado

✅ **Interface Amigável** - Menu intuitivo com feedback visual (emojis)

## 📝 Exemplo de Uso

```
🎮 Arena de Skins - Inicializando...

✅ Item 'Cyber Ninja' adicionado ao inventário!
✅ Item 'Dancinha do Robô' adicionado ao inventário!
✅ Item 'Logo Arena' adicionado ao inventário!

========== MENU PRINCIPAL ==========
1. Adicionar Skin de Personagem
2. Adicionar Emote
3. Adicionar Spray
4. Listar Tudo
5. Listar Equipados
6. Equipar Item
7. Desequipar Item
8. Sair
====================================
Escolha uma opção: 4

========== INVENTÁRIO COMPLETO ==========

ID: SK001 | Nome: Cyber Ninja | Raridade: Lendária | Status: DISPONÍVEL | Personagem: Ninja | Cor Tema: Neon
Efeito: Brilho Neon + trilha sonora temática
```

## 📂 Arquivos do Projeto

```
ArenaDeSkins/
├── ItemCosmetico.java      (Classe abstrata base)
├── SkinPersonagem.java     (Skin de personagem)
├── Emote.java              (Emote/animação)
├── Spray.java              (Spray de pichação)
├── Inventario.java         (Gerenciador de items)
├── main.java               (Programa principal com menu)
└── README.md               (Este arquivo)
```

## 🔧 Personalizações

Você pode facilmente:

- **Adicionar novos tipos de items** - Estenda `ItemCosmetico` e implemente `efeito()` e `detalhes()`
- **Modificar raridades** - Altere os valores conforme desejar
- **Adicionar mais items pré-cadastrados** - Edite o método `adicionarItemsPadrao()` em `main.java`

## 📝 Licença

Este projeto é de código aberto. Sinta-se livre para usar e modificar!

---

**Desenvolvido com ❤️ para Arena de Skins**
