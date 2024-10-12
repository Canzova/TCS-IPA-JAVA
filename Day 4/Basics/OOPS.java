// Default Access specifier
class Animal {
    int age;

    Animal() {
        System.out.println("You made an Animal");
    }

    void printAge() {
        System.out.println(this.age);
    }

    /*
     * 1. Access Specifier ---> Default
     * 2. Non static method ---> Not dependent on any object
     */
    void walk() {
        System.out.println("I am Walking");
    }
}

class Dog extends Animal {

    void speak() {
        System.out.println("Bark-Bark");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Meaun-Meaun");
    }
}

// Here in below class declarartion the access modifier is Default
class OOPS {
    public static void main(String[] args) {
        // Animal a1 = new Animal();

        Dog d1 = new Dog();
        d1.age = 12;
        d1.printAge();

        Cat c1 = new Cat();
        c1.age = 10;
        c1.printAge();

        Cat c2 = new Cat();
        c2.age = 120;
        c2.printAge();

    }
}