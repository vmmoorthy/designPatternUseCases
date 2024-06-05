package proxy;

import java.util.HashMap;
import java.util.Map;

// Real subject class that performs the expensive operation
class RealDataFetcher implements DataFetcher {
    private Map<String, String> database;

    public RealDataFetcher() {
        // Simulating a database with a HashMap
        database = new HashMap<>();
        database.put("1", "Data for key 1");
        database.put("2", "Data for key 2");
        database.put("3", "Data for key 3");
    }

    @Override
    public String fetchData(String key) {
        System.out.println("Fetching data from database for key: " + key);
        return database.get(key);
    }
}
