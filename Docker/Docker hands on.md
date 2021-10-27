# Docker Session
In docker we run and image as a container. A container when running can be view as a process.
### Basic Commands
To view docker images and containers
``` bash
docker ps
docker images
docker ps -a
```

Docker run

When spinning a continer we can have multiple options based on the need and image we are using.
```bash
docker run -it -d --name pizza -e MYSQL_PASSWORD=123 docker.io/mysql:latest

docker exec -it pizza bash
```
- The exec will let you go inside the docker container.
- `-d` is for detached mode. It make the container run in the background
- `-e` is used to given environemnt variables for the container.

Exposing a service and attatching a persistance volume:
```bash
docker run -it -d --name web2 -p 8081:80 -v /idli:/usr/local/apache2/htdocs httpd
```
In this command we have few options

1. -p : assigns the port. In this the 8081 is the localhost port and 80 is the port internal to the container i.e. the container httpd. The syntax is host_ip:host_port:container_port
2. -v : It is used for volume mapping 

Docker Commit

Make a new image from an already running container.

### Docker file

Docker file let you create your application in a docker image. It contains a set of instruction that are needed to dockerize your application

Steps to write a Dockerfile:

1. Docker file is named as 'Dockerfile", with nothing as extension. It should match this name.
2. We start with a base image. Generally it is a linux image. Then we build upon it. We write docker file systax in capital letters
3. We can run commands now accordingly as same on Bash, with the help of keyword 'RUN'.

Example of a Dockerfile: This application is an anguler project

```
# Stage 1: Compile and Build angular codebase

# Use official node image as the base image
FROM node:latest as build

# Set the working directory
WORKDIR /usr/local/app

# Add the source code to app
COPY ./ /usr/local/app/

# Install all the dependencies
RUN npm install

# Generate the build of the application
RUN npm run build


# Stage 2: Serve app with nginx server

# Use official nginx image as the base image
FROM nginx:latest

# Copy the build output to replace the default nginx contents.
COPY --from=build /usr/local/app/dist/your-app-name /usr/share/nginx/html

# Expose port 80
EXPOSE 80
```

Docker Tag and Push

To tag an image with different name/repo
```
docker tag SOURCE_IMAGE[:TAG] TARGET_IMAGE[:TAG]
```
Docker push will let you push your image to a docker repo, in this case dockerhub
```
docker push REPONAME/IMAGE_NAME[:TAG]
```
-