import java.util.Scanner;

public class chatbot {

    public static void main(String[] args) {

        // Criar uma instância do chatbot e iniciar a interação
        chatbot chatbot = new chatbot();
        chatbot.start();
    }

    // Método para iniciar a conversa com o usuário
    public void start() {
        Scanner scanner = new Scanner(System.in);
        // Instanciar o Scanner para leitura de entrada
        System.out.println("Olá! Eu sou o MiniChatbot. Como posso te ajudar hoje?");

        while (true) {
            System.out.print("Usuário: ");
            String userInput = scanner.nextLine().toLowerCase();
            // Convertendo entrada para minúsculas

            if (userInput.equals("sair")) {
                System.out.println("MiniChatbot: Tchau! Até a próxima.");
                break;
                // Sai do loop
            }

            System.out.println("MiniChatbot: " + processInput(userInput)); // Processa a entrada do usuário
        }

        scanner.close(); // Fecha o Scanner no final
    }

    // Método para processar a entrada do usuário
    private String processInput(String input) {
        if (containsKeyword(input, "oi", "olá", "e aí")) {
            return greeting();
        } else if (containsKeyword(input, "seu nome", "qual é o seu nome", "quem é você")) {
            return getName();
        } else if (containsKeyword(input, "como você está", "tudo bem", "como vai")) {
            return howAreYou();
        } else {
            return defaultResponse();
        }
    }

    // Função para saudações
    private String greeting() {
        return "Olá! Como posso ajudar?";
    }

    // Função para responder sobre o nome
    private String getName() {
        return "Eu sou o MiniChatbot, seu assistente virtual!";
    }

    // Função para responder como está
    private String howAreYou() {
        return "Estou funcionando perfeitamente, obrigado!";
    }

    // Função para resposta padrão
    private String defaultResponse() {
        return "Desculpe, não entendi sua pergunta. Pode reformular?";
    }

    // Método auxiliar para verificar palavras-chave na entrada do usuário
    private boolean containsKeyword(String input, String... keywords) {
        for (String keyword : keywords) {
            if (input.contains(keyword)) {
                return true;
            }
        }
        return false;
    }

    }