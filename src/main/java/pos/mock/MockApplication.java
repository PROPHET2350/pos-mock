package pos.mock;

import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MockApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockApplication.class, args);
    }

    @Bean
    CommandLineRunner init(
            ProductsRepository productsRepository,
            UsersRepository usersRepository,
            CategoryRepository categoryRepository,
            ClientRepository clientRepository
    ) {
        Faker faker = new Faker();
        productsRepository.deleteAll();
        return args -> {
            for (int i = 0; i < 100; i++) {
                var name = faker.food().fruit();
                var price = faker.number().numberBetween(5, 100);
                var stock = faker.number().numberBetween(5, 100);
                var category = faker.number().numberBetween(0, 5);
                var img = i % 2 == 0 ? null : faker.avatar().image();
                var code = faker.code().isbn10();
                Products p = new Products(i + 1L, name, price, stock, category, img, code);
                productsRepository.save(p);
            }
            Company c = new Company("BBF","1756453498001",faker.phoneNumber().phoneNumber(),faker.internet().emailAddress(),faker.address().city(),true);
            Users u1 = new Users(1, faker.name().fullName(), "user1", "user1", true, true, c);
            Users u2 = new Users(2, faker.name().fullName(), "user2", "user2", false, true, c);
            Users u3 = new Users(3, faker.name().fullName(), "user3", "user3", true, false, c);
            usersRepository.save(u1);
            usersRepository.save(u2);
            usersRepository.save(u3);
            Category c1 = new Category(1L, "Comida", null);
            Category c2 = new Category(2L, "Comida", faker.avatar().image());
            Category c3 = new Category(3L, "Comida", faker.avatar().image());
            categoryRepository.save(c1);
            categoryRepository.save(c2);
            categoryRepository.save(c3);
            Client client = new Client(1L,"1757568637",faker.name().fullName(), faker.phoneNumber().phoneNumber(),faker.internet().emailAddress(),faker.address().city());
            clientRepository.save(client);
        };
    }

}
