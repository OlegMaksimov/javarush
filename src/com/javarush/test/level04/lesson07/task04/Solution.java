package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
//        int x1,x2=0;
        int x1=0;
        int x2 =0;
        int n;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            n = Integer.parseInt(reader.readLine());
            if (n>0){
                x1++;
            } else{
                x2++;
            }
        }
        System.out.println("количество отрицательных чисел: "+x2);
        System.out.println("количество положительных чисел: "+x1);
    }
}
