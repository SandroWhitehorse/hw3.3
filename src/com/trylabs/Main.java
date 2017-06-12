package com.trylabs;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        int x = 355;//число для проверки
        int num = (int) log10(x)+1;//количество цифр
        int Na=0;//счетчик для первой цифры
        int Nb=0;//счетчик для второй цифры
        double i;
        int temp=0;// переменная цыфры N-й позиции

        for ( i=0;i<num;i++)
        { temp=(int)((x%Math.pow(10,i+1))/Math.pow(10,i) );
        if (temp==3) Na++;
        if (temp==5) Nb++;
            x=x-(int)(temp*Math.pow(10,i));
            
        }
        if (Na>Nb) System.out.println("3 встречается чаще чем 5 ");
        else System.out.println("5 встречается чаще чем 3 ");
    }
}
