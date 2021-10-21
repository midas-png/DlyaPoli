package UchiJavu;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UchiJavuBlya {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 4, 2, 4, 5, 5, 5, 4};
        int[] array2 = {6, 4, 3, 2, 5, 4, 1, 5, 1, 4};
        System.out.println(isSimilar(array1, array2));
    }

    public static boolean isSimilar(int[] arr1, int[] arr2){
        int[] fSortArray = arr1.clone();
        int[] sSortArray = arr2.clone();
        Arrays.sort(fSortArray);
        Arrays.sort(sSortArray);

        if(fSortArray[0] == sSortArray[0])
            return true;

        return false; // Я отсортировал входящие массивы и сравнил первые элементы массива, если одинаковы - true, иначе false.
        // Сортировку можешь написать свою, например, сортировка пузырьком, будет тот же результат.
    }

    public static int count11(String value){
        String regex = "11"; // Элемент, который нужно найти
        int count = 0;

        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(value);

        while (matcher.find()) { // Пока есть совпадения по регулярным выражениям - счетчик увеличиваем на 1
            count++;
        }

        return count;
    }
}

