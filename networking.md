Networking Grad Hiring Event Tech Challenge 


Name:
AWS Account ID: 
Phone:
Email:


1. Download and use the attached CloudFormation JSON file in order to bring up a stack in Cloudformation.
You can bring this stack up in any AWS Region you like but you only need to make sure you have an SSH key-pair in that region. This stack creates a VPC (10.0.0.0/16) with public and private subnets. 
The first challenge is to pick the appropriate CIDR for the public subnet under the “Parameters” section. 
Choosing the right CIDR will allow you to successfully launch the Cloudformation stack that creates a public instance (can be used as a jump host and is also configured to work as a NAT Instance) and a private instance that’s in a private subnet. 





 








2.  From your machine, ping the Public IP Address of the "NAT Instance"? Why is it not working and how did you fix it? Paste in the output of ping with a few lines only. 
(Fill in the following fields) 

Reason why it wasn’t working:   
List all the steps you took to fix it:  
Output of ping: 


3.    Are you now able to SSH to the "NAT Instance"? Why not? (Fill in the following fields)

Reason why it wasn’t working:   
List all the steps you took to fix it:  


4.    Use the following command to SSH to "Private Instance" from "NAT Instance". Why can’t you SSH? How did you fix it?  
Command to ssh to the private instance: “ssh ec2-user@10.0.2.4”. Password: aws
(Fill in the following fields) 

Reason why it wasn’t working:   
List all the steps you took to fix it:  
 


5.       Are you able to Ping "Private Instance" from "NAT Instance"? Why not and how did you fix it? Is there anything else apart from Security Groups and Network ACLs that could be blocking the traffic? Paste in the output of ping with a few lines only.  (Fill in the following fields)

Reason why it wasn’t working:   
List all the steps you took to fix it:  
Output of ping: 

6.      From your Private Instance, run the command "sudo yum install httpd" 
Is the command Successful, If not why? How did you fix it? Please paste the output of “sudo service httpd start” and “history” in the output section of your answer. 

Reason why it wasn’t working:   
List all the steps you took to fix it:  
Output of “sudo service httpd start” from private instance:
Output of “history” from private instance: 
Output of “history” from public instance: 



7. Using the same VPC as a platform, 
a. Host a static web page on two instances in private subnets. Consider making your setup fault tolerant.
b. Make this website accessible through a Public facing AWS Classic Load Balancer to make it highly available. 
c. Write down the steps you took to implement this.
d. Once you’re done, paste the output of the following commands from your NAT instance:

i.	dig +short <enter-ELB-DNS-name-here>  
ii.	curl -v http://<enter-ELB-DNS-name-here>

Steps you took to implement this: 



This is the end of the Challenge. Please make sure you delete the Cloudformation stack and the ELB (Elastic Load Balancer) before you log out of your AWS accounts to prevent recurring charges. 

Please fill out a short feedback form in the next page. 

Submit Your Results
Please email this file to ...@amazon.com.
==============================================================================
 

FEEDBACK: 

1.	What did you enjoy the most on Day 1 of this event?


2.	How did you find the Tech Challenge today?


3.	Would you recommend attending a similar session to your friends?


4.	Any other comments that you’d like to add? 
