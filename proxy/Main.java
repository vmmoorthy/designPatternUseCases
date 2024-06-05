package proxy;

public class Main {
    public static void main(String[] args) {
        DataFetcher dataFetcher = new CachingProxyDataFetcher();

        // Fetching data for the first time (should hit the database)
        System.out.println(dataFetcher.fetchData("1"));
        System.out.println(dataFetcher.fetchData("2"));

        // Fetching data again (should return cached data)
        System.out.println(dataFetcher.fetchData("1"));
        System.out.println(dataFetcher.fetchData("2"));

        // Fetching data for a key not in the cache (should hit the database)
        System.out.println(dataFetcher.fetchData("3"));
    }
}
