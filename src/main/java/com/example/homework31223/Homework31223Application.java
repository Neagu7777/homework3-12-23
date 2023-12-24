package com.example.homework31223;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Homework31223Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework31223Application.class, args);
    }

}
/*
1) Добавьте новый API в контроллер, который бы выводил список всех возможных людей

2) Добавьте новую реализацию сервиса, теперь рекомендоваться будет человек с
        самым коротким именем

3) В сервис добавьте private int переменную-поле, в которую записывайте +1 каждый раз,
        когда запускается этот сервис.


Научитесь в PostMan запускать множество запросов подряд,
выставьте минимальную задержку в запросах  и запустите гигантское количество запросов.
Посмотрите, равно ли значение переменной количеству выполненных запросов (с некоторым,
правда, минимальным шансом, значение может отличаться). С чем это может быть связано?

 */