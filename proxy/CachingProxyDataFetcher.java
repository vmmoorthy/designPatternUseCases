package proxy;

import java.util.HashMap;
import java.util.Map;

// Proxy class that implements caching
class CachingProxyDataFetcher implements DataFetcher {
    private RealDataFetcher realDataFetcher;
    private Map<String, String> cache;

    public CachingProxyDataFetcher() {
        realDataFetcher = new RealDataFetcher();
        cache = new HashMap<>();
    }

    @Override
    public String fetchData(String key) {
        if (cache.containsKey(key)) {
            System.out.println("Returning cached data for key: " + key);
            return cache.get(key);
        } else {
            String data = realDataFetcher.fetchData(key);
            cache.put(key, data);
            return data;
        }
    }
}
