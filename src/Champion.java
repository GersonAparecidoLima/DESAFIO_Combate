public class Champion {
    // Atributos privados
    private String name;
    private int life;
    private int attack;
    private int armor;

    // Construtor da classe
    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    // Método para calcular o dano recebido de outro Champion
    public void takeDamage(Champion other) {
        // Calcula o dano considerando a armadura, mas garante que o dano seja pelo menos 1
        int damage = Math.max(1, other.attack - this.armor);
        // Atualiza a vida garantindo que não seja menor que 0
        this.life = Math.max(0, this.life - damage);
    }

    // Método para retornar o status do Champion
    public String status() {
        if (this.life <= 0) {
        	return this.name + ": " + this.life + " de vida (morreu)";
        } else {
            return this.name + ": " + this.life + " de vida";
        }
    }

    // Métodos getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

}
