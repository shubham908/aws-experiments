### Deploying the spring boot app to EC2

1. Create an EC2 instance.
2. Download the private key to ssh into the instance.
3. Change the permission of the private key - `chmod 400 private-key-file.pem`
4. Copy the jar file to the EC2 - `scp -i /location-of-security-file ./generated-jar-file ec2-user@ec2.com:~`
5. SSH into the EC2.
6. Download java if not present already - `sudo yum install java 21`
7. Set the inbound rule for the Security Group of EC2.
8. Hit the API :)