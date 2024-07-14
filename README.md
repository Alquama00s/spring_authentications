# Spring Authentications

This repository contains three separate Spring projects demonstrating various authentication mechanisms:
1. `authentication`: Demonstrates basic authentication.
2. `oauth_auth`: The Spring authorization server for OAuth2.
3. `resource_server`: The resource server for OAuth2.

## Projects Overview

### 1. Authentication
This project demonstrates how to implement basic authentication using Spring Security.

#### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/spring_authentications.git
   cd spring_authentications/authentication
   ```
2. Build the project:
   ```bash
   mvn clean install
   ```
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

#### Usage
- Access the application at `http://localhost:8080`.
- Use the following credentials to log in:
  - Username: `user`
  - Password: `password`

### 2. OAuth Authorization Server (oauth_auth)
This project sets up an OAuth2 Authorization Server using Spring Authorization Server.

#### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/spring_authentications.git
   cd spring_authentications/oauth_auth
   ```
2. Build the project:
   ```bash
   mvn clean install
   ```
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

#### Usage
- The authorization server will be available at `http://localhost:9000`.
- Configure your OAuth2 clients and users in the application properties or in the database.

### 3. Resource Server (resource_server)
This project sets up a Resource Server that validates tokens issued by the OAuth2 Authorization Server.

#### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/spring_authentications.git
   cd spring_authentications/resource_server
   ```
2. Build the project:
   ```bash
   mvn clean install
   ```
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

#### Usage
- The resource server will be available at `http://localhost:8000`.
- Use a valid OAuth2 token to access protected resources.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contributing
Feel free to submit issues and pull requests. For major changes, please open an issue first to discuss what you would like to change.

## Contact
feel free to connect contact.alquama@gmail.com.
