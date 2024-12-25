package org.example;

public class Person {
    String firstname;
    String lastname;
    String surname;
    String post;
    String email;
    String phone;
    double salary;
    int age;

    public Person(String firstname, String lastname, String surname, String post, String email,
                  String phone, double salary, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.surname = surname;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void infoPerson() {
        System.out.println("Фамилия: " + firstname);
        System.out.println("Имя: " + lastname);
        System.out.println("Отчество: " + surname);
        System.out.println("должность: : " + post);
        System.out.println("Рабочая почта: " + email);
        System.out.println("Номер телефона: " + phone);
        System.out.println("Зарпалата: " + salary);
        System.out.println("Возраст: " + age);

    }


}