package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //Zadanie 2
        //tablica miast wypisanych od początku do końca
        String[] cities = new String[]{"Lodz", "London", "Rome", "Paris"};
        for (String city : cities
        ) {
            System.out.println(city);
        }

        //tablica miast wypisanych od konca do poczatku
        for (int i = cities.length - 1; i >= 0; i--) {
            System.out.println(cities[i]);

        }


        //tablica miast wypisanych co drugie miasto
        for (int i = 0; i < cities.length - 1; i = i + 2) {
            System.out.println(cities[i]);
        }
        //Zadanie 3
        // Stwórz tablicę liczb zmiennoprzecinkowych i następnie oblicz sumę oraz średnią tych liczb.
        Float[] numbers = new Float[]{1.1f, 2.3f, 4.5f, 6.5f};

        Float sum = 0f;


        for (Float number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);
        System.out.println(sum / numbers.length);


        // Zadanie 4
        //Stwórz tablicę imion (z powtórzeniami) i następnie policz, ile razy występuje w niej imię "Jan"

        String[] names = new String[]{"Wojtek", "Jan", "Kasia", "Jan", "Gabrysia", "Ola"};
        Integer licznik = 0;
        for (String name : names) {
            if (name == "Jan") {
                licznik++;
            }
        }
        System.out.println(licznik);

        //Zadanie 5
        //Stwórz tablicę imion (bez powtórzeń) i następnie podaj, na którym indexie znajduje się w niej imię "Jan".
        String[] names2 = new String[]{"Wojtek", "Kasia", "Jan", "Gabrysia", "Ola"};
        for (int i = 0; i < names2.length - 1; i++) {
            if (names2[i] == "Jan") {
                System.out.println(i);
            }
        }

        //Zadanie 6
        //Stwórz tablicę liczb całkowitych i następnie znajdź największy i najmniejszy element tej tablicy.
        Integer[] numbers2 = new Integer[]{3, 4, 5, 6, 7, 9};
        Integer biggest = numbers2[0];
        Integer smallest = numbers2[0];
        for (Integer liczba : numbers2) {
            if (liczba > biggest) {
                biggest = liczba;
            }
            if (liczba < smallest) {
                smallest = liczba;
            }
        }
        System.out.println(biggest);
        System.out.println(smallest);

    }
}
