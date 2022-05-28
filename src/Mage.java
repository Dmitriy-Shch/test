public class Mage {
    String name, type;
    int level, damage;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    String getInfo() {
        return name + "," + level + "," + damage + "," + type;
        return name + "," + level + "," + damage + "," + type;
    }

    String fight(Mage mage) {
        if (this.type.equals("fire") && mage.type.equals("ice")) return this.name;
        else if (this.type.equals("ice") && mage.type.equals("earth")) return this.name;
        else if (this.type.equals("earth") && mage.type.equals("fire")) return this.name;
        else if (!this.type.equals(mage.type)) return mage.name;
        else {
            if (this.level > mage.level) return this.name;
            else if (this.level < mage.level) return mage.name;
            else {
                if (this.damage > mage.damage) return this.name;
                else if (this.damage < mage.damage) return mage.name;
                else return "draw";
            }
        }
    }
}
/*Маг огня побеждает мага льда, но проигрывает магу земли.
⚡ Маг льда побеждает мага земли, но проигрывает магу огня.
⚡ Маг земли побеждает мага огня, но проигрывает магу льда.
⚡Если же стихия магов одинаковая, то выигрывает более высокоуровневый маг, если же и уровни одинаковы, то тот,
 у которого больший урон, если же и урон одинаковый, то вернуть строку draw (ничья).*/