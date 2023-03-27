package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Opción 1. Crear un objeto de forna normal
        CalculatorServices service = new CalculatorServices();

        // Opcion 2. Recibir  un objeto de Spring
        CalculatorServices calculadora = (CalculatorServices) context.getBean("calculatorService");


        String texto = calculadora.holaMundo();
        System.out.println(texto);




    }
}
