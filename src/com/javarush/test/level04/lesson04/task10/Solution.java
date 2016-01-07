package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int x,y,z;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(reader.readLine());
        y = Integer.parseInt(reader.readLine());
        z = Integer.parseInt(reader.readLine());
        if(x==y){
            if (y==z){
                System.out.println(x+" "+y+" "+z);}
            else{
            System.out.println(x+" "+y);}
        }
        else{
            if (y==z) System.out.println(y+" "+z);
            if (x==z) System.out.println(x+" "+z);
        }


    }
}