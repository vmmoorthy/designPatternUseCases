package builder;

public class Main {
    public static void main(String[] args) {
        QueryBuilder queryBuilder = new QueryBuilder();

        String query1 = queryBuilder
                .select("*")
                .from("employees")
                .where("age > 30")
                .orderBy("salary DESC")
                .build();

        String query2 = queryBuilder
                .select("name, AVG(salary)")
                .from("employees")
                .groupBy("department")
                .having("AVG(salary) > 50000")
                .orderBy("name ASC")
                .build();

        System.out.println("Query 1: " + query1);
        System.out.println("Query 2: " + query2);
    }
}
