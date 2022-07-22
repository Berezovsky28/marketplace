package shop;

import shop.db.DataGenerator;
import shop.db.Storage;
import shop.service.impl.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        DataGenerator generator = new DataGenerator();
        storage.products = generator.generateProducts();
        storage.users = generator.generateUsers();

        UserServiceImpl userService = new UserServiceImpl();
        userService.displayUsersAll();
        System.out.println(userService.getUserById(22222L));

    }
}
