package com.nus.quiz.q0529;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Cooper Liu
 * @Description:
 * @Date: Created at 10:14 2023/5/29
 * @Modified by:
 */
public class AnimalSingers {
    private List<Animal> animals;

    public AnimalSingers() {
        this.animals = new ArrayList<>();
    }

    public void addSinger(Animal animal) {
        animals.add(animal);
    }

    public void sayHi() {
        for (Animal animal: animals) {
            animal.makeSound();
        }
    }
}
