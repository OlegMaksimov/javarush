package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr =new Integer[3];
        int x;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < arr.length-1; i++) {
           if (arr[i]<arr[i+1]){
               x=arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = x;
           }
        }
        if (arr[0]<arr[1]){
            x=arr[0];
            arr[0] = arr[1];
            arr[1] = x;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}
