# CoderHack

CoderHack is a RESTful API service built using Spring Boot and MongoDB to manage leaderboards for a coding platform. It allows users to register, update their scores, and retrieve leaderboard information.

## Features

- CRUD operations for competing user registrations
- Automatic badge awarding based on user scores
- Sorting of users based on their scores
- Error handling and validation for all endpoints
- Basic JUnit tests to verify functionality

## Technologies Used

- Spring Boot
- MongoDB
- Lombok
- JUnit
- Postman (for API testing)

## Endpoints

### GET /users
- Retrieve a list of all registered users sorted by score.

### GET /users/{userId}
- Retrieve the details of a specific user by their unique user ID.

### POST /users
- Register a new user to the contest. Requires a JSON body with the username.

### PUT /users/{userId}
- Update the score of a specific user by their user ID. Requires a JSON body with the new score.

### DELETE /users/{userId}
- Deregister a specific user from the contest by their user ID.

## Usage

1. Clone the repository: `git clone <repository-url>`
2. Navigate to the project directory: `cd coder-hack`
3. Build the project: `./gradlew build`
4. Run the application: `./gradlew bootRun`

## Testing

- Unit tests can be run using: `./gradlew test`
- Integration tests are available in the `UserControllerIntegrationTest` class.

## Postman Collection

You can test the API endpoints using the Postman collection provided below:

[<img src="https://run.pstmn.io/button.svg" alt="Run In Postman" style="width: 128px; height: 32px;">](https://app.getpostman.com/run-collection/12734353-29b468de-038d-4cb1-aa47-6e673eeb9fe1?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D12734353-29b468de-038d-4cb1-aa47-6e673eeb9fe1%26entityType%3Dcollection%26workspaceId%3Deb6039ff-527d-4e42-a8c0-36baf4ffd0b0)

## Contributing

Contributions are welcome! Please open an issue or submit a pull request with any improvements or fixes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
