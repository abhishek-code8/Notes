# Kubernetes
Kubernetes is an open source container orchestration engine. It lets you deploy, manage and scale your container based workloads and services. It provides you with a framework to run the distributed systems resiliently. Takes care of your scaling and failure of your application and provide development patterns.

### Feature of Kubernetes
1. Service discovery and load balancing
2. Storage Orchestration
3. Automated rollbacks and rollouts
4. Automatic bin packing, optimize load usage across workers and resources
5. Self-healing. Kill, restart and spawn new ones automatically
6. Secret and configuration management

### Components of Kubernetes
When you run kubernetes, you have a cluster. In that cluster there is a master node and n number of worker nodes. Each cluster at least containes one worker node.

Control Plane: The control Plane makes all the major decisions about the cluster and also respond to cluster events. The machine running the control plane doesn't usually run any pod.

Controller: 
#### Control Plane
- kube-apiserver: Component of the Control plane. It is the front-end of the control plane. It exposes all the apis.
- etcd: Consistent and highly available key-value store used as kubernete's backing store for all cluster data
- kuber-scheduler: Control plane component that watches for newly created pods which do not have a node and assigns them one. Takes into account a number of factors before allocating a pod to a node.
- kube-controller-manager: A control plane component that runs control processes like node controller, job controller etc.
- cloud-controller-manager: A control plane component that embeds cloud specific control logics. It lets you link your cluster to the cloud provider's api that lets you isolate cloud resources that interact with your cluster with the rest.

### Node
- kubelet: A agent that runs on each node and makes sure that the containers are running in the pod.
- kube-proxy: is a network proxy that runs on each node and enables to implement the kubernetes service concept. It maintains network rules on the nodes. These network rules enables to network communication with your pod from inside or outside the cluster.
- Container Runtime: It runs the containers inside the pods. Like Docker, containerd etc.
- cadvisor: health and monitoring of the pod.



## References
https://kubernetes.io/docs/home/