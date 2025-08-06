

 1. Create and run a simple pod named "mypod" using nginx
# kubectl run mypod --image=nginx --port=80 --restart=Never

 2. Check that the pod is running
# kubectl get pods

 3. Expose the pod as a NodePort service on port 80
# kubectl expose pod mypod --type=NodePort --port=80

 4. Check the service details and find the NodePort assigned
# kubectl get svc mypod

 (Optional) Access your pod’s nginx server at 
 # http://<Node-IP>:<NodePort>

5. When done, delete the pod
# kubectl delete pod mypod

 6. Delete the service
# kubectl delete svc mypod
