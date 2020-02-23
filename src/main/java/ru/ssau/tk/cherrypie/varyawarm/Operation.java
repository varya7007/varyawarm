package ru.ssau.tk.cherrypie.varyawarm;

public abstract class Operation {
    abstract double apply(double number);

    double applyTriple(double number) {
        double triple = apply(apply(apply(number)));
        return triple;
    }
}
