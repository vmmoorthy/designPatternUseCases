package adapter;

// Adapter class to adapt JSON and XML processing to the DataProcessor interface
class DataFormatAdapter implements DataProcessor {
    private JsonProcessor jsonProcessor;
    private XmlProcessor xmlProcessor;
    private String format;

    public DataFormatAdapter(String format) {
        this.format = format;
        if (format.equalsIgnoreCase("json")) {
            jsonProcessor = new JsonProcessor();
        } else if (format.equalsIgnoreCase("xml")) {
            xmlProcessor = new XmlProcessor();
        }
    }

    @Override
    public void processData(String data) {
        if (format.equalsIgnoreCase("json")) {
            jsonProcessor.processJson(data);
        } else if (format.equalsIgnoreCase("xml")) {
            xmlProcessor.processXml(data);
        }
    }
}
