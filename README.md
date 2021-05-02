# home-test
Hi!, i'm Angel Cordova and this is my repository to save the home-test project created to AMA Soluciones

To begin, let's explain a little how to install all the things and run the app

-First, download the zip of this repository or clone it in your local computer

-Second, use the mySQL Workbench app to execute the TRANSAQ SQL and follow the instructions there to create the database succesfully. If you don't have the desktop app of mySQL Workbench, you can install following the instructions in this video https://www.youtube.com/watch?v=OM4aZJW_Ojs


-Third, use Eclipse desktop to run the api project, this is a Maven project and it's the backend of the app, so is very important to run succesfully. Let's configure the application properties of the api (You can find the file in the following route: "api/src/main/resources/application.properties"). Then, change the url port(maybe is 3306 for your cause is the default mysql port), username and password of the api according to your credentials you have installed before with mySQL Workbench 


-Finally, open Visual Studio Code to run the front folder, it corresponds to the front end of the project, so for sure is important to run correctly. Open a new terminal and execute "npm i" to install all the needed files of npm, then execute "ng serve" to run the project. Open your browser and type the following url: "http://localhost:4200", then you can see all the project and explore the different modules. Also you can check the code and change some things to experiment this basic Angular app connecting with mysql and JAVA. If you don't have Visual Studio Code you can download and install it from "https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2021-03/R/eclipse-inst-jre-win64.exe"

Thanks to visit this repo and see you again with more projects
