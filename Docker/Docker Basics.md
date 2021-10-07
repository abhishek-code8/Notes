# Docker
Docker is an open source containerization platform. It is used to build, deploy and run applications. It enables you to detatch your application from you infrastructure that makes it easy to scale and deploy applications.
Docker allows you to package and run an application in a loosely isolated environment called container. This isolation allows you to run multiple container at the same time. They are independent of the host and carry everything needed to run the application.
## Containers
Containers are the unit for distributing and testing your application. Containers once created can be deployed on any platform. It can be local, cloud or hybrid between the two.
- Advantages of Containers
    - Fast
    - Consistent Delivery
    - Great for CI/CD
    - Portable
    - More efficient than VM based approach. Requires less compute power to run.
## Docker Architecture
Architecture
- Client Server Architecture - Docker Client and Docker Deamon
- They communicate through Unix sockets or network using REST APIs 
- `Docker Deamon` : It handles the request from the client. It manages docker images,containers, network and volumes
- `Docker Client` : It is used to make request to docker deamon. It is the primary way the user interacts with docker.
- `Docker Registry` : It is the place where all the images are present. DockerHub is the default registry for docker. You can have your own registry. When we do a pull or run, it looks up the registry for that image.

### Docker Images
Docker image is a template for instruction to create a container. They contain all the packages, dependencies and  application files. It is an artifact that can be taken around and shared. To make a docker image you can do that with a docker file. Read-only. They

### Docker Containers
Container is a runable instance of an Image. Attatch storages, connect them to network and do much more. You can start, create, delete, stop and move a docker container. A container properties are based on the image. We can also specifiy any option at the time the container is spun.

### Namespace
Docker uses namespace, which is a feature of linux. Namespace lets docker isolate all the container running on the same hardware. It ensures portability and containers do not affect the underying OS.



---
## References
https://www.interviewbit.com/docker-interview-questions/
https://docs.docker.com/get-started/overview/