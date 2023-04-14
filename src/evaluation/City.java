package evaluation;

import java.util.ArrayList;
import java.util.Scanner;

public class City {
    private final String name;
    private final int population;
    public City(String name, int population){
        this.name = name;
        this.population = population;
    }

    public int getPopulation(){
        return population;
    }

    public String getCity(){
        return name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of city: ");
        int n = scanner.nextInt();
        ArrayList<City> cities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of city " + (i + 1));
            String o = scanner.next();
            System.out.println("Enter population of city " + (i + 1));
            int p = scanner.nextInt();
            City city = new City(o, p);
            cities.add(city);
        }
        City highPopulatedCity = cities.get(0);
        for (int i = 1; i < n; i++) {
            if (cities.get(i).getPopulation() > highPopulatedCity.getPopulation()) {
                highPopulatedCity = cities.get(i);
            }
        }
        System.out.println("The high populated city is " + highPopulatedCity.getCity() + " with a population of " + highPopulatedCity.getPopulation());
    }
}
