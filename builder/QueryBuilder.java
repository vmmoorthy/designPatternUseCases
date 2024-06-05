package builder;

public class QueryBuilder {
    private String table;
    private String columns;
    private String whereClause;
    private String orderByClause;
    private String groupByClause;
    private String havingClause;

    public QueryBuilder() {
    }

    public QueryBuilder select(String columns) {
        this.columns = columns;
        return this;
    }

    public QueryBuilder from(String table) {
        this.table = table;
        return this;
    }

    public QueryBuilder where(String whereClause) {
        this.whereClause = whereClause;
        return this;
    }

    public QueryBuilder orderBy(String orderByClause) {
        this.orderByClause = orderByClause;
        return this;
    }

    public QueryBuilder groupBy(String groupByClause) {
        this.groupByClause = groupByClause;
        return this;
    }

    public QueryBuilder having(String havingClause) {
        this.havingClause = havingClause;
        return this;
    }

    public String build() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT ").append(columns).append(" FROM ").append(table);
        if (whereClause != null) {
            query.append(" WHERE ").append(whereClause);
        }
        if (groupByClause != null) {
            query.append(" GROUP BY ").append(groupByClause);
        }
        if (havingClause != null) {
            query.append(" HAVING ").append(havingClause);
        }
        if (orderByClause != null) {
            query.append(" ORDER BY ").append(orderByClause);
        }
        return query.toString();
    }
}
