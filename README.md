# Spring Boot Pagination Sample

This is a sample Spring Boot application demonstrating how to implement pagination using Spring Data JPA and H2
database.

## Features

- RESTful API for fetching Todo items.
- Server-side pagination and sorting.
- H2 In-memory database for easy setup.
- Initial data loading via `schema.sql` and `data.sql`.

## Technologies Used

- Java 21 (or compatible)
- Spring Boot 3.x
- Spring Data JPA
- H2 Database
- Lombok

## Getting Started

### Prerequisites

- JDK 21 or higher
- Maven 3.6+

### Running the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/preethaml7/spring-boot-pagination.git
   cd spring-boot-pagination
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

The application will start on `http://localhost:8080`.

## API Usage

### Fetch Paginated Todos

**Endpoint:** `GET /todos`

**Parameters:**

- `page` (optional, default: 0): The page number to retrieve.
- `size` (optional, default: 10): The number of items per page.

**Example Request:**

```bash
curl "http://localhost:8080/todos?page=0&size=5"
```

**Example Response:**

```json
{
  "content": [
    {
      "id": 1,
      "title": "Learn Spring Boot",
      "completed": false,
      "createdAt": "2024-01-01T10:00:00"
    }
  ],
  "page": {
    "size": 5,
    "number": 0,
    "totalElements": 20,
    "totalPages": 4
  }
}
```

## H2 Console

You can access the H2 console to inspect the database at:
`http://localhost:8080/h2-console`

- **JDBC URL:** `jdbc:h2:mem:testdb`
- **User Name:** `sa`
- **Password:** (empty)