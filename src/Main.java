import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados do primeiro campeão
        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String name1 = scanner.nextLine();
        System.out.print("Vida inicial: ");
        int life1 = scanner.nextInt();
        System.out.print("Ataque: ");
        int attack1 = scanner.nextInt();
        System.out.print("Armadura: ");
        int armor1 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        // Cria o primeiro campeão
        Champion champion1 = new Champion(name1, life1, attack1, armor1);

        // Dados do segundo campeão
        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        String name2 = scanner.nextLine();
        System.out.print("Vida inicial: ");
        int life2 = scanner.nextInt();
        System.out.print("Ataque: ");
        int attack2 = scanner.nextInt();
        System.out.print("Armadura: ");
        int armor2 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        // Cria o segundo campeão
        Champion champion2 = new Champion(name2, life2, attack2, armor2);

        // Número de turnos
        System.out.print("\nQuantos turnos você deseja executar? ");
        int maxTurns = scanner.nextInt();

        // Organizando o combate em turnos
        boolean isGameOver = false;
        int turn = 1;

        while (turn <= maxTurns && !isGameOver) {
            System.out.println("\nResultado do turno " + turn + ":");

            // Campeão 1 ataca o Campeão 2
            champion1.takeDamage(champion2);
            System.out.println(champion1.status());
            

            // Verifica se o Campeão 2 foi derrotado
            if (champion2.getLife() <= 0) {
                isGameOver = true;
                break;
            }

            // Campeão 2 ataca o Campeão 1
            champion2.takeDamage(champion1);
            System.out.println(champion2.status());

            // Verifica se o Campeão 1 foi derrotado
            if (champion1.getLife() <= 0) {
                isGameOver = true;
                break;
            }

            turn++;
        }

        // Mensagem de fim de combate
        System.out.println("\nFIM DO COMBATE");
        scanner.close();
    }
}
