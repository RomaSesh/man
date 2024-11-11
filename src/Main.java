import java.util.Scanner; // Импортируем класс Scanner для чтения ввода пользователя

public class Main { // Определяем главный класс
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для считывания ввода
        Person person = null; // Экземпляр класса Person, изначально равен null
        boolean running = true; // Переменная для управления циклом

        while (running) { // Бесконечный цикл для обработки команд
            System.out.print("Введите команду: "); // Запрос команды у пользователя
            String userCommand = scanner.nextLine(); // Считываем команду

            switch (userCommand) { // Обрабатываем введенную команду
                case "exit": { // Если команда "exit"
                    running = false; // Завершаем цикл
                    break;
                }
                case "help": { // Если команда "help"
                    System.out.println("Список команд:");
                    System.out.println("---");
                    System.out.println("create_person : создать человека (экземпляр класса Person)");
                    System.out.println("kill_person : убить человека");
                    System.out.println("talk : заставить человека говорить (после создания)");
                    System.out.println("go : заставить человека идти (после создания)");
                    System.out.println("---");
                    break;
                }
                case "create_person": { // Если команда "create_person"
                    if (person != null) { // Проверяем, создан ли уже человек
                        person.kill(); // Убиваем его, если он существует
                    }
                    System.out.print("Введите имя создаваемого человека: "); // Запрос имени
                    String userName = scanner.nextLine(); // Считываем имя
                    person = new Person(userName); // Создаем нового человека
                    System.out.println("Человек успешно создан: " + person.getName()); // Сообщаем о создании
                    break;
                }
                case "kill_person": { // Если команда "kill_person"
                    if (person != null) {
                        person.kill(); // Убиваем человека
                    } else {
                        System.out.println("Сначала создайте человека с помощью команды create_person.");
                    }
                    break;
                }
                case "talk": { // Если команда "talk"
                    if (person != null) {
                        person.talk(); // Человек говорит
                    } else {
                        System.out.println("Сначала создайте человека с помощью команды create_person.");
                    }
                    break;
                }
                case "go": { // Если команда "go"
                    if (person != null) {
                        person.go(); // Человек идет
                    } else {
                        System.out.println("Сначала создайте человека с помощью команды create_person.");
                    }
                    break;
                }
                default: { // Если команда не распознана
                    System.out.println("Неизвестная команда. Введите help для получения списка команд.");
                    break;
                }
            }
        }

        scanner.close(); // Закрываем сканер
        System.out.println("Программа завершена."); // Сообщаем о завершении программы
    }
}