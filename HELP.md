# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/#build-image)

**if plan to work with just docker file use below command 
**use git clone command to copy this code ****

$git clone https://github.com/sachinsagare/dockerDemo

$cd dockerDemo

# run below command to create docker image (don't forgot to add . at the end of command 
$docker build -f dockerfile -t dockerdemo .

**if need to work using docker compose use below command 
$docker-compose up -d
