package com.company;

public class Main {

    public static void main(String[] args) {
	Human student = new Human("Urszula", "Karsznia", 32);
    Human teacher = new Human("Łukasz", "Karsznia", 30);
    Animal dog = new Animal ("piesu");
    Animal dog2 = new Animal("pieseczek");
    dog.takeForAWalk();
    dog.takeForAWalk();
    dog.takeForAWalk();
    dog.takeForAWalk();
    dog.takeForAWalk();
    dog.takeForAWalk();
    dog.feed();
    System.out.println("----------------------------------------------");
    Animal cat = new Animal("kotecek");
    cat.feed();
    cat.feed();
    cat.feed();
    cat.takeForAWalk();
    cat.takeForAWalk();
    cat.takeForAWalk();
    cat.takeForAWalk();
    cat.takeForAWalk();
    cat.takeForAWalk();
    cat.takeForAWalk();
    cat.takeForAWalk();
    System.out.println("----------------------------------------------");
    student.setPet(dog);
    System.out.println(student.getPet().species);
    student.pet.feed();
    student.pet.takeForAWalk();
    System.out.println("----------------------------------------------");
    teacher.setPet(dog2);
    System.out.println(teacher.getPet().species);
    teacher.pet.feed();
    teacher.pet.takeForAWalk();
    }
}
