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
            userService.saveUser("Dmitry", "Ivanov", (byte) 30);
            userService.saveUser("Alex", "Kozlov", (byte) 25);
            userService.saveUser("Maqx", "Sidorov", (byte) 35);
            userService.saveUser("Jon", "Ditch", (byte) 28);

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
