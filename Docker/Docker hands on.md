# Docker Session
In docker we run and image as a container. A container when running can be view as a process.

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

Exposing a service:
```bash
docker run -it -d --name web2 -p 8081:80 -v /idli:/usr/local/apache2/htdocs httpd
```
In this command we have few options

1. -p : assigns the port. In this the 8081 is the localhost port and 80 is the port internal to the container i.e. the container httpd. The syntax is host_ip:host_port:container_port
2. -v : It is used for volume mapping 

Docker Commit
Make a new image from an already running container.