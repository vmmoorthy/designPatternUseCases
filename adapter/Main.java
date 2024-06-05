package adapter;

public class Main {
    public static void main(String[] args) {
        // Using JSON data
        DataProcessor jsonAdapter = new DataFormatAdapter("json");
        jsonAdapter.processData("{ \"name\": \"John\", \"age\": 30 }");

        // Using XML data
        DataProcessor xmlAdapter = new DataFormatAdapter("xml");
        xmlAdapter.processData("<person><name>Jane</name><age>25</age></person>");
    }
}
