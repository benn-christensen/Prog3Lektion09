package opgave01;

class RpgCharacter {
    private final CharacterType type;
    private final Weapon weapon;

    RpgCharacter(CharacterType type, Weapon weapon) {
        this.type = type;
        this.weapon = weapon;
    }

    String describe() {
        return "Character: " + type + ", weapon: " + weapon.name();
    }
}

