package com.javarush.test.level04.lesson07.task02;

/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if(n<1|n>999) return;
        Integer[] arr = new Integer[3];
        int i=0;
        Boolean prizn = Boolean.FALSE;
        if ((n%2)==0){
            prizn = Boolean.TRUE;
        }
        while(n>0){
            arr[i] = n%10;
            n = n/10;
            i++;
        }
        if(i==1){
            if (prizn){
                System.out.println("четное однозначное число");
            }else {
                System.out.println("нечетное однозначное число");
            }
        }
        if(i==2){
            if (prizn){
                System.out.println("четное двузначное число");
            }else {
                System.out.println("нечетное двузначное число");
            }
        }
        if(i==3){
            if (prizn){
                System.out.println("четное трехзначное число");
            }else {
                System.out.println("нечетное трехзначное число");
            }
        }


    }
}