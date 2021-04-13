package com.company;

//public class Main {
// public static void main(String args[]) {
//     String str = new String("I am andrew");
//    int count = 0;
//     for(int i = 0; i<str.length(); i++) {
//         count++;
//    }
//     System.out.println("Number of symbols: "+count);
//  }
//}

//5. Створіть метод, який дозволяє видаляти всі елементи в масиві int[] , які мають певне значення, наприклад дорівнюються 23. Масив без видалених елементів повинен повертатися, як результат роботи методу.

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Травень");
        Main buffer1 = new Main();
        System.out.println(buffer1.Reverse(buffer.toString()));
        int a = buffer1.Summa();
        System.out.println();
        int [] array = {0,1,2,3,4,5,6,7,8,9};
        buffer1.Delete(array,3);
        System.out.println(buffer1.Delete(array,3));
        String stroka = "Андрей любит программировать";
        buffer1.Convert(stroka);
        System.out.println( buffer1.Convert(stroka));
    }
    public void one(){
        System.out.println("123");
    }
    public String Delete(int[] array, int delete_element) {


        showArray(array);

        int countDel= countDelElement(array, delete_element);
        int [] result = new int[array.length-countDel];
        int counter = 0;
        for (int k = 0; k < array.length; k++) { //здвигаємо наступні елементи
            if(array[k]==delete_element){
                //counter  = counter == 0? 0 : counter -1;
                continue;
            }
            else{
                result[counter] = array[k];
                counter ++;
            }
        }
        for (int j = 0; j < array.length; j++) {         //вивід елементів
            System.out.print(array[j] + " ");
            System.out.println("");
        }
        return Arrays.toString(result);
    }

    private int countDelElement(int[] array, int delete_element) {
        int countDelElement=0;
        for (int j = 0; j < array.length; j++) { //пошук елементу, який видаляємо
            if (array[j] == delete_element)
                countDelElement++;
        }
        return countDelElement;
    }

    private void showArray(int[] array) {
        // вивід елементів
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
            System.out.println("");}
    }

//11.Створіть метод, який знаходить суму цифр будь якого числа int

    public int Summa() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while(n!=0){
            sum +=(n%10);
            n/=10;
        }
        System.out.println(sum+"");
        return sum;
    }
    //18. Створіть метод, який  приймає два параметри типу String та повертає кількість повних повторів одного слова літерами другого.
// Приклад- слово =він= можливо набрати три рази літерами , які  є у рядку  =ннніііввввукег=
    public void repeat( String word, String someStr){
        int repeats = 0;
        int[]arrRepeats = new int[word.length()];
        int minRepeats;
        for (int j=0; j <word.length();j++){
            for(int i =0; i <someStr.length();i++){
                if(word.charAt(j) == someStr.charAt(i)){ // перевіряємо чи є відповідна літера у рядку
                    repeats ++;
                    arrRepeats[j] = repeats;
                }
            }
            repeats = 0; // обнуляємо кількість повторів
        }
        minRepeats =arrRepeats[0];
        for(int i =1; i<arrRepeats.length;i++){
            if(minRepeats>arrRepeats[i]){  // знаходимо мінімальне
                minRepeats=arrRepeats[i];
            }
        }
        System.out.println("Слово " + word + "можливо набрати" + minRepeats + "раз літерами, які є у рядку: " +someStr);
    }


    //19.Створіть метод, який перевертає будь яке слово. Наприклад- на вході травень на виході ьневарт
    public String Reverse(String str) {
        StringBuffer buffer = new StringBuffer("Травень");
        buffer.reverse();
        return buffer.toString();
    }
    public String Convert(String stroka){
        String result = "";
        for(int i = 0; i < stroka.length();i++){
            if(Character.isLowerCase(stroka.charAt(i))){
                result = result + String.valueOf(stroka.charAt(i)).toUpperCase();
            }
            else{
                result = result + String.valueOf(stroka.charAt(i)).toLowerCase();
            }
        }
        return result;
    }
}
