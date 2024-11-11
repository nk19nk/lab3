import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<City> destinations;
    private List<Integer> costs;

    String setName(){
        this.name=name;
        return this.name;
    }
    String getName() {
        return this.name;
    }

    List<City> setDestinations(){
        this.destinations=destinations;
        return this.destinations;
    }
    List<City> getDestinations(){
        return this.destinations;
    }

    List<Integer> setCosts(){
        this.costs=costs;
        return this.costs;
    }
    List<Integer> getCosts(){
        return this.costs;
    }

    City(String name) {
        this.name = name;
        this.destinations = new ArrayList<>();
        this.costs = new ArrayList<>();
    }

    public void addRoute(City destination, int cost) {
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
        int index = destinations.indexOf(destination);
        if (index != -1) {
            destinations.remove(index);
            costs.remove(index);
        }
    }

    public String toString() {
        StringBuilder rez = new StringBuilder("Из города " + name + " можно попасть в города:" + "\n");
        for (int i = 0; i < destinations.size(); i++) {
            rez.append(destinations.get(i).getName()).append(" : ").append(costs.get(i)).append("\n");
        }
        return rez.toString();
    }
}

