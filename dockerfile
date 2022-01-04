# pull base image.

FROM java:8
EXPOSE 8080
ADD /target/dockerDemo.jar dockerDemo.jar
ENTRYPOINT ["java","-jar","dockerDemo.jar"]

# maintainer
MAINTAINER "sachin.sagare@gmail.com"

# update packages and install maven
#-sachin Commnent1
#RUN  \
  #export DEBIAN_FRONTEND=noninteractive && \
  #sed -i 's/# \(.*multiverse$\)/\1/g' /etc/apt/sources.list && \
  #apt-get update && \
  #apt-get -y upgrade && \
 # apt-get install -y vim wget curl maven
#-Sachin end comment1
# attach volumes
VOLUME /vol/development

# create working directory
#RUN mkdir -p /vol/development
#WORKDIR /vol/development

# maven exec
#CMD ["mvn", "clean", "package", "exec:java"]