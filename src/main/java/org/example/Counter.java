package org.example;

class Counter implements AutoCloseable {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public void increment() {
        this.count++;
    }

    public void close() throws IllegalStateException {
        if (this.count == 0) {
            throw new IllegalStateException("Счетчик не используется в блоке попытки ресурса!");
        }
        System.out.println("В реестр добавлен новый питомец.");
    }
}