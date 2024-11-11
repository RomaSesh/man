import java.util.Random; // Импортируем класс Random для генерации случайных чисел

    public class Person {
        private String name; // Поле для хранения имени
        private int age; // Поле для хранения возраста
        private int health; // Поле для хранения уровня здоровья
        private boolean isAlive; // Поле, указывающее, жив ли человек
        private static final Random rnd = new Random(); // Экземпляр Random для генерации случайных чисел

        // Конструктор класса, инициализирующий имя, возраст и здоровье
        public Person(String name) {
            this.name = name; // Устанавливаем имя
            this.isAlive = true; // Человек изначально жив
            this.age = rnd.nextInt(36) + 15; // Генерируем возраст от 15 до 50
            this.health = rnd.nextInt(91) + 10; // Генерируем здоровье от 10 до 100
        }

        // Метод для получения имени
        public String getName() {
            return name; // Возвращаем имя
        }

        // Метод для получения возраста
        public int getAge() {
            return age; // Возвращаем возраст
        }

        // Метод для получения уровня здоровья
        public int getHealth() {
            return health; // Возвращаем уровень здоровья
        }

        // Метод, возвращающий статус жизни
        public boolean isAlive() {
            return isAlive; // Возвращаем true, если человек жив
        }

        // Метод, имитирующий речь человека
        public void talk() {
            System.out.println(name + " говорит: Привет!"); // Человек говорит привет
        }

        // Метод, имитирующий действие "идти"
        public void go() {
            if (isAlive) { // Проверяем, жив ли человек
                if (health > 40) { // Если здоровье больше 40
                    System.out.println(name + " мирно прогуливается по городу."); // Человек идет
                } else {
                    System.out.println(name + " не может идти, он болен."); // Человек не может идти из-за болезни
                }
            } else {
                System.out.println(name + " не может идти, он мертв."); // Человек мертв
            }
        }

        // Метод, имитирующий действие "убить"
        public void kill() {
            isAlive = false; // Устанавливаем статус жизни в false
            System.out.println(name + " теперь мертв."); // Сообщаем о смерти
        }
    }
