public class Main {

    public static void main(String[] args) {
//      задание из 1 урока
        Person person = new Person();

        person.firstName = "Никита";
        person.lastName = "Ноздрин";
        person.age = 27;

        person.introduce();

//      задание 1 из 2 урока - банк аккаунт
        BankAccount bankAccount = new BankAccount();

        bankAccount.setOwnerName("Nikita");
        bankAccount.setBalance(1000.0);

        System.out.println("Владелец счета - " + bankAccount.getOwnerName());
        System.out.println("Баланс счета : " + bankAccount.getBalance());

        bankAccount.setBalance(-1.0);
        System.out.println("Баланс счета : " + bankAccount.getBalance());

//      задание 2 из второго урока - конструктор Person
        Person person1 = new Person("Nikita", "Nozdrin", 28);
        person1.introduce();

        Person person2 = new Person("Oleg", "Mongol", 55);
        person2.introduce();

        Person person3 = new Person("Cristiano", "Ronaldo", 41);
        person3.introduce();

//      задание 3 из второго урока - MathHelper
        System.out.println(MathHelper.sum(11,2));
        System.out.println(MathHelper.max(20,10));
        System.out.println(MathHelper.isEven(43));

//      задание 4 из второго урока - Visitor
        Visitor v1 = new Visitor();
        System.out.println(Visitor.getTotalVisitor());
        Visitor v2 = new Visitor();
        System.out.println(Visitor.getTotalVisitor());
        Visitor v3 = new Visitor();
        System.out.println(Visitor.getTotalVisitor());
        Visitor v4 = new Visitor();
        System.out.println(Visitor.getTotalVisitor());
        Visitor v5 = new Visitor();
        System.out.println(Visitor.getTotalVisitor());

        /* Почему значение одинаковое при вызове через любой объект?
        * потому что totalVisitors - static. Одна на весь класс, а не на каждый объект.
        * Поэтому независимо от того, через какой объект вызывать - вернется одно и то же значение.
        * Даже идея сама подчеркивает и предлагает менять v1.getTotalVisitor() на Visitor.getTotalVisitor()
        * */


//      задание 5 из второго урока - Корзина товаров

        Product apple = new Product("Яблоко", 1.5);
        Product banana = new Product("Банан", 2.0);
        Product milk = new Product("Молоко", 3.2);
        Product bread = new Product("Хлеб", 2.5);

        Cart cart = new Cart();
        cart.addProduct(apple, 3);
        cart.addProduct(banana, 2);
        cart.addProduct(milk, 1);
        cart.addProduct(bread, 1);
        cart.addProduct(apple, 2);

        System.out.println("Всего товаров в корзине: " + cart.getProductCount());
        System.out.println("Стоимость товаров в корзине: " + cart.getTotalPrice());
    }

}
