# Getting Started

### Docker 
Build image:
docker build --tag=mathcalc:latest .

Run:
docker run match-calc:latest

Stop all containers:
docker stop $(docker ps -a -q)

### API
http://localhost:8080/add/1/2

### Kubernetes
Current context:
kubectl config --kubeconfig=C:/Users/s1092c/.kube/config current-context

Get all contexts:
kubectl config --kubeconfig=C:/Users/s1092c/.kube/config get-contexts

Get all resources:
kubectl get all --kubeconfig=C:/Users/s1092c/.kube/config

Get cluster info:
kubectl cluster-info --kubeconfig=C:/Users/s1092c/.kube/config

Run pod:
kubectl run --generator=run/v1 mathcalc --image mathcalc:latest --image-pull-policy IfNotPresent --kubeconfig=C:/Users/s1092c/.kube/config

Port forward:
kubectl port-forward mathcalc-<id> 8080:8080 --kubeconfig=C:/Users/s1092c/.kube/config
 
Delete all replication-controllers and pods
kubectl delete rc $(kubectl get rc --kubeconfig=C:/Users/s1092c/.kube/config | awk '{print $1}') --kubeconfig=C:/Users/s1092c/.kube/config
 
### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

