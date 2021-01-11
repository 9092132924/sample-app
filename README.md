# sample-app

In this application technologies used

java 8
springboot
Spring batch
jpa
H2DB
Rest


To access H2 Db use the below URL
    http://localhost:8080/h2-console/login.do?jsessionid=c129e8ada497ffd355d4cd8e3e5c796c

    login credentials not required


API need to run in local before showing demo

    http://localhost:8080/invokejob

    this will read data from csv and persist into H2DB 

After u can run the below api line to get the corresponding adress from the Database layer

    http://localhost:8080/api/getAddress?address="write some ddress here"
    
Docker file created commands to run once Docker setup is done in local

      docker build . -t sample-app
      docker run -d  -p 8080:8080 --name sample-app  sample-app:latest
      
      application will start running on 8080
      
      you can access localhost:8080
      
      


