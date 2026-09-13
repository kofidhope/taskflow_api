# Task Flow API

A REST API for managing tasks built with Spring Boot.

## Prerequisites

* Java 17 or higher
* Maven
* Git

## Run Instructions

Clone the repository:

```bash
git clone <repository-url>
```

Navigate to the project directory:

```bash
cd task-flow
```

Run the application on Windows:

```bash
mvnw.cmd spring-boot:run
```

Or, if Maven is installed globally:

```bash
mvn spring-boot:run
```

The application will run at:

```text
http://localhost:8080
```

## Endpoint List

| Method | Endpoint                 | Description        |
| ------ | ------------------------ | ------------------ |
| POST   | `/api/tasks`             | Create a new task  |
| GET    | `/api/tasks`             | Get all tasks      |
| GET    | `/api/tasks/{id}`        | Get a task by ID   |
| PATCH  | `/api/tasks/{id}/status` | Update task status |
| DELETE | `/api/tasks/{id}`        | Delete a task      |

## Sample Requests

### Create a Task

**POST** `/api/tasks`

```http
POST http://localhost:8080/api/tasks
Content-Type: application/json
```

Request body:

```json
{
  "title": "Learn Spring Boot",
  "description": "Practice building REST APIs"
}
```

Response:

```text
201 Created
```

### Get All Tasks

**GET** `/api/tasks`

```http
GET http://localhost:8080/api/tasks
```

Response:

```text
200 OK
```

### Get Task By ID

**GET** `/api/tasks/{id}`

```http
GET http://localhost:8080/api/tasks/1
```

Response:

```text
200 OK
```

If the task does not exist:

```text
404 Not Found
```

### Update Task Status

**PATCH** `/api/tasks/{id}/status`

```http
PATCH http://localhost:8080/api/tasks/1/status
Content-Type: application/json
```

Request body:

```json
{
  "status": "COMPLETED"
}
```

Response:

```text
200 OK
```

If the task does not exist:

```text
404 Not Found
```

### Delete a Task

**DELETE** `/api/tasks/{id}`

```http
DELETE http://localhost:8080/api/tasks/1
```

Response:

```text
200 OK
```

If the task does not exist:

```text
404 Not Found
```

## Error Responses

| Status            | Description                               |
| ----------------- | ----------------------------------------- |
| `400 Bad Request` | Invalid task request                      |
| `404 Not Found`   | Task with the specified ID does not exist |
