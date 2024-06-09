package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();


            // Создание таблицы User(ов)
            userService.createUsersTable();

            // Добавление 4 User(ов)
            userService.saveUser("Дмитрий", "Иванов", (byte) 30);
            userService.saveUser("Алексей", "Козлов", (byte) 25);
            userService.saveUser("Макс", "Сидоров", (byte) 35);
            userService.saveUser("Егор", "Гогов", (byte) 28);

            // Получение всех User(ов) и вывод в консоль
            for (User user : userService.getAllUsers()) {
                System.out.println(user);
            }

            // Очистка таблицы User(ов)
            userService.cleanUsersTable();

            // Удаление таблицы User(ов)
        userService.dropUsersTable();
        }
    }
