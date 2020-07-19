# mars-rover
### Using technologies
- Java 11
- Spring Boot
- Spring Actuator
- Lombok
- Unit Test
- Swagger UI
- Maven

### Running in Development Environment

If your JAVA_HOME is not Java11, run terminal in project home and add this line:

```properties
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-11.0.6.jdk/Contents/Home mvn clean install
```

Start `com.mars.rover.MarsRoverApplication.java` as spring boot application in Intellij Idea.

local browser url; `http://localhost:8080/swagger-ui.html#/mars-rover-controller` 

### Build a Docker Image

`build.sh` file creates a new docker image with tag `latest`.

If you want to build a local docker image for development tests,
run `./build.sh` to generate this docker image.

### Run Docker Container (For Development Environments)

Use the following command to start a docker container 
from the image built with the command described above.

The container will be attached to your current terminal session 
and stopped and removed when you press `Ctrl + C`.

```bash
docker run \ 
    -p 8080:8080 \ 
    -t muhammed-alagoz/mars-rover
```

local browser url; `http://localhost:8080/swagger-ui.html#/mars-rover-controller`

### Example Request:

```json
{
  "grid": {
    "x": 5,
    "y": 5
  },
  "position": {
    "direction": "N",
    "x": 1,
    "y": 2
  },
  "instructions": [
    "L","M","L","M","L","M","L","M","M"

  ]
}
```
expected response:

```json
{
  "x": 1,
  "y": 3,
  "direction": "N"
}
```

