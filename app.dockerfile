FROM java:8
# update packages and install maven


# attach volumes
VOLUME /vol/development

# create working directory
RUN mkdir -p /vol/development
WORKDIR /vol/development

# maven exec
CMD ["./mvnw", "clean", "package", "exec:java"]