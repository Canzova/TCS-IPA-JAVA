import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Engine arr[] = new Engine[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();

            String type = sc.nextLine();

            double price = sc.nextDouble();

            Engine obj = new Engine(id, name, type, price);

            arr[i] = obj;
        }
        sc.nextLine();

        String engineType = sc.nextLine();
        String engineName = sc.nextLine();


        int  avg = findAvgEnginePriceByType(arr, engineType);
        if (avg == 0) {
            System.out.println("There are no engine with give type");
        } else {
            System.out.println(avg);
        }

        Engine result[] = searchEngineByName(engineName, arr);

        if (result == null) {
            System.out.println("There are no enginee with the given type");
        } else {
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i].getEngineId());
            }
        }

        sc.close();
    }

    public static Engine[] searchEngineByName(String name, Engine arr[]) {

        ArrayList<Engine> tempAns = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getEngineName().equalsIgnoreCase(name)) {
                tempAns.add(arr[i]);
            }
        }
        int n = tempAns.size();

        if (n == 0)
            return null;

        Collections.sort(tempAns, (a, b) -> {
            return a.getEngineId() - b.getEngineId();
        });

        Engine ans[] = tempAns.toArray(new Engine[n]);

        return ans;

    }

    public static int findAvgEnginePriceByType(Engine arr[], String type) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getEngineType().equalsIgnoreCase(type)) {
                sum += arr[i].getEnginePrice();
                count++;
            }
        }
        if (count == 0)
            return 0;

        return sum / count;
    }
}

class Engine {
    private int engineId;
    private String engineName;
    private String engineType;
    private double enginePrice;

    public String getEngineName() {
        return this.engineName;
    }

    public int getEngineId() {
        return this.engineId;
    }

    public double getEnginePrice() {
        return this.enginePrice;
    }

    public String getEngineType() {
        return this.engineType;
    }

    Engine(int id, String name, String type, double price) {

        this.engineId = id;
        this.engineName = name;
        this.engineType = type;
        this.enginePrice = price;

    }
}