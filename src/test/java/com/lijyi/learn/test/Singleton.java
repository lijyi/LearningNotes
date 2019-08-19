package com.lijyi.learn.test;

/**
 * @author liyang
 * @date 2019-08-16
 */
public class Singleton {

    private Singleton(){

    }

    public Singleton getInstance(){
        return SingletonEnum1.INSTANCE.getInstance();
        //return SingletonEnum2.INSTANCE.getInstance();
    }

    private enum SingletonEnum1 {
        INSTANCE;

        private Singleton singleton;

        private SingletonEnum1(){
            singleton = new Singleton();
        }

        public Singleton getInstance(){
            return singleton;
        }
    }

    private enum SingletonEnum2 {
        INSTANCE(new Singleton())
        ;

        private Singleton singleton;

        SingletonEnum2(Singleton singleton) {
            this.singleton = singleton;
        }

        public Singleton getInstance(){
            return singleton;
        }

    }

}
