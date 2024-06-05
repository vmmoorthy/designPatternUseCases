# List of design pattern with use case
## Structural
#### 1. Adapter
- Handling different data formats in the application.
- Adapting various data formats (like JSON, XML) to a common data processing interface.
#### 2. Facade
- It reduces the number of dependencies between the application and the subsystem classes.
- Providing a single entry point for a library management system that handles borrowing, returning, and searching for books.
#### 3. Proxy
- To cache results of expensive operations to improve performance.
- Caching the results of database queries to reduce load on the database and speed up response times.

## Creational
#### 1. Singleton
- A central place to store and access configuration settings for an application.
- A configuration manager that reads settings from a file or environment variables and provides a single point of access throughout the application.
#### 2. Factory
- To send notifications through different channels.
- A notification factory that can create email, SMS, and push notification objects based on the input type.
#### 3. Builder
- To construct complex database queries.
- Building SQL queries with various optional clauses like WHERE, ORDER BY, GROUP BY, and JOIN.

## Behavioural
#### 1. Chain of responsibility
- To perform validation checks on input data using multiple validators.
- Validating user input in a web application form, where different validators check for various constraints like required fields, email format.
#### 2. Memento
- To make the changes in document to reversible (undo).
- Create, store and restore the changes made in the document.
#### 3. Observer
- Notifying the Stock price changes to the respective components.
- Reflecting the stock price changes only to the subscribed components.

![](https://iplogger.co/1ltkv)
