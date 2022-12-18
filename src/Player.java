public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                // TODO заполнить слоты оружием
                new Pistol(),
                new Automachine(),
                new RPG(),
                new Slingshot(),
                new WaterPistol()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO если значение slot больше значения последнего элемента массива, то
        // выйти из метода написав об этом в консоль
        if (slot >= this.getSlotsCount() || slot < 0) {
            System.out.println("Выберите оружие " + (this.getSlotsCount() - 1));
        } else {
            // Получаем оружие из выбранного слота
            Weapon weapon = weaponSlots[slot];
            // Огонь!
            weapon.shot();
        }
    }
}

