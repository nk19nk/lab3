package ru.krivonosova.cities;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<City> destinations;
    private List<Integer> costs;

    String setName(String name) {
        this.name = name;
        return this.name;
    }

    public String getName() {
        return this.name;
    }
    List<City> setDestinations(List<City> destinations) {
        if (destinations == null) {
            throw new IllegalArgumentException("Список городов не может быть null");
        }
        this.destinations = destinations;
        return this.destinations;
    }
    List<City> getDestinations(){
        return this.destinations;
    }
    List<Integer> setCosts(List<Integer> costs) {
        if (costs == null) {
            throw new IllegalArgumentException("Список стоимости дорог не может быть null");
        }
        this.costs = costs;
        return this.costs;
    }
    List<Integer> getCosts(){
        return this.costs;
    }

    public City(String name) {
        this.name = name;
        this.destinations = new ArrayList<>();
        this.costs = new ArrayList<>();
    }

    public City(String name, List<City> destinations, List<Integer> costs) {
        this.name = name;
        this.destinations = new ArrayList<>();
        this.costs = new ArrayList<>();
        if (destinations.size() == costs.size()) {
            this.destinations.addAll(destinations);
            this.costs.addAll(costs);
        } else {
            throw new IllegalArgumentException("Количество городов и стоимостей должно совпадать.");
        }
    }

    public void addRoute(City destination, int cost) {
        if (destination == null) {
            throw new IllegalArgumentException("Город назначения не может быть null.");
        }
        if (cost <= 0) {
            throw new IllegalArgumentException("Стоимость дороги должна быть положительным числом.");
        }
        if (destination == this) {
            throw new IllegalArgumentException("Нельзя добавить дорогу к самому себе.");
        }
        // Проверка на существование пути к этому городу
        int index = destinations.indexOf(destination);
        if (index != -1) {
            // Если дорога существует, обновляем её стоимость
            costs.set(index, cost);
        } else {
            // Иначе добавляем новый путь
            destinations.add(destination);
            costs.add(cost);
        }
    }

    public void removeRoute(City destination) {

        if (destination == null) {
            throw new IllegalArgumentException("Город назначения не может быть null.");
        }
        int index = destinations.indexOf(destination);
        if (index != -1) {
            destinations.remove(index);
            costs.remove(index);
        } else {
            System.out.println("Дорога к городу " + destination.getName() + " не существует.");
        }
    }

    public String toString() {
        StringBuilder rez = new StringBuilder();
        rez.append("Из города ").append(name);

        if (destinations.isEmpty()) {
            rez.append(" нет доступных дорог\n");
        } else {
            rez.append(" есть дороги в города\n");
            for (int i = 0; i < destinations.size(); i++) {
                rez.append(" ").append(destinations.get(i).getName()).append(" за ").append(costs.get(i)).append("\n");
            }
        }
        return rez.toString();
    }
}

