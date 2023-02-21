Screen Shots:

Task1: Create a virtual network with 2 subnets. Each subnet should have 16 Ips only.

Creating Virtual Network: (Details)
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/cncreation1.png)

 
2 subnet creation of 16Ips only: 
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/vncreation2-2subnet16ipscreated.png)
 




Virtual Network (review & create)
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/vncreation3-reviewandcreate.png)
 
Virtual Network successfully deployed:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/vnetcreation4-createdsuccesfully.png) 






Task 2: Inside one of the subnets, create a VM and deploy an application code inside it and it should leverage the database on the cloud (any existing application created by you before)


Creating Virtual Machine: 
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/vmcreation1Screenshot%202023-02-21%20140620.png)
 

![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/vmcreatin2.png)
 
Setting up the admin account of virtual machine:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/vmcreatin3.png)
 
Successfully deployed virtual machine:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/vmcreatin4-successful.png)
 

azure mysql Database Overview : 
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/db-created-overview.png)
 
Setting server firewall of DB: 
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/db-set-firewall.png)
 

Database schema: 
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/db-table.png)
 

Connecting springBoot project to azure mySql: 
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/application.yml-springboot-azuresql.png)
 
Connected to Virtual Machine via Putty: 
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/sucessfully-login-vm.png)

 

Successfully Deployed and application Log on VM: 
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/sucessfully-deploy-on-VM.png)
 

Task3: Deploy the same application to Azure App Service. It should also leverage the database on the cloud


Created App Service: 

![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/createApp.png)
 
Configuring Github repo to app Service: 
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/createApp-githubaction.png)
 
App-service deployed successfully :
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/service-ccreated-succesfully.png)
 
Overview of App-service: 
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/overviewpage.png)
 
Github action Build and deploy on app-service: 
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/github-build-and-deploy-success.png)
 
Service running on provide app service URL:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/url-output.png)

 
Task4: Create the AKS cluster (2 nodes, smallest size VM) and deploy any two services on it. Services should be accessible from the internet.


Creating AKS:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/create%20kubernetes%20cluster.png)
 
Creating 2 node in AKS:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/create%20kubernetes%20cluster2.png)
 
AKS Newtworking: 
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/create%20kubernetes%20cluster3.png)
 
AKS review & create: 
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/create%20kubernetes%20cluster4.png)
 
AKS deployed successfully:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/clustercreatesuccess5.png)
 
Service created and pods are running: 
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/with%20runnung%20single%20pod.png)
 

Task4: Create an Azure function that should trigger as soon as you upload a file in the blob storage. Function should be able to print the name of the file uploaded in the function.


Creating Storage account:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/storagecreated1.png)
 
Storage account review & create:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/storagecreated1.5.png)
 
Storage account created successfully:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/stragecreatedsuccesfully2.png)
 
Function App creation:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/functioncreating1-region-westeurope.png)
 
Function App review and create:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/functioncreating2-region-westeurope.png)
 
Function app Successfully deployed:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/functioncreatsuccesfully3.png)
 
Creating a blob Trigger Function and mapping to Storage account:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/storagemappingtoFunction.png)
 
BlobTrigger Function created:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/blobtriggercreated.png)
 
Container creation in storage account: 
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/containerCreatedinStorageaccount.png)
 
File uploaded to container:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/fileuploadedinContainer.png)
 
Triggered the function:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/triggering%20the%20function.png)
 

Final function got triggered and Output Accepted:
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/finalout202Accepted.png)
 

