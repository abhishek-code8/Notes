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
- Docker Architecture
    - Client Server Architecture - Docker Client and Docker Deamon
    - They communicate through Unix sockets or network using REST APIs
    - 