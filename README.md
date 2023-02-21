Screen Shots:
Task1: Create a virtual network with 2 subnets. Each subnet should have 16 Ips only.
Creating Virtual Network: (Details) (cncreation1)
![alt text](https://github.com/utkarshsanju13/springboot-azuresql/blob/main/img/cncreation1.png)

 
2 subnet creation of 16Ips only: (vncreation2-2subnet16ipscreated)
 




Virtual Network (review & create)(vncreation3-reviewandcreate)
 
Virtual Network successfully deployed:( vnetcreation4-createdsuccesfully)
 






Task 2: Inside one of the subnets, create a VM and deploy an application code inside it and it should leverage the database on the cloud (any existing application created by you before)
Creating Virtual Machine: (vmcreation1Screenshot 2023-02-21 140620)
 
(vmcreatin2)
 
Setting up the admin account of virtual machine:( vmcreatin3)
 
Successfully deployed virtual machine:(vmcreatin4-successful)
 

Creating azure mysql Database:
Overview : (db-created-overview)
 
Setting server firewall of DB: (db-set-firewall)
 

Database schema: (db-table)
 

Connecting springBoot project to azure mySql: (application.yml-springboot-azuresql)
 
Connected to Virtual Machine via Putty: (sucessfully-login-vm)

 

Successful Deployment and running application Log on VM: (sucessfully-deploy-on-VM)
 

Task3: Deploy the same application to Azure App Service. It should also leverage the database on the cloud
Created App Service: (createApp)
 
Configuring Github repo to app Service: (createApp-githubaction)
 
App-service deployed successfully : (service-ccreated-succesfully)
 
Overview of App-service: (overviewpage)
 
Github action Build and deploy on app-service: (github-build-and-deploy-success)
 
Service running on provide app service URL:(url-output)
 
Task4: Create the AKS cluster (2 nodes, smallest size VM) and deploy any two services on it. Services should be accessible from the internet.
Creating AKS: (create kubernetes cluster)
 
Creating 2 node in AKS: (create kubernetes cluster2)
 
AKS Newtworking: (create kubernetes cluster3)
 
AKS review & create: (create kubernetes cluster4)
 
AKS deployed successfully: (clustercreatesuccess5)
 
Service created and pods are running: (with runnung single pod)
 

Task4: Create an Azure function that should trigger as soon as you upload a file in the blob storage. Function should be able to print the name of the file uploaded in the function.
Creating Storage account: (storagecreated1)
 
Storage account review & create: (storagecreated1.5)
 
Storage account created successfully: (stragecreatedsuccesfully2)
 
Function App creation: (functioncreating1-region-westeurope)
 
Function App review and create: (functioncreating2-region-westeurope)
 
Function app Successfully deployed: (functioncreatsuccesfully3)
 
Creating a blob Trigger Function and mapping to Storage account: (storagemappingtoFunction)
 
BlobTrigger Function created: (blobtriggercreated)
 
Container creation in storage account: (containerCreatedinStorageaccount)
 
File uploaded to container: (fileuploadedinContainer)
 
Triggered the function: (triggering the function)
 

Final function got triggered and Output Accepted: (finalout202Accepted)
 

