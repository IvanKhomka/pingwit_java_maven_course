package com.pingwit_java_course.part31.producer_consumer_app;

class Producer implements Runnable{

    private final Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            store.put();
        }
    }
}
