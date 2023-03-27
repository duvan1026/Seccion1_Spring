package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Opción 1. Crear un objeto de forna normal
        Calculadora service = new Calculadora();

        // Opcion 2. Recibir  un objeto de Spring
        Calculadora calculadora = (Calculadora) context.getBean("calculatorService");


        String texto = calculadora.holaMundo();
        System.out.println(texto);




    }
}
