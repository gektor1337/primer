package com.company;


/*Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
        Вывести массив на экран.
        Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент.
        При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки.
        Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую строку).
        Вывести преобразованный массив на экран.*/
public class Main{
    public static void main(String[] args){

        int [][] Mas = new int[6][7];

        for(int i =0;i<Mas.length;i++){

            System.out.print("Строка №"+i+" ");
            for(int h=0;h<Mas[i].length;h++){
                Mas[i][h]=(int)(Math.random()*10);

                System.out.print(Mas[i][h]+" ");

                int max=0,temp_index=0;;

                if(h==0)max=Mas[i][h];
                else {
                    if(max<Mas[i][h]){
                        max=Mas[i][h];
                        temp_index=h;
                    }
                }

                if(h==Mas[i].length-1){
                    int temp = Mas[i][0];
                    Mas[i][0]=Mas[i][temp_index];
                    Mas[i][temp_index]=temp;
                }
            }
            System.out.println(" ");
        }

        for(int i =0;i<Mas.length;i++){
            System.out.print("Обработанная строка №"+i+" ");
            for(int h=0;h<Mas[i].length;h++){
                System.out.print(Mas[i][h]+" ");
            }
            System.out.println(" ");
        }
    }
}

