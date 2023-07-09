package Homework;

public class User {
    private String login;
    private String password;
    public Basket myBasket;

    public User(String login, String password, Basket myBasket) {
        this.login = login;
        this.password = password;
        this.myBasket = myBasket;
    }

    public User() {
    }

    User user1 = new User("qwe", "qwe", Basket.CreateBasket().get(0));
    User user2 = new User("rty", "rty", Basket.CreateBasket().get(1));
    User user3 = new User("uio", "uio", Basket.CreateBasket().get(2));
}